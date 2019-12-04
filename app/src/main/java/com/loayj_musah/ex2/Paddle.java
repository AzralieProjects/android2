package com.loayj_musah.ex2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Paddle {
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    private float x,y;
    private float w,h;
    private float paddleSpeed;
    public final int STOPPED=0;
    public final int LEFT=0;
    public final int RIGHT=0;

    private int paddleMoving=STOPPED;

    public float getPaddle_speed() {
        return paddle_speed;
    }

    public void setPaddle_speed(float paddle_speed) {
        this.paddle_speed = paddle_speed;
    }

    private float paddle_speed;


    private Paint paddlePen;
    public Paddle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        paddlePen=new Paint();
        paddlePen.setColor(Color.argb(255,29,1,208));
        this.paddle_speed=10;
    }

    public void draw(Canvas canvas){

canvas.drawRect(x,y,x+w,y+h,paddlePen);
    }
}
