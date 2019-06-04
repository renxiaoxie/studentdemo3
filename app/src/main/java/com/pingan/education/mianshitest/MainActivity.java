package com.pingan.education.mianshitest;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=null;
        //dasfda
        //ddddd
        Glide.with(this).load("").into(imageView);
        Handler handler = new Handler(

        );

        //okhttp 源码分析
        OkHttpClient okHttpClient =new OkHttpClient.Builder().cache(new Cache(new File("cache"),24*1024*1024)).build();
        OkHttpClient client = new OkHttpClient();
        Request request =new Request.Builder().
                url("").
                build();
        Call call = client.newCall(request);
        //同步
        try {
            call.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //异步
       call.enqueue(new Callback() {
           @Override
           public void onFailure(Call call, IOException e) {

           }

           @Override
           public void onResponse(Call call, Response response) throws IOException {
            //子线程中
           }
       });

    }
}
