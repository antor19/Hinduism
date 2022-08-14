package com.antor.hinduism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ekadoshiActivity extends AppCompatActivity {


    ListView listView;
    Animation Listview_top,Listview_bottom;

    ArrayList <HashMap<String, String> > arrayList = new ArrayList();
    HashMap <String, String>hashMap;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antor);
        listView = findViewById(R.id.listview);

        listView = findViewById(R.id.listview);

        //Animation
        Listview_top = AnimationUtils.loadAnimation(this, R.anim. listview_top);
        Listview_bottom = AnimationUtils.loadAnimation(this, R.anim.listview_bottom);

        listView.setAnimation(Listview_top);
        listView.setAnimation(Listview_bottom);


        hashMap = new HashMap<>();
        hashMap.put("name"," তারিখ:১৩-জানুযারী-২০২২ ইং\n" +
                " বার: বৃহস্পতিবার\n" +
                " একাদশীর নাম: পুত্রদা");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৬:৪২ থেকে ১০:১৯ মি: মধ্যে ঢাকা, বাংলাদেশ সময় \n এবং সকাল ০৬:১৮ থেকে ০৯:৫৬ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৮-জানুযারী-২০২২ ইং\n" +
                " বার: শুক্রবার\n" +
                " একাদশীর নাম: ষটতিলা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৬:৪০ থেকে ১০:২১ মি: মধ্যে ঢাকা, বাংলাদেশ সময় \n এবং সকাল ০৬:১৬ থেকে ০৯:৫৮ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১২-ফেব্রুয়ারি-২০২২ ইং\n" +
                " বার: শনিবার\n" +
                " একাদশীর নাম: ভৈমী");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৬:৩২ থেকে ১০:১৯ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৬:০৯ থেকে ০৯:৫৭ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৭-ফেব্রুয়ারি-২০২২ ইং\n" +
                " বার: রবিবার\n" +
                " একাদশীর নাম: বিজয়া");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৬:২১ থেকে ১০:১৪ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৫৮ থেকে ০৯:৫২ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১৪-মার্চ-২০২২ ইং\n" +
                " বার: সোমবার\n" +
                " একাদশীর নাম: আমলকী ব্রত");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৬:০৭ থেকে ১০:০৭ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৪৫ থেকে ০৯:৪৫ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৮-মার্চ-২০২২ ইং\n" +
                " বার: সোমবার\n" +
                " একাদশীর নাম: পাপমোচনী");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:৫৩ থেকে ১০:০০ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৩২ থেকে ০৯:৩৮ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১৩-এপ্রিল-২০২২ ইং\n" +
                " বার: বুধবার\n" +
                " একাদশীর নাম: কামদা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:৩৮ থেকে ০৯:৫২ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:১৬ থেকে ০৯:৩০ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৬-এপ্রিল-২০২২ ইং\n" +
                " বার: মঙ্গলবার\n" +
                " একাদশীর নাম: বরুথিনী");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৭:১৪ থেকে ০৯:৪৬ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৬:৪৪ থেকে ০৯:২৪ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১২-মে-২০২২ ইং\n" +
                " বার: বৃহস্পতিবার\n" +
                " একাদশীর নাম: মোহিনী");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৫:১৭ থেকে ০৯:৪২ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৪:৫৭ থেকে ০৯:২০ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৬-মে-২০২২ ইং\n" +
                " বার: বৃহস্পতিবার\n" +
                " একাদশীর নাম: অপরা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:১২ থেকে ০৯:৪১ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৪:৫২ থেকে ০৯:১৯ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১১-জুন-২০২২ ইং\n" +
                " বার: শনিবার\n" +
                " একাদশীর নাম: পান্ডবা নির্জলা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:১০ থেকে ০৯:৪২ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৪:৫১ থেকে ০৯:২১ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৪-জুন-২০২২ ইং\n" +
                " বার: শুক্রবার\n" +
                " একাদশীর নাম: যোগিনী");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৬:১৩ থেকে ০৯:৪৪ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৪৪ থেকে ০৯:২৪ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১০-জুলাই-২০২২ ইং\n" +
                " বার: রবিবার\n" +
                " একাদশীর নাম: শয়ন");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:১৮ থেকে ০৯:৪৮ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৪:৫৯ থেকে ০৯:২৮ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৪-জুলাই-২০২২ ইং\n" +
                " বার: রবিবার\n" +
                " একাদশীর নাম: কামিকা");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৫:২৪ থেকে ০৯:৫১ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:০৫ থেকে ০৯:৩০ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ০৮-আগস্ট-২০২২ ইং\n" +
                " বার: সোমবার\n" +
                " একাদশীর নাম: পবিত্রারোপণী");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:৩১ থেকে ০৯:৫২ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:১১ থেকে ০৯:৩১ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২৩-আগস্ট-২০২২ ইং\n" +
                " বার: মঙ্গলবার\n" +
                " একাদশীর নাম: অন্নদা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:৩৭ থেকে ০৯:০২ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:১৬ থেকে ০৮:৩৩ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ০৭-সেপ্টেম্বর-২০২২ ইং\n" +
                " বার: বুধবার\n" +
                " একাদশীর নাম: পাশর্");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:৪২ থেকে ০৯:৫১ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:২১ থেকে ০৯:২৯ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২১-সেপ্টেম্বর-২০২২ ইং\n" +
                " বার: বুধবার\n" +
                " একাদশীর নাম: ইন্দিরা");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৬:৩২ থেকে ০৯:৪৯ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৬:০৩ থেকে ০৯:২৮ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ০৬-অক্টোবর-২০২২ ইং\n" +
                " বার: বৃহস্পতিবার\n" +
                " একাদশীর নাম: পাশাষ্কুশা");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৫:৫২ থেকে ০৭:৫৮ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৩০ থেকে ০৭:২৯ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২১-অক্টোবর-২০২২ ইং\n" +
                " বার: শুক্রবার\n" +
                " একাদশীর নাম: রমা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৫:৫৮ থেকে ০৯:৪৮ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৩৫ থেকে ০৯:২৫ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ০৪-নভেম্বর-২০২২ ইং\n" +
                " বার: শুক্রবার\n" +
                " একাদশীর নাম: উত্থান");
        hashMap.put("number"," পারনের সময় (পরের দিন): সকাল ০৬:০৬ থেকে ০৯:৪৯ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৪২ থেকে ০৯:২৭ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ২০-নভেম্বর-২০২২ ইং\n" +
                " বার: রবিবার\n" +
                " একাদশীর নাম: উৎপন্না");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৬:১৬ থেকে ০৯:৫৪ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৫:৫২ থেকে ০৯:৩২ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ০৪-ডিসেম্বর-২০২২ ইং\n" +
                " বার: রবিবার\n" +
                " একাদশীর নাম: মোহ্মদা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৬:২৬ থেকে ০৯:৩০ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৬:০২ থেকে ০৯:৩৮ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","তারিখ: ১৯-ডিসেম্বর-২০২২ ইং\n" +
                " বার: সোমবার\n" +
                " একাদশীর নাম: সফলা");
        hashMap.put("number","পারনের সময় (পরের দিন): সকাল ০৮:৩৮ থেকে ১০:০৯ মি: মধ্যে ঢাকা, বাংলাদেশ সময় এবং সকাল ০৮:০৮ থেকে ০৯:৪৬ মি: মধ্যে কলকাতা, ভারত সময়।");
        arrayList.add(hashMap);


        hashMap = new HashMap<>();
        hashMap.put("name","হরে কৃষ্ণ মহামন্ত্র জপ করুন ও সুখী হোন-শ্রীল প্রভুপাদ\n");
        hashMap.put("number"," হরে কৃষ্ণ হরে কৃষ্ণ\n" +
                " কৃষ্ণ কৃষ্ণ হরে হরে।\n" +
                " হরে রাম হরে রাম\n" +
                " রাম রাম হরে হরে।");
        arrayList.add(hashMap);



        MyAdapter myAdapter = new MyAdapter();
        listView.setAdapter(myAdapter);


    }

    private class MyAdapter extends BaseAdapter {



        @Override
        public int getCount() {
            return arrayList.size();
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
        public View getView(int position, View convertView, ViewGroup viewGroup) {


            LayoutInflater layoutInflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View myView = layoutInflater.inflate(R.layout.listitem, viewGroup, false);

            TextView textView = myView.findViewById(R.id.textView);
            TextView textView2 = myView.findViewById(R.id.textView2);

            HashMap<String, String> hashMap = arrayList.get(position);

            textView.setText(hashMap.get("name"));
            textView2.setText(hashMap.get("number"));

            return myView;
        }
    }
}