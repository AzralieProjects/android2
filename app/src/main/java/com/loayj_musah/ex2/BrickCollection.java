package com.loayj_musah.ex2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import java.util.ArrayList;

public class BrickCollection {
    Paint paint;
    private int numOfBricks=0;
    ArrayList<Brick> bricks = new ArrayList<>();
    private final int ROWS=7;
    private final int COLS=5;
    int Padding=2;

    public BrickCollection(int screenX, int screenY) {

        paint=new Paint();
        float brickWidth = (screenX)/ROWS;//screenx-padding(cols+1)/cols
        float brickHeigh = screenY / 20;
        for(int column = 0; column < ROWS; column ++ ){
            for(int row = 0; row < COLS; row ++ ){
                numOfBricks++;
                bricks.add(new Brick(row+1, column, brickWidth, brickHeigh));

            }
        }


    }
    public void draw(Canvas canvas){
        paint.setColor(Color.argb(255, 246, 0, 8));
        for (int i = 0; i < numOfBricks; i++) {
            if (bricks.get(i).isIsVisible()) {
                canvas.drawRect(bricks.get(i).getRect(), paint);
            }
        }


    }
}
