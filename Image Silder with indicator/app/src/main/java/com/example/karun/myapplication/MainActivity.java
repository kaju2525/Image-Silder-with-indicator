package com.example.karun.myapplication;

import android.os.Bundle;
import android.support.graphics.drawable.VectorDrawableCompat;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.RemoteBanner;
import ss.com.bannerslider.views.BannerSlider;

public class MainActivity extends AppCompatActivity {

    private BannerSlider bannerSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);

        bannerSlider = (BannerSlider) findViewById(R.id.banner_slider1);
        addBanners();

    }

    private void addBanners() {

        List<Banner> remoteBanners = new ArrayList<>();
        //Add banners using image urls
        remoteBanners.add(new RemoteBanner(
                "https://st.hzcdn.com/simgs/d161cb1a041af81f_4-3605/tropical-swimming-pool.jpg"
        ));
        remoteBanners.add(new RemoteBanner(
                "http://d27k8xmh3cuzik.cloudfront.net/wp-content/uploads/2016/02/awesome-taj-mahal.jpg"
        ));
        remoteBanners.add(new RemoteBanner(
                "https://qrius.com/wp-content/uploads/2018/02/3945439186_20c988a9aa_b-1024x570.jpg"
        ));
        remoteBanners.add(new RemoteBanner(
                "https://s-media-cache-ak0.pinimg.com/originals/46/43/f0/4643f0a29637b28c03e8f45072b27d0c.gif"
        ));
        bannerSlider.setBanners(remoteBanners);


    }
}