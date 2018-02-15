package com.shashank.sony.fancyaboutpagelib;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.intrusoft.squint.DiagonalView;


public class FancyAboutPage extends RelativeLayout {
    private TextView l1,l2,l3,l4,l5;
    DiagonalView diagonalView;
    ImageView img,email,fb,tw,lin,git;
    String emailurl,fburl,twitterurl,linkedinurl,githuburl;
    private void init(Context context) {
        //do stuff that was in your original constructor...
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.activity_fancy_about_page, this, true);
        l1=(TextView) findViewById(R.id.name);
        l2=(TextView) findViewById(R.id.description);
        l3=(TextView) findViewById(R.id.appname);
        l4=(TextView) findViewById(R.id.appversion);
        l5=(TextView) findViewById(R.id.appdescription);
        img=(ImageView) findViewById(R.id.appicon);
        email=(ImageView) findViewById(R.id.imageView);
        fb=(ImageView) findViewById(R.id.imageView2);
        tw=(ImageView) findViewById(R.id.imageView3);
        lin=(ImageView) findViewById(R.id.imageView4);
        git=(ImageView) findViewById(R.id.imageView5);
        diagonalView = (DiagonalView) findViewById(R.id.background);
    }
    public FancyAboutPage(Context context) {
        super(context);
        init(context);
    }
    public FancyAboutPage(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public FancyAboutPage(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs,defStyle);
        init(context);
    }
    public void setName(String name){
       l1.setText(name);
    }
    public void setDescription(String description){
       l2.setText(description);
    }
    public void setCoverTintColor(int color){
        diagonalView.setTintColor(color);
    }
    public void setCover(int drawable){
        diagonalView.setImageResource(drawable);
    }
    public void addEmailLink(final String emailAddress){
        email.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),emailAddress,Toast.LENGTH_SHORT).show();
            }
        });

    }
    public void addFacebookLink(String facebookAddress){
        fb.setVisibility(VISIBLE);
        fburl=facebookAddress;
        fb.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!fburl.startsWith("http://") && !fburl.startsWith("https://")) {
                    fburl = "http://" + fburl;
                }
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(fburl));
                getContext().startActivity(browserIntent);
            }
        });

    }
    public void addTwitterLink(String twitterAddress){
        tw.setVisibility(VISIBLE);
        twitterurl=twitterAddress;
        tw.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!twitterurl.startsWith("http://") && !twitterurl.startsWith("https://"))
                    twitterurl = "http://" + twitterurl;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(twitterurl));
                getContext().startActivity(browserIntent);
            }
        });
    }
    public void addLinkedinLink(String linkedinAddress){
        lin.setVisibility(VISIBLE);
        linkedinurl=linkedinAddress;
        lin.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!linkedinurl.startsWith("http://") && !linkedinurl.startsWith("https://"))
                    linkedinurl = "http://" + linkedinurl;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkedinurl));
                getContext().startActivity(browserIntent);
            }
        });
    }
    public void addGitHubLink(String githubAddress){
        git.setVisibility(VISIBLE);
        githuburl=githubAddress;
        git.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!githuburl.startsWith("http://") && !githuburl.startsWith("https://"))
                    githuburl = "http://" + githuburl;
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(githuburl));
                getContext().startActivity(browserIntent);
            }
        });

    }
    public void setAppIcon(int Icon){
       img.setImageResource(Icon);
    }
    public void setAppName(String AppName){
       l3.setText(AppName);
    }
    public void setVersionNameAsAppSubTitle(String AppVersion){
       l4.setText("Version "+AppVersion);
    }
    public void setAppDescription(String AppDescription){
        l5.setText(AppDescription);

    }

}
