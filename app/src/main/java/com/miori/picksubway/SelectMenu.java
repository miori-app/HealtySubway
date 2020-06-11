package com.miori.picksubway;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class SelectMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_menu);

        ViewPager vp = findViewById(R.id.viewpager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        vp.setAdapter(adapter);

        //tablayout 이랑 연동
        TabLayout tabLayout = findViewById(R.id.main_tab);
        tabLayout.setupWithViewPager(vp);



    }
}
