package com.arch.sample.customcomponents.customviews;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;

import com.arch.sample.customcomponents.Utils.ViewUtil;

/**
 * Created by pavan on 12/6/2017.
 */

public class CustomSeekBar extends AppCompatSeekBar {
    private String TAG = "CustomSeekBar";
    int noGrids = 8;

    public CustomSeekBar(Context context) {
        super(context);
        initBackground();
    }

    public CustomSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        initBackground();
    }

    public CustomSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBackground();
    }

    private void initBackground() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((Activity) getContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int height = ViewUtil.dpToPx(50);//displayMetrics.heightPixels;
        int width = displayMetrics.widthPixels;

        Bitmap bmp = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888); // this creates a MUTABLE bitmap
        Canvas canvas = new Canvas(bmp);
        // Draw a solid color on the canvas as background
        canvas.drawColor(Color.WHITE);

        // Initialize a new Paint instance to draw the rounded rectangle
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);

        // Set an offset value in pixels to draw rounded rectangle on canvas
        int offset = ViewUtil.dpToPx(5);

        RectF rectF = new RectF(
                offset, // left
                offset, // top
                canvas.getWidth() - offset, // right
                canvas.getHeight() - offset // bottom
        );

        int cornersRadius = 25;

        canvas.drawRoundRect(
                rectF, // rect
                cornersRadius, // rx
                cornersRadius, // ry
                paint // Paint
        );

        Paint paintGrid = new Paint();
        paintGrid.setStyle(Paint.Style.FILL);
        paintGrid.setColor(Color.WHITE);

        Log.d(TAG,"ScreenWidth::"+width);
        Log.d(TAG,"CanvasWidth::"+canvas.getWidth());
        for (int i = 1; i <= noGrids; i++) {
            int left = (canvas.getWidth()/noGrids)*i - offset / 2;
            canvas.drawRect(new Rect(left, offset, left+offset, canvas.getHeight() - offset), paintGrid);
            Log.d(TAG,"left:"+left+":top:"+offset+":right:"+(left+offset)+":bottom:"+(canvas.getHeight() - offset));
        }
        setProgressDrawable(new BitmapDrawable(getContext().getResources(), bmp));
    }
}
