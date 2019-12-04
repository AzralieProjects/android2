package com.loayj_musah.ex2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class Paddle {
    private float x,y;
    private float w,h;
    private float paddleSpeed;
    public final int STOPPED=0;
    public final int LEFT=0;
    public final int RIGHT=0;
    private int paddleMoving=STOPPED;

private Paint paddlePen;
    public Paddle(float x, float y, float w, float h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        paddlePen=new Paint();
        paddlePen.setColor(Color.argb(255,29,1,208));
    }

    public void draw(Canvas canvas){

canvas.drawRect(x,y,x+w,y+h,paddlePen);
    }
}
