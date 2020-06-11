package com.miori.picksubway;

import android.graphics.drawable.Drawable;
import android.view.View;

public class MyListViewItem {
    private Drawable menuImage;
    private String name;
    private String money;
    private String kcal;
    private String description;

    public MyListViewItem(Drawable menuImage, String name, String money, String kcal, String description) {
        this.menuImage = menuImage;
        this.name = name;
        this.money = money;
        this.kcal = kcal;
        this.description = description;
    }

    public Drawable getMenuImage() {
        return menuImage;
    }

    public void setMenuImage(Drawable menuImage) {
        this.menuImage = menuImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
