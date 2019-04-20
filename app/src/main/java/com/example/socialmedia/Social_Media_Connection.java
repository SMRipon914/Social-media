package com.example.socialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Social_Media_Connection extends AppCompatActivity implements View.OnClickListener {

    LinearLayout customListId_btn,shareOptionId_btn,rateId_btn,feedback_btn,facebook_btn,twitterId_btn;
    ToggleButton toggleButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.social);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        setContentView(R.layout.activity_social__media__connection);
        this.setTitle("Social Media Connection");
        customListId_btn=findViewById(R.id.customListId_btn);
        shareOptionId_btn=findViewById(R.id.shareOptionId_btn);
        rateId_btn=findViewById(R.id.rateId_btn);
        feedback_btn=findViewById(R.id.feedbackId_btn);
        facebook_btn=findViewById(R.id.facebookId_btn);
        twitterId_btn=findViewById(R.id.twitterId_btn);
        toggleButton=findViewById(R.id.toggole_btn);
        customListId_btn.setOnClickListener(this);
        shareOptionId_btn.setOnClickListener(this);
        rateId_btn.setOnClickListener(this);
        feedback_btn.setOnClickListener(this);
        facebook_btn.setOnClickListener(this);
        twitterId_btn.setOnClickListener(this);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    Toast.makeText(getApplicationContext(),"ON",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(),"Off",Toast.LENGTH_SHORT).show();
                }
            }
        });
        
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.customListId_btn){
            Intent intent=new Intent(getApplicationContext(),CustomList.class);
            startActivity(intent);

        }else if (v.getId()==R.id.shareOptionId_btn){
           ShareOption();
        }else if (v.getId()==R.id.rateId_btn){
            startActivity(new Intent(getApplicationContext(),DisplayView.class));
            Toast.makeText(getApplicationContext(),"rate",Toast.LENGTH_SHORT).show();
        }else if (v.getId()==R.id.feedbackId_btn){

           startActivity(new Intent(getApplicationContext(),Feedback.class));
        }else if (v.getId()==R.id.facebookId_btn){
           startActivity(new Intent(getApplicationContext(),DisplayView.class));

            Toast.makeText(getApplicationContext(),"facebook",Toast.LENGTH_SHORT).show();
        }else if (v.getId()==R.id.twitterId_btn){
            startActivity(new Intent(getApplicationContext(),DisplayView.class));
            Toast.makeText(getApplicationContext(),"twitter",Toast.LENGTH_SHORT).show();
        }

    }


    public void ShareOption(){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String subject="This is very helpfull apps\n";
        String body="https://l.facebook.com/l.php?u=https%3A%2F%2Fplay.google.com%2Fstore%2Fapps%2Fdetails%3Fid%3Dcom.amar.socialmedianetwork%26hl%3Den%26fbclid%3DIwAR1Z9H1CS9sXnpU2qvsUk900FcsYNQfSwGbyR4sEyRl-NKKyqxgMZTMYN8Y&h=AT0Ordj5pX2rOumFRTMnFI5-2IEIlB-sZCNBMlhZ_2wU7G_Io-HUV7fwiPCkxu5sXe_Gp0E7gG3-pWrH0jXqvu2nbkkB6EKFXSkNUcUkTRb2ZN8ActzHSmMF7JbbmxZL9XcT6A.\n";
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,body);
        startActivity(Intent.createChooser(intent,"share with"));

    }
}
