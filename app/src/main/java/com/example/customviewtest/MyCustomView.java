package com.example.customviewtest;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class MyCustomView extends ConstraintLayout {

    ImageView imageView;
    TextView textView;

    public MyCustomView(Context context) {
        super(context);

        LayoutInflater.from(context).inflate(R.layout.my_custom_view, this);
    }

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        LayoutInflater.from(context).inflate(R.layout.my_custom_view, this);
        initView(context, attrs);
    }

    public MyCustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        LayoutInflater.from(context).inflate(R.layout.my_custom_view, this);
        initView(context, attrs);
    }


    private void initView(Context context, AttributeSet attrs) {

        imageView = (ImageView) findViewById(R.id.customImage);
        textView = (TextView) findViewById(R.id.customText);

        @SuppressLint("CustomViewStyleable") TypedArray attributes = context.obtainStyledAttributes(attrs, R.styleable.CustomAttrs);

        imageView.setImageDrawable(attributes.getDrawable(R.styleable.CustomAttrs_image));
        textView.setText(attributes.getString(R.styleable.CustomAttrs_text));

        attributes.recycle();
    }



}
