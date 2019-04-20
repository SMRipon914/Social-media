package com.example.socialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Feedback extends AppCompatActivity implements View.OnClickListener {

    Button save_input;
    EditText name_input,message_input;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        name_input=findViewById(R.id.name_input);
        message_input=findViewById(R.id.message_input);
        save_input=findViewById(R.id.save_input);
        save_input.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.save_input){
            String name=name_input.getText().toString();
            String message=message_input.getText().toString();
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/email");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[] {"mdriponsheikh14@gmail.com"});
            intent.putExtra(Intent.EXTRA_SUBJECT,"Feedback from Social Media");
            intent.putExtra(Intent.EXTRA_TEXT,"Name: "+name+"\n Massage: "+message);
            startActivity(Intent.createChooser(intent,"Feedback with"));
            name_input.setText("");
            message_input.setText("");

        }

    }
}
