package com.antor.hinduism;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Home extends AppCompatActivity {



    MediaPlayer mySong;
    AdView mAdView;
    public static int CategoryClicked = -10;
    ImageSlider imageSlider;
    ExpandableHeightGridView mainGrid;
    /*
    RelativeLayout rLayRateUs;
     */
    Intent targetActivity;

    // per app run-- do not show more than 3 fullscreen ad. [[Change it if your want]]
    int fullScreenAdMaxShowCount = 3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_home);


        mAdView = findViewById(R.id.adView);
        imageSlider = findViewById(R.id.image_slider);
        mainGrid = findViewById(R.id.mainGrid);

        adSettings();

        /*
        rLayRateUs = findViewById(R.id.rLayRateUs);

         */
        mAdView.setVisibility(View.GONE);
        mySong=MediaPlayer.create(getApplicationContext(),R.raw.gayatri);
        mySong.start();

        if (getString(R.string.show_admob_ad).contains("ON")){
            initAdmobAd();
            loadBannerAd();
            loadFullscreenAd();
        }

        createSlider();
        MakeVideoList.createMyAlbums();
        ///rateUsOnGooglePlay();

        MyAdapter adapter = new MyAdapter();
        mainGrid.setExpanded(true);
        mainGrid.setAdapter(adapter);
        adapter.notifyDataSetChanged();



    } //------------------------------onCreate (bundle) ENDS here

    private void adSettings() {

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference reference = database.getReference("ads");

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String settings = snapshot.child("settings").getValue(String.class);

                if(settings.contains("ON")){

                    initAdmobAd();
                    loadBannerAd();
                    loadFullscreenAd();
                    mAdView.setVisibility(View.VISIBLE);

                }else{
                    mAdView.setVisibility(View.VISIBLE);
                    if (settings.contains("OFF")){
                        initAdmobAd();
                        loadBannerAd();
                        loadFullscreenAd();
                        mAdView.setVisibility(View.GONE);
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }


    // ================================================================
    // ================================================================
    // ================================================================

    private void createSlider(){

        ArrayList<SlideModel> imageList = new ArrayList<>();
        //imageList.add(new SlideModel(R.drawable.slide_1, null));
        imageList.add(new SlideModel(R.drawable.slider_1, "Hare Krishna", null));
        imageList.add(new SlideModel(R.drawable.slider_2, "Hare Krishna", null));
        imageList.add(new SlideModel(R.drawable.slider_3, "Krishna Krishna", null));
        imageList.add(new SlideModel(R.drawable.slider_4, "Hare Hare", null));
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP);



        imageSlider.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemSelected(int position) {

                if (position==0){
                    Toast.makeText(getBaseContext(), "হরে কৃষ্ণ", Toast.LENGTH_SHORT).show();
                }

                if (position==1){
                    Toast.makeText(getBaseContext(), "হরে কৃষ্ণ", Toast.LENGTH_SHORT).show();
                }
                if (position==2){
                    Toast.makeText(getBaseContext(),"হরে কৃষ্ণ",Toast.LENGTH_SHORT).show();
                }
                if (position==3){
                    Toast.makeText(getBaseContext(),"হরে কৃষ্ণ",Toast.LENGTH_SHORT).show();
                }
            }
        });







    }
    // ================================================================
    // ================================================================
    // ================================================================



    private class MyAdapter extends BaseAdapter {
        private LayoutInflater inflater;

        public  MyAdapter(){
            this.inflater = (LayoutInflater) Home.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return MakeVideoList.catArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            convertView = inflater.inflate(R.layout.grid_item, parent, false);


            ImageView imgIcon = convertView.findViewById(R.id.imgIcon);
            TextView tvTitle = convertView.findViewById(R.id.tvTitle);
            LinearLayout layItem = convertView.findViewById(R.id.layItem);

            HashMap<String, String> mHashMap = MakeVideoList.catArrayList.get(position);
            String catName = mHashMap.get("category_name");
            String img = mHashMap.get("img");
            String url = mHashMap.get("url");
            String pdfAssetName = mHashMap.get("pdfAssetName");



            if (tvTitle!=null) tvTitle.setText(catName);
            if (imgIcon!=null && img!=null) {
                int drawable = Integer.parseInt(img);
                imgIcon.setImageResource( drawable );
            }

            Animation animation = AnimationUtils.loadAnimation(Home.this, R.anim.anim_grid);
            animation.setStartOffset(position*300);
            convertView.startAnimation(animation);



            if (layItem!=null){

                layItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //We are tracking the category postion. So that we can call the intent after ad loads


                        if(url!=null && url.contains("jubayer")){


                            Intent intent = new Intent(Home.this, ekadoshiActivity.class);
                            startActivity(intent);
                        }


                       else if(url!=null && url.contains("hossain")){

                            Intent intent = new Intent(Home.this, ekadoshiActivity.class);
                            startActivity(intent);
                        }


                        // Check the item is a website link
                        else if (url!=null && url.length()>5){



                            WebBrowser.WEBSITE_LINK = url;
                            WebBrowser.WEBSITE_TITLE = catName;
                            //startActivity(new Intent(Home.this, WebBrowser.class));
                            targetActivity = new Intent(Home.this, WebBrowser.class);
                            if (mInterstitialAd==null) startActivity(targetActivity);
                            else if (FULLSCREEN_AD_LOAD_COUNT>=fullScreenAdMaxShowCount) startActivity(targetActivity);
                            else mInterstitialAd.show(Home.this);

                        }

                        // Check the item is a PDF FILE OR NOT
                       else if (pdfAssetName!=null && pdfAssetName.length()>3){
                            MyPDFViewer.PDF_ASSET_NAME = pdfAssetName;
                            MyPDFViewer.PDF_TITLE = catName;
                            //startActivity(new Intent(Home.this, MyPDFViewer.class));
                            targetActivity = new Intent(Home.this, MyPDFViewer.class);
                            if (mInterstitialAd==null) startActivity(targetActivity);
                            else if (FULLSCREEN_AD_LOAD_COUNT>=fullScreenAdMaxShowCount) startActivity(targetActivity);
                            else mInterstitialAd.show(Home.this);

                        }

                       // None of the above is true. So the category is video collection type
                        else{
                            CategoryClicked = position;
                            MainActivity.arrayList = MakeVideoList.rootArrayList.get(position);
                            targetActivity = new Intent(Home.this, MainActivity.class);
                            if (mInterstitialAd==null) startActivity(targetActivity);
                            else if (FULLSCREEN_AD_LOAD_COUNT>=fullScreenAdMaxShowCount) startActivity(targetActivity);
                            else mInterstitialAd.show(Home.this);
                        }





                    }
                });
            }



            return convertView;
        }
    }




    //=============================================
    //=============================================
    //=============================================









    int BANNER_AD_CLICK_COUNT =0;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    private void loadBannerAd(){
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        mAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                // Code to be executed when an ad finishes loading.
                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }else{
                    if(mAdView!=null) mAdView.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
                BANNER_AD_CLICK_COUNT++;

                if (BANNER_AD_CLICK_COUNT >=3){
                    if(mAdView!=null) mAdView.setVisibility(View.GONE);
                }

            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>













    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    // loadFullscreenAd method starts here.....
    InterstitialAd mInterstitialAd;
    int FULLSCREEN_AD_LOAD_COUNT=0;
    private void loadFullscreenAd(){

        //Requesting for a fullscreen Ad
        AdRequest adRequest = new AdRequest.Builder().build();
        InterstitialAd.load(this,getString(R.string.admob_INTERSTITIAL_UNIT_ID), adRequest, new InterstitialAdLoadCallback() {
            @Override
            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                // The mInterstitialAd reference will be null until
                // an ad is loaded.
                mInterstitialAd = interstitialAd;

                //Fullscreen callback || Requesting again when an ad is shown already
                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                    @Override
                    public void onAdDismissedFullScreenContent() {
                        // Called when fullscreen content is dismissed.
                        //User dismissed the previous ad. So we are requesting a new ad here
                        FULLSCREEN_AD_LOAD_COUNT++;
                        loadFullscreenAd();
                        Log.d("FULLSCREEN_AD", ""+FULLSCREEN_AD_LOAD_COUNT);

                        if (targetActivity!=null) startActivity(targetActivity);

                    }

                }); // FullScreen Callback Ends here


            }
            @Override
            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                // Handle the error
                mInterstitialAd = null;
            }

        });

    }


    // loadFullscreenAd method ENDS  here..... >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


    private void initAdmobAd(){

        if (getString(R.string.device_id).length()>12){
            //Adding your device id -- to avoid invalid activity from your device
            List<String> testDeviceIds = Arrays.asList(getString(R.string.device_id));
            RequestConfiguration configuration =
                    new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
            MobileAds.setRequestConfiguration(configuration);
        }




        //Init Admob Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

    }



    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


   /// private void rateUsOnGooglePlay(){
       /// rLayRateUs.setOnClickListener(new View.OnClickListener() {
         ///   @Override
          ///  public void onClick(View v) {

            ///    final String appPackageName = getPackageName(); // getPackageName() from Context or Activity object
            ///    try {
             ///       startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + appPackageName)));
             ///   } catch (android.content.ActivityNotFoundException an fe) {
             ///       startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/details?id=" + appPackageName)));
             ///   }

          ///  }
      ///  });

 ///   }



    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>



    ///====================================================
   private static final int TIME_INTERVAL = 2000; // # milliseconds, desired
   private long mBackPressed;

    // When user click bakpress button this method is called
    @Override
    public void onBackPressed() {
        // When user press back button

           if (mBackPressed + TIME_INTERVAL > System.currentTimeMillis()) {
           Intent intent = new Intent(Intent.ACTION_MAIN);
           intent.addCategory(Intent.CATEGORY_HOME);
           intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

         } else {

            Toast.makeText(getBaseContext(), "Press again to exit",
                    Toast.LENGTH_SHORT).show();

            }

     mBackPressed = System.currentTimeMillis();
        mySong.release();




    } // end of onBackpressed method






    //#############################################################################################


}