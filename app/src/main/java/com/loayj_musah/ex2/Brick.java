package com.loayj_musah.ex2;

import android.graphics.RectF;

public class Brick {
    private float x,y;
    private float w,h;
    private RectF rect;
    public static boolean isVisible;
    private final int padding =2;



    public Brick(float x, float y, float w, float h) {
        isVisible = true;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

        rect=new RectF(y*w+padding,
                       x*h+padding,
                      y*w+w-padding,
                    x*h+h-padding);

    }
    public RectF getRect() {
        return rect;
    }
    public static boolean isIsVisible() {
        return isVisible;
    }
    public void setInvisible(){
        isVisible = false;
    }



    public static void setIsVisible(boolean isVisible) {
        Brick.isVisible = isVisible;
    }



}
