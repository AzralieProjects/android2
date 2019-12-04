package com.loayj_musah.ex2;

import android.graphics.RectF;

public class Brick {
    private float x,y;
    private float w,h;
    private int canvasH,canvasW;



    private RectF rect;
    public static boolean isVisible;
    private final int padding =2;



    public Brick(float x, float y, float w, float h,int canvasW,int canvasH) {
        isVisible = true;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.canvasH = canvasH;
        this.canvasW = canvasW;
        rect=new RectF(y*canvasW+padding,
                       x+canvasH+padding,
                      y*canvasW-padding,
                    x+canvasH-padding);

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
