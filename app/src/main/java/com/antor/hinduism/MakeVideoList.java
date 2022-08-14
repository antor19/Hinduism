
package com.antor.hinduism;

import java.util.ArrayList;
import java.util.HashMap;

public class MakeVideoList {

	public static ArrayList< ArrayList<HashMap<String,String>> > rootArrayList;
	public static ArrayList< HashMap<String, String> > catArrayList;
	public static ArrayList< HashMap<String, String> > videoArrayList;
	public static HashMap<String, String> hashMap;


	//--------------------------------------------------------------------------------------------
	//===============================Some automation by antor
	public static void addVideoItem(String video_id, String title, String desciption){
		hashMap = new HashMap<>();
		hashMap.put("vdo_id", video_id);
		hashMap.put("vdo_title", title);
		hashMap.put("vdo_desciption", desciption);
		videoArrayList.add(hashMap);
	}
	//========================================================================
	//===============================Some automation by antor
	public static void createPlayListForVideo(String category_name, Integer drawable){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by antor
	public static void createCategoryForWebsite(String category_name, Integer drawable, String url){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("url", url);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================

	//===============================Some automation by antor
	public static void createCategoryForPDF(String category_name, Integer drawable, String pdfAssetName){
		rootArrayList.add(videoArrayList);
		hashMap = new HashMap<>();
		hashMap.put("category_name", category_name);
		hashMap.put("img", String.valueOf(drawable));
		hashMap.put("pdfAssetName", pdfAssetName);
		catArrayList.add(hashMap);
		videoArrayList = new ArrayList<>();
	}
	//========================================================================





	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//----------------------------------------------------
	public static void createMyAlbums(){

		rootArrayList = new ArrayList();
		catArrayList = new ArrayList<>();
		videoArrayList = new ArrayList<>();

		/*
		//========================Video Item Category
		/*
		addVideoItem("GgaxcNmm4UU", "Ei Mom Jochonay | Madhubanti Mukherjee", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("qPna1ZlRxTo", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("hegsoEcow8Q", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		addVideoItem("kLHCDZeTVJk", "Allah di kasam tu mainu enna pyara ho gaya", "Teri har cheez jannat ae -hasna vi jannt ae");
		createPlayListForVideo("Funny Dog", R.drawable.category_1);

		//=========================Category for website loader
		createCategoryForWebsite("Prothom Alo", R.drawable.category_2, "https://www.prothomalo.com/");

		//=========================Category for website loader
		createCategoryForWebsite("PDF FromUrl", R.drawable.category_3, "https://drive.google.com/file/d/1vB-oWIwJU6KuIKnIoqWukjZEyNjrd7IJ/view?usp=sharing");

		//===========================Category for PDF Viewer
		createCategoryForPDF("PDF FromAsset", R.drawable.category_4, "my_sample_pdf.pdf");
		//==========================================================================*
		 */


		createCategoryForWebsite("একাদশী তালিকা", R.drawable.category_2, "jubayer");



		/*
		createCategoryForWebsite("Student", R.drawable.category_2, "https://deendarpartner.com/");

		 */


		/*
		createCategoryForWebsite("BBC Bangla", R.drawable.category_3, "https://www.bbc.com/bengali");

		 */


		//===========================

		createCategoryForPDF("মন্ত্র", R.drawable.category_4, "Montro.pdf");


		addVideoItem("26noL9pZyLQ", "Hare Krishno (হরে কৃষ্ণ) |", "Madol Folk Band | Dr. Tapan Roy | Krishna Kirtan | SVF Devotional");
		addVideoItem("RNHWyENQD2Q", "Brindabono Bilashini (বৃন্দাবন বিলাসিনী) |", "Kirtan - শুক সারির দ্বন্দ্ব | Pousali | SVF Devotional");
		addVideoItem("ARpkW82yHVI", "Nitai Gaur Premanande Hari Hari Bol||", "||Iskcon, H.G Kamal Gopal Das, Short Clip, (Hare Krishna)||");
		addVideoItem("Jc0vlJnBTCw", "শ্রীকৃষ্ণের ১০৮ নাম (কথাসহ) ।।", "108 Names of Lord Sri Krishna with Lyrics | GOPAL KRISHNA");
		addVideoItem("630n8fc1Zkg", "সন্ধ্যাকালীন হরিনাম সংকীর্তন||", "সন্ধ্যা আরতি কির্তন।");
		addVideoItem("jBX7Bod_nbg", "তুলসী কৃষ্ণ প্রেয়সী নমঃ নমঃ ", "তুলসী আরতি || তুলসী কৃষ্ণ প্রেয়সী নমঃ নমঃ");
		addVideoItem("qEHZ6m9CGJ8", "|নগর কির্ত্তণ|", "Pravati | প্রভাতী | অপূর্ব ভোর হরিনাম সংকীর্তন | vorer gan kirtan |");
		addVideoItem("E0jXDY8W6oI", "Hare Krishna Kirtan", "|| Hare Krishna Hare Rama Kirtan || Maha Mantra Kirtan");
		addVideoItem("8_q-tXSaYTM", "হরি হরায় নামো কৃষ্ণ", "|| Hare Krishna | Hare Krishna sweet song ||");
		addVideoItem("P_YrUVZdulw", "শ্রী গুরু চরণ পদ্ম ", "||Sri Guru Carana Padma_ গুরু ভজন_Guru Bhajans ||");
		addVideoItem("Z3VlBH-ETas", "Sri Krishna caitanya prabhu", "|| Sri Krishna caitanya prabhu doya koro more by Biswajit Das Brahamachari||");
		addVideoItem("9h0gip4k8O4", "Hare Krishna Kirtan ||", "||Mathura Jivan Prabhu on Day 2 of ISKCON Mira Road Kirtan Mela 2016||");
		addVideoItem("Me84VgOk2_4", "শ্যামেরও বাঁশি বাজে কোন সে ব্রজপুরে", "||Shyamero Banshi Baje Kon Se Brajopure | Krishna Bhajan |||");
		addVideoItem("Ej7oak3pLa4", "শ্রীকৃষ্ণের অষ্টোত্তর শতনাম | ", "||কৃষ্ণের শতনাম|Sri Krishner Astottara Satanam Bengali||");
		addVideoItem("j4WEHw1tb_k", "বলো কৃষ্ণ কৃষ্ণ হরে হরে ||", "|| Modhu makha ei nam || উত্তম কুমার মন্ডল || ||");
		addVideoItem("Au4JK8mjgxA", "হরে কৃষ্ণ হরে কৃষ্ণ কৃষ্ণ", "|| হরে কৃষ্ণ হরে কৃষ্ণ কৃষ্ণ কৃষ্ণ হরে হরে হরে রাম হরে রাম রাম রাম হরে হরে ||");
		addVideoItem("XvN6TzouOPM", "Tumi Krishna Tumi Bishnu |", "|| হরে কৃষ্ণ মধুর নাম | Tumi Krishna Tumi Bishnu | Asha Bhosle & Bappi Lahiri ||");
		addVideoItem("Z3VlBH-ETas", "Sri Krishna caitanya prabhu", "|| Sri Krishna caitanya prabhu doya koro more by Biswajit Das Brahamachari||");
		createPlayListForVideo("কীর্তন গান", R.drawable.krishnaa);


		//==========================================================================*

		createCategoryForWebsite("বাংলা পঞ্জিকা", R.drawable.category_4, "https://drive.google.com/file/d/1zOWUzVyWM8cqxD_O9GLDBEhCbuETwqV2/view?usp=sharing");

		/*
		addVideoItem("4fjJr8xnatI", "Bangla Geeta Path | সম্পূর্ণ র্গীতা পাঠ বাংলায় |", "১-১৮ অধ্যায় গীতা পাঠ | বাংলা অনুবাদসহ");
		createPlayListForVideo("গীতা পাঠ", R.drawable.category_1);

		 */

		createCategoryForWebsite("বাংলা গীতা", R.drawable.category_3, "https://drive.google.com/file/d/1_N5tStTDfZ4C7P19BAVc0WEkF_d--y5e/view?usp=sharing");



		addVideoItem("PXNuCz7MIJM", "শ্রীমদ্ভগবদ্গীতা - অষ্টাদশ অধ্যায় - সন্ন্যাস যোগ |", "সন্ন্যাস যোগ | Srimad Bhagavad Gita Adhyay - Bengali");
		addVideoItem("cj2SEhqMWvA", "শ্রীমদ্ভগবদ্গীতা - সপ্তদশ অধ্যায় - ওঁ তৎসৎ ও শ্রদ্ধাত্রয় বিভাগ যোগ |", "ওঁ তৎসৎ ও শ্রদ্ধাত্রয় বিভাগ যোগ | Bhagavad Gita Bangla Adhyay");
		addVideoItem("2F9PQrY950g", "শ্রীমদ্ভগবদ্গীতা - ষষ্ঠদশ অধ্যায় - দৈবাসুর সম্পদ্ বিভাগ যোগ |", " দৈবাসুর সম্পদ্ বিভাগ যোগ | Bhagavad Gita Bengali - Chapter 16");
		addVideoItem("bwHFso-A9hE", "শ্রীমদ্ভগবদ্গীতা - পঞ্চদশ অধ্যায় - পুরুষোত্তম যোগ |", "পুরুষোত্তম যোগ | Srimad Bhagavad Gita in Bengali - Chapter 15");
		addVideoItem("B9EKyN7vg08", "শ্রীমদ্ভগবদ্গীতা - চতুর্দশ অধ্যায় - গুণত্রয় বিভাগ যোগ |", "গুণত্রয় বিভাগ যোগ | Srimad Bhagavad Gita Bengali - Chapter 14");
		addVideoItem("RgenRZP_5d8", "শ্রীমদ্ভগবদ্গীতা - ত্রয়োদশ অধ্যায় - ক্ষেত্র-ক্ষেত্রজ্ঞ বিভাগ যোগ|", "ক্ষেত্র-ক্ষেত্রজ্ঞ বিভাগ যোগ, Bhagavad Gita Bangla Chapter 13");
		addVideoItem("KnhVFtVwix0", "শ্রীমদ্ভগবদ্গীতা -  দশম অধ্যায় - বিভূতি বর্ণন |", "বিভূতি বর্ণন | Srimad Bhagavad Gita in Bengali - Chapter 10");
		addVideoItem("xwWx7lY0Js8", "শ্রীমদ্ভগবদ্গীতা - নবম অধ্যায় - রাজবিদ্যা জাগৃতি |", " রাজবিদ্যা জাগৃতি | Srimad Bhagavad Gita in Bengali - Chapter 9||");
		addVideoItem("NSVu_1G7XyM", "শ্রীমদ্ভগবদ্গীতা - অষ্টম অধ্যায় - অক্ষর ব্রহ্মযোগ |", "যথার্থ গীতা - অক্ষর ব্রহ্মযোগ | Bhagavad Gita Bengali Chapter 8");
		addVideoItem("_7yhQowdsBo", "শ্রীমদ্ভগবদ্গীতা - সপ্তম অধ্যায় - সমগ্র যোগ ||", "সমগ্র যোগ | Srimad Bhagavad Gita in Bengali Adhyay");
		addVideoItem("vqg8Ooqqt34", "শ্রীমদ্ভগবদ্গীতা - ষষ্ঠ অধ্যায় - অভ্যাস যোগ|", "অভ্যাস যোগ");
		addVideoItem("WzpTCbmvgAU", "শ্রীমদ্ভগবদ্গীতা - পঞ্চম অধ্যায় - যজ্ঞভোক্তা মহাপুরুষস্থ মহেশ্বর |", "যজ্ঞভোক্তা মহাপুরুষস্থ মহেশ্বর | Bhagavad Gita Bangla, Chapter 5");
		addVideoItem("DVZjW9DFv3Y", "শ্রীমদ্ভগবদ্গীতা - চতুর্থ অধ্যায় - যজ্ঞকর্ম স্পষ্টীকরণ ||", "|যজ্ঞকর্ম স্পষ্টীকরণ | Bhagavad Gita in Bangla - Chapter 4|");
		addVideoItem("eT5wnguAn3U", "শ্রীমদ্ভগবদ্গীতা - তৃতীয় অধ্যায় - শত্রুবিনাশ প্রেরণা |", " শত্রুবিনাশ প্রেরণা | Srimad Bhagavad Gita in Bengali Chapter 3");
		addVideoItem("s1sRdPc2FJc", "শ্রীমদ্ভগবদ্গীতা - প্রথম অধ্যায় - সংশয়-বিষাদ যোগ", " সংশয়-বিষাদ যোগ | Srimad Bhagavad Gita Bangla Chapter 1");
		addVideoItem("yCz4hur6JDU", "শ্রীমদ্ভগবদ্গীতা - একাদশ অধ্যায় - বিশ্বরূপ দর্শন যোগ  ", "বিশ্বরূপ দর্শন যোগ | Srimad Bhagavad Gita Bangla - Chapter 11");
		addVideoItem("r3HU62vMOeo", "শ্রীমদ্ভগবদ্গীতা - দ্বিতীয় অধ্যায় -  কর্মজিজ্ঞাসা", "দ্বিতীয় অধ্যায় - কর্মজিজ্ঞাসা | Bhagavad Gita Bangla Chapter 2");
		addVideoItem("iP8Ktc_WVl4", "শ্রীমদ্ভগবদ্গীতা - দ্বাদশ অধ্যায় -  ভক্তিযোগ", "Gita Path || গীতা পাঠ || শ্রী প্রদর্শন দেবনাথ || ");
		createPlayListForVideo("গীতা পাঠ", R.drawable.category_1);


		createCategoryForWebsite("হিন্দি গীতা", R.drawable.category_3, "https://drive.google.com/file/d/1cRTQBP0XvuztfOMEa6vw7BdPR-wbjGyS/view?usp=sharing");
		createCategoryForWebsite("সংস্কৃত গীতা", R.drawable.category_3, "https://drive.google.com/file/d/1nZad2MNcdG-XXggV8S7pKajm20JAQE1Z/view?usp=sharing");


		/*
		createCategoryForWebsite("English Gita", R.drawable.category_4, "https://drive.google.com/file/d/1GQ79qH27WSq9wCZ53wvbja22lMRjnuir/view?usp=sharing");

		 */


		//========================Video Item Category




		//=========================



















	}

	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>
	//---------------------------------------------------->>>>>>




}
