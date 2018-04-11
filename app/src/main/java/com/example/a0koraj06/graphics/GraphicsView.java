package com.example.a0koraj06.graphics;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.MotionEvent;
import android.view.View;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Color;
import android.content.Context;

public class GraphicsView extends View implements View.OnTouchListener
{
    Paint p;
    Bitmap heroBmp;
    int counter = 0;

    public GraphicsView (Context ctx)
    {
        super(ctx);

        p = new Paint();
        p.setColor(Color.RED);
        p.setTextSize(24);
        heroBmp =   BitmapFactory.decodeResource(ctx.getResources(), R.drawable.hero);

        this.setOnTouchListener(this);
    }

    public void onDraw (Canvas canvas)
    {
        p.setStyle(Paint.Style.FILL);
        canvas.drawRect(10, 10, 110, 110, p);
        canvas.drawText("Hello Graphics World!", 0, 200, p);



        p.setStyle(Paint.Style.STROKE);
        p.setStrokeWidth(3);
        canvas.drawRect(10,400,410,600,p);

        canvas.drawBitmap(heroBmp , curX,  curY, null);

        counter++;

        canvas.drawText("Counter is currently: " + counter, 0, 300, p);
    }


    // Handles touch events
    public boolean onTouch (View view, MotionEvent ev){

        curX = ev.getX();
        curY = ev.getY();

        postInvalidate();

        // ew.getX() and ev.getY() - position of touch event
        return true;
    }
}




