package com.canvas.canvas;

import android.R.color;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends Activity {

	private class Shape extends View{

		public Shape(Context context) {
			super(context);
			// TODO Auto-generated constructor stub
		}
		protected void onDraw(Canvas canvas){
			Paint paint=new Paint();
			paint.setColor(Color.GREEN);
			canvas.drawCircle(100,100, 50, paint);
			paint.setColor(Color.GREEN);
			canvas.drawCircle(100,200, 50, paint);
			paint.setColor(Color.GREEN);
			canvas.drawCircle(100,300, 50, paint);
			paint.setColor(Color.GREEN);
			canvas.drawCircle(200,100, 50, paint);
			paint.setColor(Color.GREEN);
			canvas.drawCircle(200,200, 50, paint);
			}
	}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Shape p12=new Shape(this);
        setContentView(p12);
    }

}