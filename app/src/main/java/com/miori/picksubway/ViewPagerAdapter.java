package com.miori.picksubway;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> items;
    private ArrayList<String> itext;
    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        items = new ArrayList<Fragment>();

        items.add(new MenuPick());
        items.add(new BreadPick());
        items.add(new CheesePick());
        items.add(new VegPick());
        items.add(new SaucePick());
        items.add(new ExtraPick());

        itext = new ArrayList<String>();
        itext.add("메뉴");
        itext.add("빵");
        itext.add("치즈");
        itext.add("야채");
        itext.add("소스");
        itext.add("추가");

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public CharSequence getPageTitle(int position){
        return itext.get(position);
    }
    //https://godog.tistory.com/entry/%EC%95%88%EB%93%9C%EB%A1%9C%EC%9D%B4%EB%93%9C-%EB%B7%B0%ED%8E%98%EC%9D%B4%EC%A0%80-%ED%83%AD-%EB%A0%88%EC%9D%B4%EC%95%84%EC%9B%83-%EA%B5%AC%ED%98%84-1-%EC%A2%8C%EC%9A%B0%EB%A1%9C-%EB%B0%80%EC%96%B4%EC%84%9C-%ED%8E%98%EC%9D%B4%EC%A7%80-%EC%A0%84%ED%99%98
}
