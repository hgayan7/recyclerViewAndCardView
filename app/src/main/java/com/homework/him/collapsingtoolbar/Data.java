package com.homework.him.collapsingtoolbar;

import java.util.ArrayList;

/**
 * Created by him on 6/15/2017.
 */

public class Data {
    public static ArrayList<Information> getData()
    {
        ArrayList<Information> data=new ArrayList<>();
        //All these images are taken by me
        int[] images={
                R.drawable.leaf,
                R.drawable.aligned,
                R.drawable.flower,
                R.drawable.balconyview,
                R.drawable.brahmaputra,
                R.drawable.beauty,
                R.drawable.view

        };
        String[] categories={"Leaf","Aligned","Flower","Morning","The mighty","Beauty","View"};
        String[] stars={"152","251","157","123","301","113","124"};
        for(int i=0;i<images.length;i++){
            Information current=new Information();
            current.imageId=images[i];
            current.title=categories[i];
            current.starsCount=stars[i];
            data.add(current);

        }
        return data;

    }

}

