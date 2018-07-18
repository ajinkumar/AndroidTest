package com.example.androidtest.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import com.example.androidtest.R;
import com.example.androidtest.api.BackendService;
import com.example.androidtest.listener.CallbackListener;
import com.example.androidtest.model.AlertDetails;
import com.example.androidtest.model.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Ajin kumar on 18/7/18.
 */

public class PopularFragment extends Fragment{

    private BackendService backendService;
    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<Entity> expandableListTitle;
    private int lastExpandedPosition = -1;

    public PopularFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        backendService = BackendService.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_popular, container, false);
        expandableListView = view.findViewById(R.id.expandableListView);

        getAllDetails();

        return view;
    }

    private void getAllDetails() {
        backendService.getAllListValues(new CallbackListener<AlertDetails>() {
            @Override
            public void onSuccess(AlertDetails value) {
                setAdapter(value.getEntity());
            }

            @Override
            public void onResponseCode(Integer code) {

            }

            @Override
            public void onError(int errorCode) {

            }
        });
    }

    private void setAdapter(List<Entity> entity) {

        expandableListTitle = new ArrayList<>();
        expandableListTitle.addAll(entity);
        final HashMap<Integer, Entity> expandableListDetail = new HashMap<Integer, Entity>();

        int i = 0;

        for (Entity entity1: entity) {
            expandableListDetail.put(i++, entity1);
        }

        expandableListAdapter = new CustomExpandableListAdapter(getActivity(), entity, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                if (lastExpandedPosition != -1
                        && groupPosition != lastExpandedPosition) {
                    expandableListView.collapseGroup(lastExpandedPosition);
                }
                lastExpandedPosition = groupPosition;
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {

            }
        });

        expandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                return false;
            }
        });
    }

}