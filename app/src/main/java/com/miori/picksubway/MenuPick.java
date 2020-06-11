package com.miori.picksubway;

import android.os.Bundle;

import androidx.core.content.ContextCompat;
import android.content.Context;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MenuPick#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MenuPick extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ListView listView;

    public MenuPick() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MenuPick.
     */
    // TODO: Rename and change types and number of parameters
    public static MenuPick newInstance(String param1, String param2) {
        MenuPick fragment = new MenuPick();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_pick,container,false);
        listView = view.findViewById(R.id.listview_menu);


        MyListViewAdapter adapter = new MyListViewAdapter();
        ArrayList<MyListViewItem> data = adapter.getData();


        data.add(new MyListViewItem(ContextCompat.getDrawable(getContext(),R.drawable.rotisserie),"로티세리 바비큐 치킨","15cm: 5900/ 30cm : 10100 (won)","350 Kcal","손으로 찢어 더 부드럽고, 촉촉한 바비큐 치킨의 풍미 가득"));
        data.add(new MyListViewItem(ContextCompat.getDrawable(getContext(),R.drawable.italianbmt),"이탈리안 비엠티","15cm : 5100 /30cm : 9100 (won)","410 Kcal","페퍼로니 3장, 살라미 3장, 햄 2장"));
        listView.setAdapter(adapter);
        return view;
    }
}
