package com.example.sreyas20.project;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class BlogActivity extends AppCompatActivity {
    Animation animation,animation2,animation3;
Button btn;
LinearLayout layout;
private static int delay=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
      animation= AnimationUtils.loadAnimation(this,R.anim.animval);
      animation2=AnimationUtils.loadAnimation(this,R.anim.animval2);

        animation3=AnimationUtils.loadAnimation(this,R.anim.animval3);
     layout=(LinearLayout)findViewById(R.id.l1);

     btn=(Button)findViewById(R.id.button);


     btn.startAnimation(animation);
layout.startAnimation(animation2);

btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

       anim();


    }
});






    }


   public void anim()
   {
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               btn.startAnimation(animation3);
               layout.startAnimation(animation3);

               Intent i=new Intent(BlogActivity.this,LoginActivity.class);
               startActivity(i);

           }
       },delay);
   }




}
