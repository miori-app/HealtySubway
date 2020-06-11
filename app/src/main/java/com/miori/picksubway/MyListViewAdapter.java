package com.miori.picksubway;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class MyListViewAdapter extends BaseAdapter {

    //Data
    private ArrayList<MyListViewItem> data = new ArrayList<MyListViewItem>();


    public ArrayList<MyListViewItem> getData() {
        return data;
    }

    public void setData(ArrayList<MyListViewItem> data) {
        this.data = data;
    }

    @Override
    public int getCount() {
        //data의 size
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    /**
     * position에 위치한 데이터를 listview item(xml)을 팽창한(inflate) 객체에 담아 반환
     * @param position
     * @param convertView :listview item
     * @param parent : listview
     * @return
     */
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        //1. 만약 view 아직 없다면 inflate
        if (convertView==null){
            LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.listview_item,parent,false);
        }

        //2. listview_item에 포함된 view들 변수로 잡기
        ImageView menuImageView = convertView.findViewById(R.id.menuImage);
        TextView menuTextView = convertView.findViewById(R.id.name);
        TextView moneyTextView = convertView.findViewById(R.id.money);
        TextView kcalTexttView = convertView.findViewById(R.id.kcal);
        TextView descriptionTextView = convertView.findViewById(R.id.description);

        //3. data item 가져오기
        MyListViewItem item = data.get(position);

        //4. view에 data반영
        // pirvate 임에도 불구하고 getter setter 때문에 가져올 수 있음
        menuImageView.setImageDrawable(item.getMenuImage());
        menuTextView.setText(item.getName());
        moneyTextView.setText(item.getMoney());
        kcalTexttView.setText(item.getKcal());
        descriptionTextView.setText(item.getDescription());

        // 클릭이벤트

        LinearLayout menuClick = (LinearLayout)convertView.findViewById(R.id.menuClick);
        menuClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),data.get(position).getName(),Toast.LENGTH_SHORT).show();

            }
        });


        return convertView;

    }
}
