package com.loayj_musah.ex2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Ball {
    private Paint pen;
    private float cx,cy,radius;
    int xVelocity,yVelocity;

    public Ball(float cx, float cy, float radius) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        pen=new Paint();
        pen.setColor(Color.argb(255, 225, 225, 225));

    }

    public float getCx() {
        return cx;
    }

    public void setCx(float cx) {
        this.cx = cx;
    }

    public float getCy() {
        return cy;
    }

    public void setCy(float cy) {
        this.cy = cy;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public int getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(int xVelocity) {
        this.xVelocity = xVelocity;
    }

    public int getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(int yVelocity) {
        this.yVelocity = yVelocity;
    }
    public void draw(Canvas canvas){
    canvas.drawCircle(cx,cy,radius,pen);

    }


}
