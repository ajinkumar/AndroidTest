package com.example.androidtest.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.example.androidtest.R;
import com.example.androidtest.api.BackendService;
import com.example.androidtest.listener.CallbackListener;
import com.example.androidtest.model.AlertDetails;
import com.example.androidtest.model.Entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private BackendService backendService;

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<Entity> expandableListTitle;
    private int lastExpandedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backendService = BackendService.getInstance();

        getAllDetails();
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
        expandableListView = (ExpandableListView) findViewById(R.id.expandableListView);

        expandableListTitle = new ArrayList<>();
        expandableListTitle.addAll(entity);
        final HashMap<Integer, Entity> expandableListDetail = new HashMap<Integer, Entity>();

        int i = 0;

        for (Entity entity1: entity) {
            expandableListDetail.put(i++, entity1);
        }

        expandableListAdapter = new CustomExpandableListAdapter(this, entity, expandableListDetail);
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
