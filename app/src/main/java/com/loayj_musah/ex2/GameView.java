package com.loayj_musah.ex2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;



public class GameView extends View {
    private float pitchRotation;
    private boolean GameStart=false;
    private int canvasW,canvasH;
    private Ball ball;
    private Paddle Paddle;
    private BrickCollection brickCollection;
    public GameView(Context context,  AttributeSet attrs) {

        super(context, attrs);

    }

    public void setPitchRotation(float Rotation){
        this.pitchRotation=Rotation;

    }
    public float getPitchRotation() {
        return pitchRotation;
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        canvasW=w;
        canvasH=h;
        ball=new Ball(canvasW/2,canvasH-95,40);
        Paddle=new Paddle(canvasW/2-canvasW/6,canvasH-50,canvasW/3,30);
        brickCollection=new BrickCollection(canvasW,canvasH);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN)
            GameStart=true;
        invalidate();
        return true;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.argb(255,110,107,107));
        ball.draw(canvas);
        Paddle.draw(canvas);
        brickCollection.draw(canvas);
        Log.d("d", "onDraw: ");

    }
}
