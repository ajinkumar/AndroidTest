package com.example.androidtest.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.androidtest.R;
import com.example.androidtest.model.Entity;
import com.github.curioustechizen.ago.RelativeTimeTextView;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomExpandableListAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<Entity> expandableListTitle;
    private HashMap<Integer, Entity> expandableListDetail;

    public CustomExpandableListAdapter(Context context, List<Entity> expandableListTitle,
                                       HashMap<Integer, Entity> expandableListDetail) {
        this.context = context;
        this.expandableListTitle = expandableListTitle;
        this.expandableListDetail = expandableListDetail;
    }

    @Override
    public Entity getChild(int listPosition, int expandedListPosition) {
        return expandableListDetail.get(expandableListTitle.get(listPosition));
    }

    @Override
    public long getChildId(int listPosition, int expandedListPosition) {
        return expandedListPosition;
    }

    @Override
    public View getChildView(int listPosition, final int expandedListPosition,
                             boolean isLastChild, View convertView, ViewGroup parent) {

        final Entity expandedListText = expandableListDetail.get(listPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_item, null);
        }
        TextView locationTextView = (TextView) convertView.findViewById(R.id.location);
        TextView commentTextView = (TextView) convertView.findViewById(R.id.comment);
        ImageView imageView = convertView.findViewById(R.id.childImage);
        locationTextView.setText(expandedListText.getAddress());
        commentTextView.setText(String.valueOf(expandedListText.getCommentCount()));

        Glide.with(context)
                .load(expandedListText.getLargeUrl())
                .into(imageView);

        return convertView;
    }

    @Override
    public int getChildrenCount(int listPosition) {
        return 1;
    }

    @Override
    public Object getGroup(int listPosition) {
        return expandableListTitle.get(listPosition);
    }

    @Override
    public int getGroupCount() {
        return expandableListTitle.size();
    }

    @Override
    public long getGroupId(int listPosition) {
        return listPosition;
    }

    @Override
    public View getGroupView(int listPosition, boolean isExpanded,
                             View convertView, ViewGroup parent) {
        Entity listTitle = expandableListTitle.get(listPosition);
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) this.context.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.list_group, null);
        }
        TextView listTitleTextView = (TextView) convertView.findViewById(R.id.name);
        TextView listLocationTextView = (TextView) convertView.findViewById(R.id.location);
        TextView listcommentTextView = (TextView) convertView.findViewById(R.id.comment);
        RelativeTimeTextView listTimeTextView = convertView.findViewById(R.id.time);
        CircleImageView circleImageView = convertView.findViewById(R.id.productImage);

        listTitleTextView.setTypeface(null, Typeface.BOLD);
        listTitleTextView.setText(listTitle.getUserId().getFirstName());
        listLocationTextView.setText(listTitle.getAddress());
        listcommentTextView.setText(String.valueOf(listTitle.getCommentCount()) + " Comments");

        String str_date = listTitle.getCreatedOn();
        DateFormat formatter;
        Date date = null;
        formatter = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try {
            date = (Date) formatter.parse(str_date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());

        listTimeTextView.setReferenceTime(timeStampDate.getTime());


        Glide.with(context)
                .load(listTitle.getSmallUrl())
                .into(circleImageView);

        return convertView;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public boolean isChildSelectable(int listPosition, int expandedListPosition) {
        return true;
    }
}