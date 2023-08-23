package com.ebm.multijuegos;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class GameLoader extends AppCompatActivity {

    WebView web;
    private InterstitialAd mInterstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_loader);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(@NonNull InitializationStatus initializationStatus) {

            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this, "ca-app-pub-3940256099942544/1033173712", adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                mInterstitialAd = null;
            }

            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
               mInterstitialAd = interstitialAd;
            }
        });

        String webAdddress = getIntent().getStringExtra("WEB_PASSING");

        web = (WebView) findViewById(R.id.web);

        //Cargando la url en la web
        web.loadUrl(webAdddress);

        //esto habilitará javascipt
        web.getSettings().setJavaScriptEnabled(true);

        //WebViewClient le permite manejar onPageFinished y anular la carga de Url
        web.setWebViewClient(new WebViewClient());

    }
    @Override
    public void onBackPressed(){
        if (mInterstitialAd != null){
            mInterstitialAd.show(GameLoader.this);

            mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    GameLoader.super.onBackPressed();
                }
            });
        }else if (web.canGoBack()){
            web.goBack();
        }else{
            super.onBackPressed();
        }
    }
}