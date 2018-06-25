package com.project.kcci.habitsplanproject.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.project.kcci.habitsplanproject.R;
import com.project.kcci.habitsplanproject.vo.CategoryVO;

import java.util.ArrayList;

public class CustomSpinnerAdapter extends BaseAdapter{
    private ArrayList<CategoryVO> list;
    private LayoutInflater inflater;
    private Context context;

    public CustomSpinnerAdapter(ArrayList<CategoryVO> list, Context context) {
        this.list = list;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view == null)
            view = inflater.inflate(R.layout.category_spinner_item, null);

        TextView category = view.findViewById(R.id.text_category);
        category.setText(list.get(position).getCategory());
        category.setTextColor(Color.BLACK);

        return view;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

}
