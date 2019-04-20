package com.example.socialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;

import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
//import com.google.android.gms.ads.MobileAds;
//import com.google.android.gms.ads.AdRequest;
//import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    MyAdepter myAdepter;
    RecyclerView recyclerView;
    String []name;

    //private AdView mAdView;

    int []img={R.drawable.google,R.drawable.bing_search,R.drawable.yahoo,R.drawable.box,
            R.drawable.google_drive,R.drawable.dropbox,R.drawable.gmail,R.drawable.outlook,
            R.drawable.yahoo_mail,R.drawable.facebook,R.drawable.twitter,R.drawable.google_plus,
            R.drawable.youtube,R.drawable.linkedin, R.drawable.instagram,R.drawable.snapchat,
            R.drawable.quora,R.drawable.reddit,R.drawable.vine,R.drawable.classmates,
            R.drawable.stumbleupon,R.drawable.badoo,R.drawable.bebo,R.drawable.tumblr,
            R.drawable.kohtakte,R.drawable.hi_five,R.drawable.black_planet,R.drawable.douban,
            R.drawable.myspace,R.drawable.flixtser,R.drawable.habbo,R.drawable.pinterest,R.drawable.twoo,
            R.drawable.tagged, R.drawable.last_fm,R.drawable.qzone,R.drawable.meetup,R.drawable.mixi,
            R.drawable.mylife,R.drawable.netlog,R.drawable.xanga,R.drawable.renren,R.drawable.cyworld,
            R.drawable.deviantart,R.drawable.skyrock,R.drawable.skype,R.drawable.amazon,
            R.drawable.ebay,R.drawable.reverbnation,R.drawable.soundcloud,R.drawable.meet_me,
            R.drawable.chanel,R.drawable.my_heritage,R.drawable.zorpia,R.drawable.aol,R.drawable.bitly,
            R.drawable.buzzfeed_news, R.drawable.daily_motion,R.drawable.digg,R.drawable.evernote,
            R.drawable.fandango,R.drawable.life_hacker,R.drawable.medium,R.drawable.mocospace,
            R.drawable.nextdoor_talk,R.drawable.nine_gag,R.drawable.slack,
            R.drawable.topface,R.drawable.tuenti,R.drawable.vimeo,R.drawable.wayn,
            R.drawable.yandex_mail,R.drawable.krisna_song,R.drawable.zoosk,R.drawable.krisna_song};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.social);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(true);
        getSupportActionBar().setTitle("Social Media");


//        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
//        mAdView = findViewById(R.id.adView);
//        AdRequest adRequest = new AdRequest.Builder().build();
//        mAdView.loadAd(adRequest);


        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        name=getResources().getStringArray(R.array.name);
        myAdepter=new MyAdepter(this,name,img);
        recyclerView.setAdapter(myAdepter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.menuBar){
            Intent intent=new Intent(getApplicationContext(),Social_Media_Connection.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

    //addmob xml files code here please cut this code and past main activity xml file
//     <com.google.android.gms.ads.AdView
//    xmlns:ads="http://schemas.android.com/apk/res-auto"
//    android:id="@+id/adView"
//    android:layout_width="wrap_content"
//    android:layout_height="wrap_content"
//    android:layout_centerHorizontal="true"
//    android:layout_alignParentBottom="true"
//    ads:adSize="BANNER"
//    ads:adUnitId="ca-app-pub-3940256099942544/6300978111">
//    </com.google.android.gms.ads.AdView>

}
