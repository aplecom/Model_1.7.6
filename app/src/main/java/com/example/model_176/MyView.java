package com.example.model_176;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

import androidx.core.content.ContextCompat;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();

        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(1);

        int y = 0;
        while(y<canvas.getHeight()){
            canvas.drawLine(0,y,this.getWidth(),y,paint);
            y+=10;
        }
        int color = ContextCompat.getColor(getContext(), R.color.myColor);
        paint.setColor(color);

        int x = 0;
        while(x<canvas.getWidth()){
            canvas.drawLine(x,0,x,this.getHeight(),paint);
            x+=10;
        }

        paint.setColor(Color.YELLOW);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawCircle(500,300,200,paint);
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(20);
        canvas.drawCircle(500,300,200,paint);

        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL);
        canvas.drawRect(300, 800, 700, 1200, paint);




    }
}
