package com.antor.hinduism;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.airbnb.lottie.LottieAnimationView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;

public class MyPDFViewer extends AppCompatActivity {

    PDFView pdfView;
    LottieAnimationView myLottie;
    ImageView imgBack;
    TextView pdfTitle;
    public  static  String PDF_ASSET_NAME = "";
    public  static  String PDF_TITLE = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdf_page);
        pdfView = findViewById(R.id.pdfView);
        myLottie = findViewById(R.id.myLottie);
        imgBack = findViewById(R.id.imgBack);
        pdfTitle = findViewById(R.id.pdfTitle);


        pdfTitle.setText(""+PDF_TITLE);
        pdfView.setVisibility(View.INVISIBLE);
        myLottie.setVisibility(View.VISIBLE);


        pdfView.fromAsset(PDF_ASSET_NAME)
                .onLoad(new OnLoadCompleteListener() {
                    @Override
                    public void loadComplete(int nbPages) {

                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.postDelayed(new Runnable() {
                            @Override
                            public void run() {

                                pdfView.setVisibility(View.VISIBLE);
                                myLottie.setVisibility(View.GONE);
                            }
                        }, 1500);

                    }
                })
                .load();

        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });



    }
}