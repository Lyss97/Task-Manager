package com.aziflaj.todolist;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.LinearLayout;


/**
 * Adapter to bind a LayoutItem List to a view
 */
public class LayoutItemAdapter extends ArrayAdapter<LayoutItem> {

    /**
     * Adapter context
     */
    Context mContext;

    /**
     * Adapter View layout
     */
    int mLayoutResourceId;

    public LayoutItemAdapter(Context context, int layoutResourceId) {
        super(context, layoutResourceId);

        mContext = context;
        mLayoutResourceId = layoutResourceId;
    }

    /**
     * Returns the view for a specific item on the list
     */
    @Override
    public View getView(int position, View convertView, final ViewGroup parent) {
        View row = convertView;
        Log.d("open view: ", "Success");
        final LayoutItem currentItem = getItem(position);



        if (row == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            row = inflater.inflate(mLayoutResourceId, parent, false);
        }
        Log.d("layout: ", "Success");
        row.setTag(currentItem);
        final CheckBox checkBox = (CheckBox) row.findViewById(R.id.checkLayoutItem);
        checkBox.setText(currentItem.getLName());
        checkBox.setChecked(false);
        checkBox.setEnabled(true);

        Log.d("set rows: ", "Success");
        checkBox.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                if (checkBox.isChecked()) {
                    if (mContext instanceof MenuActivity) {
                        MenuActivity activity = (MenuActivity) mContext;

                        activity.checkItem(currentItem);

                        //our checkbox is in a list in a viewgroup, so get that viewgroup
                        ViewGroup vg = (ViewGroup) arg0.getParent().getParent();
                        //get the number of children in that viewgroup (each list has one checkbox
                        int size = vg.getChildCount();

                        //print to debug log how many list are in the view group
                        //Log.d("check3", String.valueOf(size));

                        //for every list in the viewgroup
                        for (int i = 0; i < size; i++) {
                            View v = vg.getChildAt(i); //get that list
                            //Log.d("check4", vg.getChildAt(i).toString());   <- print to debug log the list info
                            CheckBox cb = v.findViewById(R.id.checkLayoutItem); //get the checkbox in that list
                            //Log.d("check7", cb.toString());                 <- print to debug log the checkbox info
                            if (!cb.equals(arg0)) { //if that checkbox isn't the one we just checked
                                cb.setChecked(false); //uncheck it
                            }
                        }
                    }
                }
            }
        });

        return row;
    }

}



