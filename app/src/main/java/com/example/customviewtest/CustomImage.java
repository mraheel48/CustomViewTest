package com.example.customviewtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomImage extends CustomImageView {

    private ImageView iv_main;
    private TextView tv_main;

    public CustomImage(Context context) {
        super(context);
    }

    public CustomImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected View getMainView() {

        if (this.iv_main == null) {

            this.iv_main = new ImageView(getContext());
            this.iv_main.setScaleType(ImageView.ScaleType.FIT_XY);
        }

        return iv_main;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected View getMainText() {
        if (this.tv_main == null) {
            this.tv_main = new TextView(getContext());
            this.tv_main.setText("null");
            this.tv_main.setBackgroundColor(Color.RED);
            this.tv_main.setGravity(Gravity.CENTER);

        }
        return tv_main;
    }

    public void setImageBitmap(Bitmap bmp) {
        this.iv_main.setImageBitmap(bmp);
    }

    public void setImageResource(int res_id) {
        this.iv_main.setImageResource(res_id);
    }

    public void setImageDrawable(Drawable drawable) {
        this.iv_main.setImageDrawable(drawable);
    }

    public Bitmap getImageBitmap() {
        return ((BitmapDrawable) this.iv_main.getDrawable()).getBitmap();
    }

    public void setText(String text) {
        this.tv_main.setText(text);
    }

    public String getText() {
        return this.tv_main.getText().toString().trim();
    }

}
