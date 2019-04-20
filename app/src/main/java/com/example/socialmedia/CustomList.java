package com.example.socialmedia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class CustomList extends AppCompatActivity {

    MyAdepter2 myAdepter2;
    RecyclerView recyclerView2;
    String []name;
    int []img={R.drawable.google,R.drawable.bing_search,R.drawable.yahoo,R.drawable.box,
            R.drawable.google_drive,R.drawable.dropbox,R.drawable.gmail,R.drawable.outlook,R.drawable.yahoo_mail,R.drawable.facebook,R.drawable.twitter,R.drawable.google_plus,R.drawable.youtube,R.drawable.linkedin,
            R.drawable.instagram,R.drawable.snapchat,R.drawable.quora,R.drawable.reddit,R.drawable.vine,R.drawable.classmates,R.drawable.stumbleupon,R.drawable.badoo,R.drawable.bebo,R.drawable.tumblr,
            R.drawable.kohtakte,R.drawable.hi_five,R.drawable.black_planet,R.drawable.douban,R.drawable.myspace,R.drawable.flixtser,R.drawable.habbo,R.drawable.pinterest,R.drawable.twoo,R.drawable.tagged,
            R.drawable.last_fm,R.drawable.qzone,R.drawable.meetup,R.drawable.mixi,R.drawable.mylife,R.drawable.netlog,R.drawable.xanga,R.drawable.renren,R.drawable.cyworld,R.drawable.deviantart,R.drawable.skyrock,R.drawable.skype,R.drawable.amazon,
            R.drawable.ebay,R.drawable.reverbnation,R.drawable.soundcloud,R.drawable.meet_me,R.drawable.chanel,R.drawable.my_heritage,R.drawable.zorpia,R.drawable.aol,R.drawable.bitly,R.drawable.buzzfeed_news,
            R.drawable.daily_motion,R.drawable.digg,R.drawable.evernote,R.drawable.fandango,R.drawable.life_hacker,R.drawable.medium,R.drawable.mocospace,R.drawable.nextdoor_talk,R.drawable.nine_gag,R.drawable.slack,
            R.drawable.topface,R.drawable.tuenti,R.drawable.vimeo,R.drawable.wayn,R.drawable.yandex_mail,R.drawable.krisna_song,R.drawable.zoosk,R.drawable.krisna_song};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.social);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        setContentView(R.layout.activity_custom_list);
        recyclerView2=findViewById(R.id.recyclerView2);

        name=getResources().getStringArray(R.array.name);
        myAdepter2=new MyAdepter2(this,name,img);
        recyclerView2.setAdapter(myAdepter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

    }
}
