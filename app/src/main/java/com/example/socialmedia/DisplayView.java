package com.example.socialmedia;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class DisplayView extends AppCompatActivity {



    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_view);
        webView=findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());

        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        Bundle bundle=getIntent().getExtras();
        if (bundle!=null){
            String item=bundle.getString("name");
            itemList(item);
        }


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_web, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.home){
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }


    public void itemList(String item){

        if (item.equals("GOOGLE")){
            webView.loadUrl("https://www.google.com/");
        } else if (item.equals("BING SEARCH")){
            webView.loadUrl("https://www.bing.com/");
        } else if (item.equals("YAHOO")){
            webView.loadUrl("https://www.yahoo.com/");
        } else if (item.equals("BOX")){
            webView.loadUrl("https://www.box.com/");
        } else if (item.equals("GOOGLE DRIVE")){
            webView.loadUrl(" https://www.google.com/drive/");
        } else if (item.equals("DROPBOX")){
            webView.loadUrl("https://www.dropbox.com/");
        } else if (item.equals("GMAIL")){
            webView.loadUrl("https://mail.google.com/");
        } else if (item.equals("OUTLOOK")){
            webView.loadUrl("https://outlook.live.com/owa/");
        } else if (item.equals("YAHOO MAIL")){
            webView.loadUrl("https://login.yahoo.com/");
        } else if (item.equals("FACEBOOK")){
            webView.loadUrl("https://mobile.facebook.com/");
        }else if (item.equals("TWITTER")){
            webView.loadUrl("https://twitter.com/");
        }else if (item.equals("GOOGLE PLUS")){
            webView.loadUrl("https://plus.google.com/");
        }else if (item.equals("YOUTUBE")){
            webView.loadUrl("https://www.youtube.com/");
        }else if (item.equals("LINKEDIN")){
            webView.loadUrl("https://www.linkedin.com/");
        }else if (item.equals("INSTAGRAM")){
            webView.loadUrl("https://www.instagram.com/");
        }else if (item.equals("SNAPCHAT")){
            webView.loadUrl("https://accounts.snapchat.com/");
        }else if (item.equals("QUORA")){
            webView.loadUrl("https://bn.quora.com/");
        }else if (item.equals("REDDIT")){
            webView.loadUrl("https://www.reddit.com/");
        }else if (item.equals("VINE")){
            webView.loadUrl("https://vine.co/");
        }else if (item.equals("CLASSMATES")){
            webView.loadUrl("https://www.classmates.com/");
        }else if (item.equals("STUMBLEUPON")){
            webView.loadUrl("https://www.stumbleupon.com/");
        }else if (item.equals("BADOO")){
            webView.loadUrl("https://badoo.com/");
        }else if (item.equals("BEBO")){
            webView.loadUrl("https://www.bebo.com/");
        }else if (item.equals("TUMBLR")){
            webView.loadUrl("https://www.tumblr.com/");
        }else if (item.equals("KOHTAKTE")){
            webView.loadUrl("https://vk.com/");
        }else if (item.equals("HI5")){
            webView.loadUrl("https://hi5.com/");
        }else if (item.equals("BLACK PLANET")){
            webView.loadUrl("https://www.blackplanet.com/register.html");
        }else if (item.equals("DOUBAN")){
            webView.loadUrl("https://www.douban.com/");
        }else if (item.equals("MYSPACE")){
            webView.loadUrl("https://myspace.com/");
        }else if (item.equals("FLIXSTER")){
            webView.loadUrl("https://www.flixstervideo.com/gate/login?d=/");
        }else if (item.equals("HABBO")){
            webView.loadUrl("https://www.habbo.com/");
        }else if (item.equals("PINTEREST")){
            webView.loadUrl("https://www.pinterest.com/");
        }else if (item.equals("TWOO")){
            webView.loadUrl("https://www.twoo.com/");
        }else if (item.equals("TAGGED")){
            webView.loadUrl("https://www.tagged.com/");
        }else if (item.equals("LAST.FM")){
            webView.loadUrl("https://www.last.fm/");
        }else if (item.equals("QZONE")){
            webView.loadUrl("https://qzone.qq.com/");
        }else if (item.equals("MEETUP")){
            webView.loadUrl("https://www.meetup.com/");
        }else if (item.equals("MICI")){
            webView.loadUrl("https://miciitalian.com/");
        }else if (item.equals("MYLIFE")){
            webView.loadUrl("https://www.mylife.com/");
        }else if (item.equals("NETLOG")){
            webView.loadUrl("https://www.netlog.com/");
        }else if (item.equals("XANGA")){
            webView.loadUrl("http://xanga.com/");
        }else if (item.equals("RENRNE")){
            webView.loadUrl("http://sns.renren.com/");
        }else if (item.equals("CYWORLD")){
            webView.loadUrl("https://cy.cyworld.com/cyMain");
        }else if (item.equals("DEVIANTART")){
            webView.loadUrl("https://www.deviantart.com/");
        }else if (item.equals("SKYROCK")){
            webView.loadUrl("https://www.skyrock.com/");
        }else if (item.equals("SKYPE")){
            webView.loadUrl("https://account.microsoft.com/account/skype");
        }else if (item.equals("AMAZON")){
            webView.loadUrl("https://www.amazon.com/");
        }else if (item.equals("EBAY")){
            webView.loadUrl("https://www.ebay.com/");
        }else if (item.equals("REVERBNATION")){
            webView.loadUrl("https://www.reverbnation.com/");
        }else if (item.equals("SOUNDCLOUD")){
            webView.loadUrl("https://soundcloud.com/");
        }else if (item.equals("MEET ME")){
            webView.loadUrl("https://www.meetme.com/");
        }else if (item.equals("CHANEL")){
            webView.loadUrl("https://www.chanel.com/us/");
        }else if (item.equals("MY HERITAGE")){
            webView.loadUrl("https://www.myheritage.com/");
        }else if (item.equals("ZORPIA")){
            webView.loadUrl("https://www.zorpia.com/");
        }else if (item.equals("AOL")){
            webView.loadUrl("https://www.aol.com/");
        }else if (item.equals("BITLY")){
            webView.loadUrl("https://bitly.com/");
        }else if (item.equals("BUZZFEED NEWS")){
            webView.loadUrl("https://www.buzzfeednews.com/");
        }else if (item.equals("DAILY MOTION")){
            webView.loadUrl("https://www.dailymotion.com/us");
        }else if (item.equals("DIGG")){
            webView.loadUrl("http://digg.com/");
        }else if (item.equals("EVERNOTE")){
            webView.loadUrl("https://evernote.com/");
        }else if (item.equals("FANDANGO")){
            webView.loadUrl("https://www.fandango.com/");
        }else if (item.equals("LIFE HACKER")){
            webView.loadUrl("https://lifehacker.com/");
        }else if (item.equals("MEDIUM")){
            webView.loadUrl("https://medium.com/");
        }else if (item.equals("MOCOSPACE")){
            webView.loadUrl("https://www.mocospace.com/");
        }else if (item.equals("NEXT DOOR")){
            webView.loadUrl("https://nextdoor.com/");
        }else if (item.equals("9GAG")){
            webView.loadUrl("https://9gag.com/");
        }else if (item.equals("SLACK")){
            webView.loadUrl("https://slack.com/");
        }else if (item.equals("TOPFACE")){
            webView.loadUrl("https://topface.com/");
        }else if (item.equals("TUENTI")){
            webView.loadUrl("https://www.tuenti.com/");
        }else if (item.equals("VIMEO")){
            webView.loadUrl("https://vimeo.com/");
        }else if (item.equals("WAYN")){
            webView.loadUrl("https://www.wayn.com/");
        }else if (item.equals("YANDEX MAIL")){
            webView.loadUrl("https://mail.yandex.com/");
        }else if (item.equals("KRISHNA SONG")){
            webView.loadUrl("https://gaana.com/playlist/gaana-dj-krishna");
        }else if (item.equals("ZOOSK")){
            webView.loadUrl("https://www.zoosk.com/");
        } else if (item.equals("KRISHNA SONG")){
            webView.loadUrl("https://gaana.com/playlist/gaana-dj-krishna");
        }
    }
}
