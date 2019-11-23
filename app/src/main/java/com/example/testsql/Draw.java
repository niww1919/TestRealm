package com.example.testsql;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.constraint.ConstraintLayout;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class Draw extends View {

    private Paint mPaint = new Paint();
    RectF rectF = new RectF(50,500,50,50);
    Random random = new Random();
    int r = random.nextInt(500);



    public Draw(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

//        mPaint.setAntiAlias(true);
//        mPaint.setColor(Color.YELLOW);
//        canvas.drawCircle(r, r, 50, mPaint);

//        mPaint.setAntiAlias(true);
//        mPaint.setColor(Color.DKGRAY);
//        canvas.drawCircle(300, 90, 50, mPaint);
//
//        mPaint.setAntiAlias(false);
//        mPaint.setColor(Color.GREEN);
//        canvas.drawCircle(450, 45, 50, mPaint);
//
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawRect();
//        canvas.drawRect(0,200,0,0,mPaint);
//        canvas.drawRect(50,50,30,30,mPaint);
        canvas.drawRect(rectF,mPaint);
//
//        int x = 200;
//        int y = 100;
//        mPaint.setColor(Color.GRAY);
//        mPaint.setTextSize(27);
//        String string = "Sun light";
//        canvas.rotate(45, x, y);
//        mPaint.setStyle(Paint.Style.FILL);
//        canvas.drawText(string, x, y, mPaint);
////        crash app
//        canvas.restore();

    }

}
