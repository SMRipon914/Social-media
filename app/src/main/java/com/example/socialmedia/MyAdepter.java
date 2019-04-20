package com.example.socialmedia;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdepter extends RecyclerView.Adapter<MyAdepter.MyViewHolder>  {

    Context context;
    RecyclerView recyclerView;
    String [] name;
    int [] img;


    public MyAdepter(Context context, String[] name,int[] img) {

        this.context = context;
        this.name = name ;
        this.img = img;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
       View view= layoutInflater.inflate(R.layout.simple_view,viewGroup,false);

        return new MyViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, int i) {

        myViewHolder.textView.setText(name[i]);
        myViewHolder.imageView.setImageResource(img[i]);
        myViewHolder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=myViewHolder.textView.getText().toString();

                   if (value.equals("GOOGLE")){
                        Intent intent=new Intent(context,DisplayView.class);
                        intent.putExtra("name","GOOGLE");
                        context.startActivity(intent);

                   }
                   else if (value.equals("BING SEARCH")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BING SEARCH");
                       context.startActivity(intent);
                   }
                   else if (value.equals("YAHOO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","YAHOO");
                       context.startActivity(intent);
                   } else if (value.equals("BOX")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BOX");
                       context.startActivity(intent);
                   } else if (value.equals("GOOGLE DRIVE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","GOOGLE DRIVE");
                       context.startActivity(intent);
                   } else if (value.equals("DROPBOX")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","DROPBOX");
                       context.startActivity(intent);
                   } else if (value.equals("GMAIL")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","GMAIL");
                       context.startActivity(intent);
                   } else if (value.equals("OUTLOOK")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","OUTLOOK");
                       context.startActivity(intent);
                   } else if (value.equals("YAHOO MAIL")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","YAHOO MAIL");
                       context.startActivity(intent);
                   } else if (value.equals("FACEBOOK")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","FACEBOOK");
                       context.startActivity(intent);
                   }else if (value.equals("TWITTER")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","TWITTER");
                       context.startActivity(intent);
                   }else if (value.equals("GOOGLE PLUS")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","GOOGLE PLUS");
                       context.startActivity(intent);
                   }else if (value.equals("YOUTUBE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","YOUTUBE");
                       context.startActivity(intent);
                   }else if (value.equals("LINKEDIN")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","LINKEDIN");
                       context.startActivity(intent);
                   }else if (value.equals("INSTAGRAM")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","INSTAGRAM");
                       context.startActivity(intent);
                   }else if (value.equals("SNAPCHAT")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","SNAPCHAT");
                       context.startActivity(intent);

                   }else if (value.equals("QUORA")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","QUORA");
                       context.startActivity(intent);
                   }else if (value.equals("REDDIT")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","REDDIT");
                       context.startActivity(intent);
                   }else if (value.equals("VINE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","VINE");
                       context.startActivity(intent);
                   }else if (value.equals("CLASSMATES")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","CLASSMATES");
                       context.startActivity(intent);
                   }else if (value.equals("STUMBLEUPON")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","STUMBLEUPON");
                       context.startActivity(intent);
                   }else if (value.equals("BADOO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BADOO");
                       context.startActivity(intent);
                   }else if (value.equals("BEBO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BEBO");
                       context.startActivity(intent);
                   }else if (value.equals("TUMBLR")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","TUMBLR");
                       context.startActivity(intent);
                   }else if (value.equals("KOHTAKTE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","KOHTAKTE");
                       context.startActivity(intent);
                   }else if (value.equals("HI5")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","HI5");
                       context.startActivity(intent);
                   }else if (value.equals("BLACK PLANET")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BLACK PLANET");
                       context.startActivity(intent);
                   }else if (value.equals("DOUBAN")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","DOUBAN");
                       context.startActivity(intent);
                   }else if (value.equals("MYSPACE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MYSPACE");
                       context.startActivity(intent);
                   }else if (value.equals("FLIXTSER")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","FLIXSTER");
                       context.startActivity(intent);
                   }else if (value.equals("HABBO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","HABBO");
                       context.startActivity(intent);
                   }else if (value.equals("PINTEREST")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","PINTEREST");
                       context.startActivity(intent);
                   }else if (value.equals("TWOO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","TWOO");
                       context.startActivity(intent);
                   }else if (value.equals("TAGGED")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","TAGGED");
                       context.startActivity(intent);
                   }else if (value.equals("LAST.FM")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","LAST.FM");
                       context.startActivity(intent);
                   }else if (value.equals("QZONE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","QZONE");
                       context.startActivity(intent);
                   }else if (value.equals("MEETUP")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MEETUP");
                       context.startActivity(intent);
                   }else if (value.equals("MICI")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MICI");
                       context.startActivity(intent);
                   }else if (value.equals("MYLIFE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MYLIFE");
                       context.startActivity(intent);
                   }else if (value.equals("NETLOG")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","NETLOG");
                       context.startActivity(intent);
                   }else if (value.equals("XANGA")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","XANGA");
                       context.startActivity(intent);
                   }else if (value.equals("RENRNE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","RENRNE");
                       context.startActivity(intent);
                   }else if (value.equals("CYWORLD")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","CYWORLD");
                       context.startActivity(intent);
                   }else if (value.equals("DEVIANTART")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","DEVIANTART");
                       context.startActivity(intent);
                   }else if (value.equals("SKYROCK")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","SKYROCK");
                       context.startActivity(intent);
                   }else if (value.equals("SKYPE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","SKYPE");
                       context.startActivity(intent);
                   }else if (value.equals("AMAZON")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","AMAZON");
                       context.startActivity(intent);
                   }else if (value.equals("EBAY")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","EBAY");
                       context.startActivity(intent);
                   }else if (value.equals("REVERBNATION")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","REVERBNATION");
                       context.startActivity(intent);
                   }else if (value.equals("SOUNDCLOUD")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","SOUNDCLOUD");
                       context.startActivity(intent);
                   }else if (value.equals("MEET ME")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MEET ME");
                       context.startActivity(intent);
                   }else if (value.equals("CHANEL")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","CHANEL");
                       context.startActivity(intent);
                   }else if (value.equals("MY HERITAGE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MY HERITAGE");
                       context.startActivity(intent);
                   }else if (value.equals("ZORPIA")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","ZORPIA");
                       context.startActivity(intent);
                   }else if (value.equals("AOL")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","AOL");
                       context.startActivity(intent);
                   }else if (value.equals("BITLY")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BITLY");
                       context.startActivity(intent);
                   }else if (value.equals("BUZZFEED NEWS")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","BUZZFEED NEWS");
                       context.startActivity(intent);
                   }else if (value.equals("DAILY MOTION")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","DAILY MOTION");
                       context.startActivity(intent);
                   }else if (value.equals("DIGG")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","DIGG");
                       context.startActivity(intent);
                   }else if (value.equals("EVERNOTE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","EVERNOTE");
                       context.startActivity(intent);
                   }else if (value.equals("FANDANGO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","FANDANGO");
                       context.startActivity(intent);
                   }else if (value.equals("LIFE HACKER")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","LIFE HACKER");
                       context.startActivity(intent);
                   }else if (value.equals("MEDIUM")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MEDIUM");
                       context.startActivity(intent);
                   }else if (value.equals("MOCOSPACE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","MOCOSPACE");
                       context.startActivity(intent);
                   }else if (value.equals("NEXT DOOR")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","NEXT DOOR");
                       context.startActivity(intent);
                   }else if (value.equals("9GAG")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","9GAG");
                       context.startActivity(intent);
                   }else if (value.equals("SLACK")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","SLACK");
                       context.startActivity(intent);
                   }else if (value.equals("TOPFACE")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","TOPFACE");
                       context.startActivity(intent);
                   }else if (value.equals("TUENTI")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","TUENTI");
                       context.startActivity(intent);
                   }else if (value.equals("VIMEO")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","VIMEO");
                       context.startActivity(intent);
                   }else if (value.equals("WAYN")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","WAYN");
                       context.startActivity(intent);
                   }else if (value.equals("YANDEX MAIL")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","YANDEX MAIL");
                       context.startActivity(intent);
                   }else if (value.equals("KRISHNA SONG")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","KRISHNA SONG");
                       context.startActivity(intent);
                   }else if (value.equals("ZOOSK")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","ZOOSK");
                       context.startActivity(intent);
                   }else if (value.equals("KRISHNA SONG")){
                       Intent intent=new Intent(context,DisplayView.class);
                       intent.putExtra("name","KRISHNA SONG");
                       context.startActivity(intent);
                   }

            }
        });
    }

    @Override
    public int getItemCount() {
        return name.length;
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
            imageView = itemView.findViewById(R.id.imageView);
        }

          }


}
