package com.example.iyashwant.spiderprojectprototype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.iyashwant.spiderprojectprototype.signup.actor_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.actress_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.assis_dir_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.childart_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.choreo_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.dance_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.dialoguewriter_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.lyricist_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.screenplaywriters_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.side_art_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.sing_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.storyboard_craft;

public class signup3 extends AppCompatActivity {

   boolean is_dance=false,is_additional=false,is_dir=false,is_dial=false,is_crew=false,is_produce=false,is_shortfilm=false,is_sing=false,is_swim=false,is_sport=false,is_own_soundtrack=false,is_own_lyric=false,is_classic_train=false,is_dubsmash=false,is_tvshow=false,is_passport=false,is_own_choreo=false,is_prior_exp=false;
   String dialogue,group_size,dance_styles,design_on,design_type,list_lang,additional,dance_styles_dancer,own_choreo,short_film,interest_in,sound_track,ly_ric,classic_traintime,dub_smash,TV_show,sing_styles,sports_kind,prior_exp_desc,prior_exp_link,bio,interested_roles,hobbies,guardian_rel,parent_name,parent_cont_no,photo_link,video_link;
    String[] actor_61string={"If yes, then what kind?",
            "Feature Films", "TV Shows", "Short Films", "College Culturals", "Anchor", "Hosts", "Other"};

    String[] actress_61string={"If yes, then what kind?",
            "Feature Films", "TV Shows", "Short Films", "College Culturals", "Anchor", "Hosts", "Other"};
    String[] child_l3string={"Mother","Father","Other"

    };

    String[] side_61string={"If yes, then what kind?",
            "Feature Films", "TV Shows", "Short Films", "College Culturals", "Anchor", "Hosts", "Other"};

    String[] child_41string={"If yes, then what kind?",
            "Feature Films", "TV Shows", "Short Films", "College Culturals", "Anchor", "Hosts", "Other"};

    String[] singer_3string={"Select your singing style",
            "Choir / Orchestra", "Soloist", "Opera / Chinese Opera", "Gospel", "Traditional Music", "Carnatic", "Folk / Country", "Ghana", "Ghazal", "Rap", "World Music", "Jazz", "Blues", "Pop and Rock", "Others"};

    String[] dancer_3string={"Please Select Your Dancing Style","Hip hop","Classical","Slow","Other"};

    String[] dancer_6string={"What are you interested in?",
            "Dancing", "Choreographing", "Both"};
    
    String[] sba_2string={"What do you design storyboards on?",
            "Pen & Paper", "Computer", "Both"};
    
    String[] sba_3string={"What are your story boards like?",
            "Static Pics", "Animated", "Both"};

    String[] choreo_3string={"Please Select Your Dancing Style","Hip hop","Classical","Slow","Other"};
    
    EditText BIO,ROLES,HOBBIES,PHOTO_LINK,VIDEO_LINK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);


         BIO=(EditText) findViewById(R.id.editText1);
        ROLES=(EditText) findViewById(R.id.editText2);
        HOBBIES=(EditText) findViewById(R.id.editText3);
        PHOTO_LINK = (EditText) findViewById(R.id.editText4);
        VIDEO_LINK=(EditText) findViewById(R.id.editText5);


        final LinearLayout actor = (LinearLayout) findViewById(R.id.actor);
        actor.setVisibility(View.GONE);
        final RadioGroup actor_1radio = (RadioGroup) findViewById(R.id.actor_1radio);
        RadioButton actor_1radioyes = (RadioButton) findViewById(R.id.actor_1radioyes);
        final EditText actor_11 = (EditText) findViewById(R.id.actor_11);
        actor_11.setVisibility(View.GONE);
        RadioGroup actor_2radio = (RadioGroup) findViewById(R.id.actor_2radio);
        RadioButton actor_2radioyes = (RadioButton) findViewById(R.id.actor_2radioyes);
        final EditText actor_22 = (EditText) findViewById(R.id.actor_22);
        actor_22.setVisibility(View.GONE);
        RadioGroup actor_3radio = (RadioGroup) findViewById(R.id.actor_3radio);
        RadioButton actor_3radioyes = (RadioButton) findViewById(R.id.actor_3radioyes);
        RadioGroup actor_4radio = (RadioGroup) findViewById(R.id.actor_4radio);
        RadioButton actor_4radioyes = (RadioButton) findViewById(R.id.actor_4radioyes);
        final EditText actor_41 = (EditText) findViewById(R.id.actor_41);
        actor_41.setVisibility(View.GONE);
        RadioGroup actor_5radio = (RadioGroup) findViewById(R.id.actor_5radio);
        RadioButton actor_5radioyes = (RadioButton) findViewById(R.id.actor_5radioyes);
        RadioGroup actor_6radio = (RadioGroup) findViewById(R.id.actor_6radio);
        RadioButton actor_6radioyes = (RadioButton) findViewById(R.id.actor_6radioyes);
        final Spinner actor_61 = (Spinner) findViewById(R.id.actor_61);
        CustomAdapterSpinner actor_61adapter=new CustomAdapterSpinner(getApplicationContext(),actor_61string);
        actor_61.setAdapter(actor_61adapter);
        actor_61.setVisibility(View.GONE);
        final EditText actor_62 = (EditText) findViewById(R.id.actor_62);
        actor_62.setVisibility(View.GONE);


        final LinearLayout actress = (LinearLayout) findViewById(R.id.actress);
        actress.setVisibility(View.GONE);
        RadioGroup actress_1radio = (RadioGroup) findViewById(R.id.actress_1radio);
        RadioButton actress_1radioyes = (RadioButton) findViewById(R.id.actress_1radioyes);
        final EditText actress_11 = (EditText) findViewById(R.id.actress_11);
        actress_11.setVisibility(View.GONE);
        RadioGroup actress_2radio = (RadioGroup) findViewById(R.id.actress_2radio);
        RadioButton actress_2radioyes = (RadioButton) findViewById(R.id.actress_2radioyes);
        final EditText actress_22 = (EditText) findViewById(R.id.actress_22);
        actress_22.setVisibility(View.GONE);
        RadioGroup actress_3radio = (RadioGroup) findViewById(R.id.actress_3radio);
        RadioButton actress_3radioyes = (RadioButton) findViewById(R.id.actress_3radioyes);
        RadioGroup actress_4radio = (RadioGroup) findViewById(R.id.actress_4radio);
        RadioButton actress_4radioyes = (RadioButton) findViewById(R.id.actress_4radioyes);
        final EditText actress_41 = (EditText) findViewById(R.id.actress_41);
        actress_41.setVisibility(View.GONE);
        RadioGroup actress_5radio = (RadioGroup) findViewById(R.id.actress_5radio);
        RadioButton actress_5radioyes = (RadioButton) findViewById(R.id.actress_5radioyes);
        RadioGroup actress_6radio = (RadioGroup) findViewById(R.id.actress_6radio);
        RadioButton actress_6radioyes = (RadioButton) findViewById(R.id.actress_6radioyes);
        final Spinner actress_61 = (Spinner) findViewById(R.id.actress_61);
        CustomAdapterSpinner actress_61adapter=new CustomAdapterSpinner(getApplicationContext(),actress_61string);
        actress_61.setAdapter(actress_61adapter);
        actress_61.setVisibility(View.GONE);
        final EditText actress_62 = (EditText) findViewById(R.id.actress_62);
        actress_62.setVisibility(View.GONE);


        final LinearLayout side = (LinearLayout) findViewById(R.id.side);
        side.setVisibility(View.GONE);
        RadioGroup side_1radio = (RadioGroup) findViewById(R.id.side_1radio);
        RadioButton side_1radioyes = (RadioButton) findViewById(R.id.side_1radioyes);
        final EditText side_11 = (EditText) findViewById(R.id.side_11);
        side_11.setVisibility(View.GONE);
        RadioGroup side_2radio = (RadioGroup) findViewById(R.id.side_2radio);
        RadioButton side_2radioyes = (RadioButton) findViewById(R.id.side_2radioyes);
        final EditText side_22 = (EditText) findViewById(R.id.side_22);
        side_22.setVisibility(View.GONE);
        RadioGroup side_3radio = (RadioGroup) findViewById(R.id.side_3radio);
        RadioButton side_3radioyes = (RadioButton) findViewById(R.id.side_3radioyes);
        RadioGroup side_4radio = (RadioGroup) findViewById(R.id.side_4radio);
        RadioButton side_4radioyes = (RadioButton) findViewById(R.id.side_4radioyes);
        final EditText side_41 = (EditText) findViewById(R.id.side_41);
        side_41.setVisibility(View.GONE);
        RadioGroup side_5radio = (RadioGroup) findViewById(R.id.side_5radio);
        RadioButton side_5radioyes = (RadioButton) findViewById(R.id.side_5radioyes);
        RadioGroup side_6radio = (RadioGroup) findViewById(R.id.side_6radio);
        RadioButton side_6radioyes = (RadioButton) findViewById(R.id.side_6radioyes);
        final Spinner side_61 = (Spinner) findViewById(R.id.side_61);
        CustomAdapterSpinner side_61adapter=new CustomAdapterSpinner(getApplicationContext(),side_61string);
        side_61.setAdapter(side_61adapter);
        side_61.setVisibility(View.GONE);
        final EditText side_62 = (EditText) findViewById(R.id.side_62);
        side_62.setVisibility(View.GONE);


        final LinearLayout child = ( LinearLayout) findViewById(R.id.child);
        child.setVisibility(View.GONE);
        final EditText child_11 = (EditText) findViewById(R.id.child_11);
        final EditText child_12 = (EditText) findViewById(R.id.child_12);
        Spinner child_13 = (Spinner) findViewById(R.id.child_13);
        CustomAdapterSpinner child_l3adapter=new CustomAdapterSpinner(getApplicationContext(),child_l3string);
        child_13.setAdapter(child_l3adapter);
        RadioGroup child_2radio = (RadioGroup) findViewById(R.id.child_2radio);
        RadioButton child_2radioyes = (RadioButton) findViewById(R.id.child_2radioyes);
        final EditText child_21 = (EditText) findViewById(R.id.child_21);
        child_21.setVisibility(View.GONE);
        RadioGroup child_3radio = (RadioGroup) findViewById(R.id.child_3radio);
        RadioButton child_3radioyes = (RadioButton) findViewById(R.id.child_3radioyes);
        final EditText child_31 = (EditText) findViewById(R.id.child_31);
        child_31.setVisibility(View.GONE);
        RadioGroup child_4radio = (RadioGroup) findViewById(R.id.child_4radio);
        RadioButton child_4radioyes = (RadioButton) findViewById(R.id.child_4radioyes);
        final Spinner child_41 = (Spinner) findViewById(R.id.child_41);
        CustomAdapterSpinner child_41adapter=new CustomAdapterSpinner(getApplicationContext(),child_41string);
        child_41.setAdapter(child_41adapter);
        child_41.setVisibility(View.GONE);
        final EditText child_42 = (EditText) findViewById(R.id.child_42);
        child_42.setVisibility(View.GONE);


        final LinearLayout singer = ( LinearLayout) findViewById(R.id.singer);
        singer.setVisibility(View.GONE);
        RadioGroup singer_1radio = (RadioGroup) findViewById(R.id.singer_1radio);
        RadioButton singer_1radioyes = (RadioButton) findViewById(R.id.singer_1radioyes);
        final EditText singer_11 = (EditText) findViewById(R.id.singer_11);
        singer_11.setVisibility(View.GONE);
        RadioGroup singer_2radio = (RadioGroup) findViewById(R.id.singer_2radio);
        RadioButton singer_2radioyes = (RadioButton) findViewById(R.id.singer_2radioyes);
        final EditText singer_21 = (EditText) findViewById(R.id.singer_21);
        singer_21.setVisibility(View.GONE);
        Spinner singer_3 = (Spinner) findViewById(R.id.singer_3);
        CustomAdapterSpinner singer_3adapter=new CustomAdapterSpinner(getApplicationContext(),singer_3string);
        singer_3.setAdapter(singer_3adapter);
        RadioGroup singer_4radio = (RadioGroup) findViewById(R.id.singer_4radio);
        RadioButton singer_4radioyes = (RadioButton) findViewById(R.id.singer_4radioyes);
        final EditText singer_41 = (EditText) findViewById(R.id.singer_41);
        singer_41.setVisibility(View.GONE);
        RadioGroup singer_5radio = (RadioGroup) findViewById(R.id.singer_5radio);
        RadioButton singer_5radioyes = (RadioButton) findViewById(R.id.singer_5radioyes);
        final EditText singer_51 = (EditText) findViewById(R.id.singer_51);
        singer_51.setVisibility(View.GONE);
        RadioGroup singer_6radio = (RadioGroup) findViewById(R.id.singer_6radio);
        RadioButton singer_6radioyes = (RadioButton) findViewById(R.id.singer_6radioyes);
        final EditText singer_61 = (EditText) findViewById(R.id.singer_61);
        singer_61.setVisibility(View.GONE);
        

        final LinearLayout dancer = ( LinearLayout) findViewById(R.id.dancer);
        dancer.setVisibility(View.GONE);
        RadioGroup dancer_1radio = (RadioGroup) findViewById(R.id.dancer_1radio);
        RadioButton dancer_1radioyes = (RadioButton) findViewById(R.id.dancer_1radioyes);
        final EditText dancer_11 = (EditText) findViewById(R.id.dancer_11);
        dancer_11.setVisibility(View.GONE);
        RadioGroup dancer_2radio = (RadioGroup) findViewById(R.id.dancer_2radio);
        RadioButton dancer_2radioyes = (RadioButton) findViewById(R.id.dancer_2radioyes);
        final EditText dancer_21 = (EditText) findViewById(R.id.dancer_21);
        dancer_21.setVisibility(View.GONE);
        Spinner dancer_3 = (Spinner) findViewById(R.id.dancer_3);
        CustomAdapterSpinner dancer_3adapter=new CustomAdapterSpinner(getApplicationContext(),dancer_3string);
        dancer_3.setAdapter(dancer_3adapter);
        RadioGroup dancer_4radio = (RadioGroup) findViewById(R.id.dancer_4radio);
        RadioButton dancer_4radioyes = (RadioButton) findViewById(R.id.dancer_4radioyes);
        final EditText dancer_41 = (EditText) findViewById(R.id.dancer_41);
        dancer_41.setVisibility(View.GONE);
        RadioGroup dancer_5radio = (RadioGroup) findViewById(R.id.dancer_5radio);
        RadioButton dancer_5radioyes = (RadioButton) findViewById(R.id.dancer_5radioyes);
        final Spinner dancer_51 = (Spinner) findViewById(R.id.dancer_51);
        dancer_51.setVisibility(View.GONE);
        final EditText dancer_52 = (EditText) findViewById(R.id.dancer_52);
        dancer_52.setVisibility(View.GONE);
        Spinner dancer_6 = (Spinner) findViewById(R.id.dancer_6);
        CustomAdapterSpinner dancer_6adapter=new CustomAdapterSpinner(getApplicationContext(),dancer_6string);
        dancer_6.setAdapter(dancer_6adapter);

        final LinearLayout assdir = ( LinearLayout) findViewById(R.id.assdir);
        assdir.setVisibility(View.GONE);
        RadioGroup assdir_1radio = (RadioGroup) findViewById(R.id.assdir_1radio);
        RadioButton assdir_1radioyes = (RadioButton) findViewById(R.id.assdir_1radioyes);
        final EditText assdir_11 = (EditText) findViewById(R.id.assdir_11);
        assdir_11.setVisibility(View.GONE);
        RadioGroup assdir_2radio = (RadioGroup) findViewById(R.id.assdir_2radio);
        RadioButton assdir_2radioyes = (RadioButton) findViewById(R.id.assdir_2radioyes);
        final EditText assdir_22 = (EditText) findViewById(R.id.assdir_22);
        assdir_22.setVisibility(View.GONE);
        RadioGroup assdir_3radio = (RadioGroup) findViewById(R.id.assdir_3radio);
        RadioButton assdir_3radioyes = (RadioButton) findViewById(R.id.assdir_3radioyes);
        RadioGroup assdir_4radio = (RadioGroup) findViewById(R.id.assdir_4radio);
        RadioButton assdir_4radioyes = (RadioButton) findViewById(R.id.assdir_4radioyes);
        RadioGroup assdir_5radio = (RadioGroup) findViewById(R.id.assdir_5radio);
        RadioButton assdir_5radioyes = (RadioButton) findViewById(R.id.assdir_5radioyes);
        RadioGroup assdir_6radio = (RadioGroup) findViewById(R.id.assdir_6radio);
        RadioButton assdir_6radioyes = (RadioButton) findViewById(R.id.assdir_6radioyes);
        

        final LinearLayout lyric = ( LinearLayout) findViewById(R.id.lyric);
        lyric.setVisibility(View.GONE);
        RadioGroup lyric_1radio = (RadioGroup) findViewById(R.id.lyric_1radio);
        RadioButton lyric_1radioyes = (RadioButton) findViewById(R.id.lyric_1radioyes);
        final EditText lyric_11 = (EditText) findViewById(R.id.lyric_11);
        lyric_11.setVisibility(View.GONE);
        final EditText lyric_12 = (EditText) findViewById(R.id.lyric_12);
        lyric_12.setVisibility(View.GONE);
        RadioGroup lyric_2radio = (RadioGroup) findViewById(R.id.lyric_2radio);
        RadioButton lyric_2radioyes = (RadioButton) findViewById(R.id.lyric_2radioyes);
        RadioGroup lyric_3radio = (RadioGroup) findViewById(R.id.lyric_3radio);
        RadioButton lyric_3radioyes = (RadioButton) findViewById(R.id.lyric_3radioyes);
        final EditText lyric_31 = (EditText) findViewById(R.id.lyric_31);
        lyric_31.setVisibility(View.GONE);
        

        final LinearLayout dwrite = ( LinearLayout) findViewById(R.id.dwrite);
        dwrite.setVisibility(View.GONE);
        RadioGroup dwrite_1radio = (RadioGroup) findViewById(R.id.dwrite_1radio);
        RadioButton dwrite_1radioyes = (RadioButton) findViewById(R.id.dwrite_1radioyes);
        final EditText dwrite_11 = (EditText) findViewById(R.id.dwrite_11);
        dwrite_11.setVisibility(View.GONE);
        final EditText dwrite_2 = (EditText) findViewById(R.id.dwrite_2);
        RadioGroup dwrite_3radio = (RadioGroup) findViewById(R.id.dwrite_3radio);
        RadioButton dwrite_3radioyes = (RadioButton) findViewById(R.id.dwrite_3radioyes);
        RadioGroup dwrite_4radio = (RadioGroup) findViewById(R.id.dwrite_4radio);
        RadioButton dwrite_4radioyes = (RadioButton) findViewById(R.id.dwrite_4radioyes);
        final EditText dwrite_41 = (EditText) findViewById(R.id.dwrite_41);
        dwrite_41.setVisibility(View.GONE);
        

        final LinearLayout screenp = ( LinearLayout) findViewById(R.id.screenp);
        screenp.setVisibility(View.GONE);
        RadioGroup screenp_1radio = (RadioGroup) findViewById(R.id.screenp_1radio);
        final RadioButton screenp_1radioyes = (RadioButton) findViewById(R.id.screenp_1radioyes);
        final EditText screenp_11 = (EditText) findViewById(R.id.screenp_11);
        screenp_11.setVisibility(View.GONE);
        final EditText screenp_2 = (EditText) findViewById(R.id.screenp_2);
        RadioGroup screenp_3radio = (RadioGroup) findViewById(R.id.screenp_3radio);
        RadioButton screenp_3radioyes = (RadioButton) findViewById(R.id.screenp_3radioyes);
        RadioGroup screenp_4radio = (RadioGroup) findViewById(R.id.screenp_4radio);
        RadioButton screenp_4radioyes = (RadioButton) findViewById(R.id.screenp_4radioyes);
        final EditText screenp_41 = (EditText) findViewById(R.id.screenp_41);
        screenp_41.setVisibility(View.GONE);
        

        final LinearLayout sba = ( LinearLayout) findViewById(R.id.sba);
        sba.setVisibility(View.GONE);
        RadioGroup sba_1radio = (RadioGroup) findViewById(R.id.sba_1radio);
        RadioButton sba_1radioyes = (RadioButton) findViewById(R.id.sba_1radioyes);
        final EditText sba_11 = (EditText) findViewById(R.id.sba_11);
        sba_11.setVisibility(View.GONE);
        Spinner sba_2 = (Spinner) findViewById(R.id.sba_2);
        CustomAdapterSpinner sba_2adapter=new CustomAdapterSpinner(getApplicationContext(),sba_2string);
        sba_2.setAdapter(sba_2adapter);
        Spinner sba_3 = (Spinner) findViewById(R.id.sba_3);
        CustomAdapterSpinner sba_3adapter=new CustomAdapterSpinner(getApplicationContext(),sba_3string);
        sba_3.setAdapter(sba_3adapter);
        RadioGroup sba_4radio = (RadioGroup) findViewById(R.id.sba_4radio);
        RadioButton sba_4radioyes = (RadioButton) findViewById(R.id.sba_4radioyes);


        final LinearLayout choreo = ( LinearLayout) findViewById(R.id.choreo);
        choreo.setVisibility(View.GONE);
        Spinner choreo_1 = (Spinner) findViewById(R.id.choreo_1);
        CustomAdapterSpinner choreo_1adapter=new CustomAdapterSpinner(getApplicationContext(),dancer_6string);
        choreo_1.setAdapter(choreo_1adapter);
        RadioGroup choreo_2radio = (RadioGroup) findViewById(R.id.choreo_2radio);
        RadioButton choreo_2radioyes = (RadioButton) findViewById(R.id.choreo_2radioyes);
        final EditText choreo_21 = (EditText) findViewById(R.id.choreo_21);
        choreo_21.setVisibility(View.GONE);
        Spinner choreo_3 = (Spinner) findViewById(R.id.choreo_3);
        CustomAdapterSpinner choreo_3adapter=new CustomAdapterSpinner(getApplicationContext(),choreo_3string);
        choreo_3.setAdapter(choreo_3adapter);
        RadioGroup choreo_4radio = (RadioGroup) findViewById(R.id.choreo_4radio);
        RadioButton choreo_4radioyes = (RadioButton) findViewById(R.id.choreo_4radioyes);
        final EditText choreo_41 = (EditText) findViewById(R.id.choreo_41);
        choreo_41.setVisibility(View.GONE);
        RadioGroup choreo_5radio = (RadioGroup) findViewById(R.id.choreo_5radio);
        RadioButton choreo_5radioyes = (RadioButton) findViewById(R.id.choreo_5radioyes);
        final Spinner choreo_51 = (Spinner) findViewById(R.id.choreo_51);
        choreo_51.setVisibility(View.GONE);
        final EditText choreo_52 = (EditText) findViewById(R.id.choreo_52);
        choreo_52.setVisibility(View.GONE);
        final EditText choreo_6 = (EditText) findViewById(R.id.choreo_6);


        final Bundle bundle = getIntent().getExtras();
        final String name = bundle.getString("name");
        final String craft = bundle.getString("craft");

        switch(craft)
        {
            case "Actor": actor.setVisibility(View.VISIBLE); break;
            case "Actress": actress.setVisibility(View.VISIBLE); break;
            case "Child Artist": child.setVisibility(View.VISIBLE); break;
            case "Singer": singer.setVisibility(View.VISIBLE); break;
            case "Dancer": dancer.setVisibility(View.VISIBLE); break;
            case "Side Artists": side.setVisibility(View.VISIBLE); break;
            case "Assistant Director": assdir.setVisibility(View.VISIBLE); break;
            case "Lyric Writer / Lyricist": lyric.setVisibility(View.VISIBLE); break;
            case "Dialouge Writer": dwrite.setVisibility(View.VISIBLE); break;
            case "Script / Screenplay Writers": screenp.setVisibility(View.VISIBLE); break;
            case "Story Board Artist": sba.setVisibility(View.VISIBLE); break;
            case "Choreographer": choreo.setVisibility(View.VISIBLE); break;
        }

        
        //actor
        actor_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actor_11.setText("");
                if(checkedId == R.id.actor_1radioyes)
                {
                    actor_11.setVisibility(View.VISIBLE);

                    is_dance=true;
                }
                else
                {
                    actor_11.setVisibility(View.GONE);
                    is_dance=false;
                }
            }
        });

        actor_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actor_22.setText("");
                if(checkedId == R.id.actor_2radioyes)
                {
                    actor_22.setVisibility(View.VISIBLE);
                    is_sing=true;
                }
                else
                {
                    actor_22.setVisibility(View.GONE);
                    is_sing=false;
                }
            }
        });
        actor_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.actor_3radioyes)
                {

                    is_swim=true;
                }
                else
                    is_swim=false;


            }
        });

        actor_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actor_41.setText("");
                if(checkedId == R.id.actor_4radioyes)
                {
                    actor_41.setVisibility(View.VISIBLE);
                    is_sport=true;
                }
                else
                {
                    actor_41.setVisibility(View.GONE);
                    is_sport=false;
                }
            }
        });

        actor_6radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actor_62.setText("");
                if(checkedId == R.id.actor_6radioyes){
                    actor_61.setVisibility(View.VISIBLE);
                    actor_62.setVisibility(View.VISIBLE);
                    is_prior_exp=true;
                }
                else {
                    actor_61.setVisibility(View.GONE);
                    actor_62.setVisibility(View.GONE);
                    is_prior_exp=false;
                    prior_exp_desc=null;
                }
            }
        });
        actor_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.actor_5radioyes){
                    is_passport=true;
                }
                else
                    is_passport=false;

            }
        });

        actor_61.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (actor_61string[position])
                {
                    case "TV Shows":prior_exp_desc="TV Shows";break;
                    case "Short Films":prior_exp_desc="Short Films";break;
                    case "College Culturals":prior_exp_desc="College Culturals";break;
                    case "Feature Films":prior_exp_desc="Feature Films";break;
                    case "Anchor":prior_exp_desc="Anchor";break;
                    case "Hosts":prior_exp_desc="Hosts";break;
                    case "Other":prior_exp_desc="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




        //actress
        actress_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actress_11.setText("");
                if(checkedId == R.id.actress_1radioyes)
                {
                    actress_11.setVisibility(View.VISIBLE);
                    is_dance=true;
                }
                else
                {
                    actress_11.setVisibility(View.GONE);
                    is_dance=false;
                }
            }
        });

        actress_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actress_22.setText("");
                if(checkedId == R.id.actress_2radioyes)
                {
                    actress_22.setVisibility(View.VISIBLE);
                    is_sing=true;
                }
                else {


                    actress_22.setVisibility(View.GONE);
                    is_sing=false;
                }
            }
        });

        actress_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.actress_2radioyes)
                {

                    is_swim=true;
                }
                else
                {

                    is_swim=false;
                }
            }
        });
        actress_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actress_41.setText("");
                if(checkedId == R.id.actress_4radioyes)
                {
                    actress_41.setVisibility(View.VISIBLE);
                    is_sport=true;
                }
                else
                {
                    actress_41.setVisibility(View.GONE);
                    is_sport=false;
                }
            }
        });
        actress_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.actress_5radioyes){
                    is_passport=true;
                }
                else
                    is_passport=false;

            }
        });

        actress_6radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                actress_62.setText("");
                if(checkedId == R.id.actress_6radioyes){
                    actress_61.setVisibility(View.VISIBLE);
                    actress_62.setVisibility(View.VISIBLE);
                    is_prior_exp=true;
                }
                else {
                    actress_61.setVisibility(View.GONE);
                    actress_62.setVisibility(View.GONE);
                    is_prior_exp=false;
                    prior_exp_desc=null;
                }
            }
        });
        actress_61.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (actress_61string[position])
                {
                    case "TV Shows":prior_exp_desc="TV Shows";break;
                    case "Short Films":prior_exp_desc="Short Films";break;
                    case "College Culturals":prior_exp_desc="College Culturals";break;
                    case "Feature Films":prior_exp_desc="Feature Films";break;
                    case "Anchor":prior_exp_desc="Anchor";break;
                    case "Hosts":prior_exp_desc="Hosts";break;
                    case "Other":prior_exp_desc="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        //side
        side_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                side_11.setText((""));
                if(checkedId == R.id.side_1radioyes)
                {
                    side_11.setVisibility(View.VISIBLE);
                    is_dance=true;
                }
                else
                {
                    side_11.setVisibility(View.GONE);
                    is_dance=false;
                }
            }
        });

        side_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                side_22.setText("");
                if(checkedId == R.id.side_2radioyes)
                {
                    side_22.setVisibility(View.VISIBLE);
                    is_sing=true;
                }
                else
                {
                    side_22.setVisibility(View.GONE);
                    is_sing=false;
                }
            }
        });
        side_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.side_3radioyes)
                    is_swim=true;
                else
                    is_swim=false;
            }
        });

        side_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                side_41.setText("");
                if(checkedId == R.id.side_4radioyes)
                {
                    side_41.setVisibility(View.VISIBLE);
                    is_sport=true;
                }
                else
                {
                    side_41.setVisibility(View.GONE);
                    is_sport=false;
                }
            }
        });
        side_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                if(checkedId == R.id.side_5radioyes){
                    is_passport=true;
                }
                else
                    is_passport=false;

            }
        });

        side_6radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                side_62.setText("");
                if(checkedId == R.id.side_6radioyes){
                    side_61.setVisibility(View.VISIBLE);
                    side_62.setVisibility(View.VISIBLE);
                    is_prior_exp=true;
                }
                else {
                    side_61.setVisibility(View.GONE);
                    side_62.setVisibility(View.GONE);
                    is_prior_exp=false;
                    prior_exp_desc=null;
                }
            }
        });
        side_61.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (side_61string[position])
                {
                    case "TV Shows":prior_exp_desc="TV Shows";break;
                    case "Short Films":prior_exp_desc="Short Films";break;
                    case "College Culturals":prior_exp_desc="College Culturals";break;
                    case "Feature Films":prior_exp_desc="Feature Films";break;
                    case "Anchor":prior_exp_desc="Anchor";break;
                    case "Hosts":prior_exp_desc="Hosts";break;
                    case "Other":prior_exp_desc="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        //child
        child_13.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (child_l3string[position])
                {
                    case "Mother":guardian_rel="Mother";break;
                    case "Father":guardian_rel="Father";break;
                    case "Other":guardian_rel="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        child_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                child_21.setText("");
                if(checkedId == R.id.child_2radioyes)
                {
                    child_21.setVisibility(View.VISIBLE);
                    is_sing=true;
                }
                else
                {
                    child_21.setVisibility(View.GONE);
                    is_sing=false;
                }
            }
        });

        child_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                child_31.setText("");
                if(checkedId == R.id.child_3radioyes)
                {
                    child_31.setVisibility(View.VISIBLE);
                    is_dance=true;
                }
                else
                {
                    child_31.setVisibility(View.GONE);
                    is_dance=false;
                }
            }
        });

        child_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                child_42.setText("");
                if(checkedId == R.id.child_4radioyes) {
                    child_41.setVisibility(View.VISIBLE);
                    child_42.setVisibility(View.VISIBLE);
                    is_prior_exp=true;
                }
                else {
                    child_41.setVisibility(View.GONE);
                    child_42.setVisibility(View.GONE);
                    is_prior_exp=false;
                    prior_exp_desc=null;
                }
            }
        });
        child_41.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (child_41string[position])
                {
                    case "TV Shows":prior_exp_desc="TV Shows";break;
                    case "Short Films":prior_exp_desc="Short Films";break;
                    case "College Culturals":prior_exp_desc="College Culturals";break;
                    case "Feature Films":prior_exp_desc="Feature Films";break;
                    case "Anchor":prior_exp_desc="Anchor";break;
                    case "Hosts":prior_exp_desc="Hosts";break;
                    case "Other":prior_exp_desc="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        

        singer_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                singer_11.setText("");
                if(checkedId == R.id.singer_1radioyes)
                {
                    singer_11.setVisibility(View.VISIBLE);
                    is_own_soundtrack=true;
                }
                else
                {
                    singer_11.setVisibility(View.GONE);
                    is_own_soundtrack=false;
                }
            }
        });

        singer_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                singer_21.setText("");
                if(checkedId == R.id.singer_2radioyes)
                    singer_21.setVisibility(View.VISIBLE);
                else
                    singer_21.setVisibility(View.GONE);
            }
        });
        singer_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (singer_3string[position])
                {
                    case "Choir / Orchestra":sing_styles="Choir / Orchestra";break;
                    case "Soloist":sing_styles="Soloist";break;
                    case "Opera / Chinese Opera":sing_styles="Opera / Chinese Opera";break;
                    case "Gospel":sing_styles="Gospel";break;
                    case "Traditional Music":sing_styles="Traditional Music";break;
                    case "Carnactic":sing_styles="Carnatic";break;
                    case "Folk / Country":sing_styles="Folk / Country";break;
                    case "Ghana":sing_styles="Ghana";break;
                    case "Ghazal":sing_styles="Ghazel";break;
                    case "Rap":sing_styles="Rap";break;
                    case "World Music":sing_styles="World Music";break;
                    case "Jazz":sing_styles="Jazz";break;
                    case "Pop and Rock":sing_styles="Pop and Rock";break;
                    case "Others":sing_styles="Others";break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        singer_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                singer_41.setText("");
                if(checkedId == R.id.singer_4radioyes)
                {
                    singer_41.setVisibility(View.VISIBLE);
                    is_classic_train=true;
                }
                else
                {
                    singer_41.setVisibility(View.GONE);
                    is_classic_train=false;
                }
            }
        });

        singer_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                singer_51.setText("");
                if(checkedId == R.id.singer_5radioyes)
                {
                    singer_51.setVisibility(View.VISIBLE);
                    is_dubsmash=true;
                }
                else
                {
                    singer_51.setVisibility(View.GONE);
                    is_dubsmash=false;
                }
            }
        });

        singer_6radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                singer_61.setText("");
                if(checkedId == R.id.singer_6radioyes)
                {
                    singer_61.setVisibility(View.VISIBLE);
                    is_tvshow=true;
                }
                else
                {
                    singer_61.setVisibility(View.GONE);
                    is_tvshow=false;
                }
            }
        });
        
        
        //dancer
        dancer_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                dancer_11.setText("");
                if(checkedId == R.id.dancer_1radioyes)
                {
                    dancer_11.setVisibility(View.VISIBLE);
                    is_own_soundtrack=true;
                }
                else
                {
                    dancer_11.setVisibility(View.GONE);
                    is_own_soundtrack=false;
                }
            }
        });

        dancer_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                dancer_21.setText("");

                if(checkedId == R.id.dancer_2radioyes)
                {
                    dancer_21.setVisibility(View.VISIBLE);
                    is_own_choreo=true;
                }
                else
                {
                    dancer_21.setVisibility(View.GONE);
                    is_own_choreo=false;
                }
            }
        });
        dancer_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (dancer_3string[position])
                {
                    case "Hip hop":dance_styles_dancer="Hip hop";break;
                    case "Classical":dance_styles_dancer="Classical";break;
                    case "Slow":dance_styles_dancer="Slow";break;
                    case "Other":dance_styles_dancer="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        dancer_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                dancer_41.setText("");
                if(checkedId == R.id.dancer_4radioyes)
                {
                    dancer_41.setVisibility(View.VISIBLE);
                    is_classic_train=true;
                }
                else
                {
                    dancer_41.setVisibility(View.GONE);
                    is_classic_train=false;
                }

            }
        });

        dancer_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                dancer_52.setText("");
                if(checkedId == R.id.dancer_5radioyes){
                    is_tvshow=true;
                    //dancer_51.setVisibility(View.VISIBLE);
                    dancer_52.setVisibility(View.VISIBLE);
                }
                else{
                    //dancer_51.setVisibility(View.GONE);
                    is_tvshow=false;
                    dancer_52.setVisibility(View.GONE);
                }
            }
        });
        dancer_6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (dancer_6string[position])
                {
                    case "Dancing":interest_in="Dancing";break;
                    case "Choreographing":interest_in="Choreographing";break;
                    case "Both":interest_in="Both";break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        
        
        //assdir
        assdir_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                assdir_11.setText("");
                if(checkedId == R.id.assdir_1radioyes)
                {
                    assdir_11.setVisibility(View.VISIBLE);
                    is_tvshow=true;
                }
                else
                {
                    assdir_11.setVisibility(View.GONE);
                    is_tvshow=false;
                }
            }
        });

        assdir_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                assdir_22.setText("");
                if(checkedId == R.id.assdir_2radioyes)
                {
                    assdir_22.setVisibility(View.VISIBLE);
                    is_shortfilm=true;
                }
                else
                {
                    assdir_22.setVisibility(View.GONE);
                    is_shortfilm=false;
                }
            }
        });
        assdir_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.assdir_3radioyes)
                {

                    is_dir=true;
                }
                else
                {
                    is_dir=false;
                }
            }
        });
        assdir_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.assdir_4radioyes)
                {

                    is_crew=true;
                }
                else
                {

                    is_crew=false;
                }
            }
        });
        assdir_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.assdir_5radioyes)
                {
                    is_produce=true;
                }
                else
                {
                  is_produce=false;
                }
            }
        });
        assdir_6radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.assdir_6radioyes)
                {
                    is_passport=true;
                }
                else
                {
                    is_passport=false;
                }
            }
        });

        
        
        //lyric
        lyric_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                lyric_11.setText("");
                lyric_12.setText("");
                if(checkedId == R.id.lyric_1radioyes){
                    is_tvshow=true;
                    lyric_11.setVisibility(View.VISIBLE);
                    lyric_12.setVisibility(View.VISIBLE);
                }
                else{
                    is_tvshow=false;
                    lyric_11.setVisibility(View.GONE);
                    lyric_12.setVisibility(View.GONE);
                }

            }
        });
        lyric_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.lyric_3radioyes)
                {

                    is_passport=true;
                }
                else
                {

                    is_passport=false;
                }
            }
        });

        lyric_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                lyric_31.setText("");
                if(checkedId == R.id.lyric_3radioyes)
                {
                    lyric_31.setVisibility(View.VISIBLE);
                    is_own_lyric=true;
                }
                else
                {
                    lyric_31.setVisibility(View.GONE);
                    is_own_lyric=false;
                }
            }
        });
        
        
        //dwrite
        dwrite_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                dwrite_11.setText("");
                if(checkedId == R.id.dwrite_1radioyes)
                {
                    dwrite_11.setVisibility(View.VISIBLE);
                    is_tvshow=true;
                }
                else
                {
                    dwrite_11.setVisibility(View.GONE);
                    is_tvshow=false;
                }
            }
        });

        dwrite_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.dwrite_3radioyes)
                {

                    is_passport=true;
                }
                else
                {

                    is_passport=false;
                }
            }
        });

        dwrite_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                dwrite_41.setText("");
                if(checkedId == R.id.dwrite_4radioyes)
                {
                    dwrite_41.setVisibility(View.VISIBLE);
                    is_own_lyric=true;
                }
                else
                {
                    dwrite_41.setVisibility(View.GONE);
                    is_own_lyric=false;
                }
            }
        });
        
        
        //screenp
        screenp_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                screenp_11.setText("");
                if(checkedId == R.id.screenp_1radioyes)
                {
                    screenp_11.setVisibility(View.VISIBLE);
                    is_tvshow=true;
                }

                else
                {
                    screenp_11.setVisibility(View.GONE);
                    is_tvshow=false;
                }
            }
        });
        screenp_3radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.screenp_3radioyes)
                {
                    is_passport=true;
                }
                else
                {
                    is_passport=false;
                }
            }
        });

        screenp_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                screenp_41.setText("");
                if(checkedId == R.id.screenp_4radioyes)
                {
                    screenp_41.setVisibility(View.VISIBLE);
                    is_additional=true;
                }
                else
                {
                    screenp_41.setVisibility(View.GONE);
                    is_additional=false;
                }
            }
        });
        
        
        //sba
        sba_1radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                sba_11.setText("");
                if(checkedId == R.id.sba_1radioyes)
                {
                    sba_11.setVisibility(View.VISIBLE);
                    is_tvshow=true;
                }
                else
                {

                    sba_11.setVisibility(View.GONE);
                    is_tvshow=false;
                }
            }
        });
        sba_2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (sba_2string[position])
                {
                    case "Pen & Paper":design_on="Pen & Paper";break;
                    case "Computer":design_on="computer";break;
                    case "Both":design_on="Both";break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sba_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (sba_3string[position])
                {
                    case "Static Pics":design_type="Static Pics";break;
                    case "Animated":design_type="Animated";break;
                    case "Both":design_type="Both";break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        sba_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

                if(checkedId == R.id.sba_4radioyes)
                {
                    is_passport=true;
                }
                else
                {

                  is_passport=false;
                }
            }
        });
        
        //choreo

        choreo_1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (dancer_6string[position])
                {
                    case "Dancing":interest_in="Dancing";break;
                    case "Choreographing":interest_in="Choreographing";break;
                    case "Both":interest_in="Both";break;


                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        choreo_2radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                choreo_21.setText("");
                if(checkedId == R.id.choreo_2radioyes)
                {
                    choreo_21.setVisibility(View.VISIBLE);
                    is_own_soundtrack=true;
                }
                else
                {
                    choreo_21.setVisibility(View.GONE);
                    is_own_soundtrack=false;
                }
            }
        });
        choreo_3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                switch (choreo_3string[position])
                {
                    case "Hip hop":dance_styles_dancer="Hip hop";break;
                    case "Classical":dance_styles_dancer="Classical";break;
                    case "Slow":dance_styles_dancer="Slow";break;
                    case "Other":dance_styles_dancer="Other";break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        choreo_4radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                choreo_41.setText("");
                if(checkedId == R.id.choreo_4radioyes)
                {
                    choreo_41.setVisibility(View.VISIBLE);
                    is_classic_train=true;
                }
                else
                {
                    choreo_41.setVisibility(View.GONE);
                    is_classic_train=false;
                }
            }
        });

        choreo_5radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                choreo_52.setText("");
                if(checkedId == R.id.choreo_5radioyes){
                   // choreo_51.setVisibility(View.VISIBLE);
                    choreo_52.setVisibility(View.VISIBLE);
                    is_tvshow=true;
                }
                else {
                   // choreo_51.setVisibility(View.GONE);
                    choreo_52.setVisibility(View.GONE);
                    is_tvshow=false;
                }
            }
        });


        

        Button button = (Button)findViewById(R.id.button3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bio = BIO.getText().toString();
                interested_roles=ROLES.getText().toString();
                hobbies=HOBBIES.getText().toString();
                photo_link=PHOTO_LINK.getText().toString();
                video_link=VIDEO_LINK.getText().toString();






                switch(craft)
                {
                    case "Actor": {
                        sports_kind = actor_41.getText().toString();
                        dance_styles=actor_11.getText().toString();
                        sing_styles= actor_22.getText().toString();
                        prior_exp_link=actor_62.getText().toString();

                        actor_craft.setIsdance(is_dance);
                        actor_craft.setIssing(is_sing);
                        actor_craft.setIsswim(is_swim);
                        actor_craft.setIssports(is_sport);
                        actor_craft.setIstravelvisa(is_passport);
                        actor_craft.setIspriorexperience(is_prior_exp);
                        actor_craft.setDance_style(dance_styles);
                        actor_craft.setSing_style(sing_styles);
                        actor_craft.setSports(sports_kind);
                        actor_craft.setPriorexperience_desc(prior_exp_desc);
                        actor_craft.setPrior_exp_links(prior_exp_link);
                        actor_craft.setBio(bio);

                        actor_craft.setInterest_role(interested_roles);
                        actor_craft.setInterested_in(hobbies);
                        actor_craft.setPic_links(photo_link);
                        actor_craft.setVideolinks(video_link);
                        Log.i(actor_craft.getDance_style()+actor_craft.getFacial_Hair()+actor_craft.getSports()+actor_craft.getPriorexperience_desc()+actor_craft.getPrior_exp_links()+actor_craft.getFirst_Name()+actor_craft.getFirst_Name(),"kkkkk");
                    }break;
                    case "Actress":  {
                        sports_kind = actress_41.getText().toString();
                        dance_styles=actress_11.getText().toString();
                        sing_styles=actress_22.getText().toString();
                        prior_exp_link=actress_62.getText().toString();


                        actress_craft.setIsdance(is_dance);
                        actress_craft.setIssing(is_sing);
                        actress_craft.setIsswim(is_swim);
                        actress_craft.setIssports(is_sport);
                        actress_craft.setIstravelvisa(is_passport);
                        actress_craft.setIspriorexperience(is_prior_exp);
                        actress_craft.setDance_style(dance_styles);
                        actress_craft.setSing_style(sing_styles);
                        actress_craft.setSports(sports_kind);
                        actress_craft.setPriorexperience_desc(prior_exp_desc);
                        actress_craft.setPrior_exp_links(prior_exp_link);
                        actress_craft.setBio(bio);

                        actress_craft.setInterest_role(interested_roles);
                        actress_craft.setInterested_in(hobbies);
                        actress_craft.setPic_links(photo_link);
                        actress_craft.setVideolinks(video_link);
                        Log.i(actor_craft.getDance_style()+actor_craft.getFacial_Hair()+actor_craft.getSports()+actor_craft.getPriorexperience_desc()+actor_craft.getPrior_exp_links()+actor_craft.getFirst_Name()+actor_craft.getFirst_Name(),"kkkkk");
                    }break;
                    case "Child Artist": {
                        sing_styles = child_21.getText().toString();
                        dance_styles=child_31.getText().toString();
                        prior_exp_link=child_42.getText().toString();
                        parent_name=child_11.getText().toString();
                        parent_cont_no=child_12.getText().toString();


                        childart_craft.setIsdance(is_dance);
                        childart_craft.setIssing(is_sing);
                        childart_craft.setGuardian_name(parent_name);
                        childart_craft.setGuardian_no(parent_cont_no);
                        childart_craft.setGuardian_relation(guardian_rel);
                        childart_craft.setIspriorexperience(is_prior_exp);
                        childart_craft.setDance_style(dance_styles);
                        childart_craft.setSing_style(sing_styles);
                        childart_craft.setPriorexperience_desc(prior_exp_desc);
                        childart_craft.setPrior_exp_link(prior_exp_link);
                        childart_craft.setBio(bio);

                        childart_craft.setInterest_role(interested_roles);
                        childart_craft.setInterested_in(hobbies);
                        childart_craft.setPic_links(photo_link);
                        childart_craft.setVideo_links(video_link);
                        Log.i(childart_craft.getGuardian_relation()+actor_craft.getFacial_Hair()+actor_craft.getSports()+actor_craft.getPriorexperience_desc()+actor_craft.getPrior_exp_links()+actor_craft.getFirst_Name()+actor_craft.getFirst_Name(),"kkkkk");

                    }break;
                    case "Singer":{
                        ly_ric=singer_21.getText().toString();
                        sound_track=singer_11.getText().toString();
                        classic_traintime=singer_41.getText().toString();
                        dub_smash=singer_51.getText().toString();
                        TV_show=singer_61.getText().toString();

                       sing_craft.setIs_own_soundtrack(is_own_soundtrack);
                        sing_craft.setLink_own_sound_track(sound_track);
                        sing_craft.setIs_own_lyrics(is_own_lyric);
                        sing_craft.setLink_lyrics_own(ly_ric);
                        sing_craft.setIs_clasicallytrained(is_classic_train);
                        sing_craft.setClassical_train_years(classic_traintime);
                        sing_craft.setIs_dubsmash(is_dubsmash);
                        sing_craft.setLink_dubsmash(dub_smash);
                        sing_craft.setIs_TVshow(is_tvshow);
                        sing_craft.setLinkTvshow(TV_show);
                        sing_craft.setBio(bio);
                        sing_craft.setSinging_style(sing_styles);

                        sing_craft.setInterest_role(interested_roles);
                        sing_craft.setInterested_in(hobbies);
                        sing_craft.setPhotolinks(photo_link);
                        sing_craft.setVideolinks(video_link);
                        Log.i("singer:",sing_craft.is_dubsmash()+"dub:"+sing_craft.getLink_dubsmash()+sing_craft.getFirst_Name()+sing_craft.getEmail_id());
                    } break;
                    case "Dancer":{
                        own_choreo=dancer_21.getText().toString();
                       sound_track=dancer_11.getText().toString();
                        classic_traintime=dancer_41.getText().toString();
                        TV_show=dancer_52.getText().toString();
                        dance_craft.setIs_ownchoreo(is_own_choreo);
                        dance_craft.setLink_ownchoreo(own_choreo);
                        dance_craft.setIs_ownsoundtrack(is_own_soundtrack);
                        dance_craft.setLink_own_sound_track(sound_track);
                        dance_craft.setIstrained(is_classic_train);
                        dance_craft.setTrain_detail(classic_traintime);
                        dance_craft.setIs_filmtv_perform(is_tvshow);
                        dance_craft.setLink_film_tvperform(TV_show);
                        dance_craft.setInterest_field(interest_in);
                        Log.i("hiii:",interest_in+"");
                        dance_craft.setBio(bio);
                        dance_craft.setDancing_style(dance_styles_dancer);
                        dance_craft.setInterest_role(interested_roles);
                        dance_craft.setInterested_in(hobbies);
                        dance_craft.setPic_link(photo_link);
                        dance_craft.setVideo_link(video_link);
                        Log.i("dancer:",dance_craft.getLink_own_sound_track()+dance_craft.getInterest_field()+dance_craft.getDancing_style()+"");


                    } break;
                    case "Side Artists": {

                        sing_styles = side_22.getText().toString();
                        dance_styles=side_11.getText().toString();
                        sports_kind=side_41.getText().toString();
                        prior_exp_link=side_62.getText().toString();


                        side_art_craft.setIsdance(is_dance);
                        side_art_craft.setIssing(is_sing);
                        side_art_craft.setIsswim(is_swim);
                        side_art_craft.setIssports(is_sport);
                        side_art_craft.setIstravelvisa(is_passport);
                        side_art_craft.setIspriorexperience(is_prior_exp);
                        side_art_craft.setDance_style(dance_styles);
                        side_art_craft.setSing_style(sing_styles);
                        side_art_craft.setSports(sports_kind);
                        side_art_craft.setPriorexperience_desc(prior_exp_desc);
                        side_art_craft.setPrior_exp_links(prior_exp_link);
                        side_art_craft.setBio(bio);

                        side_art_craft.setInterest_role(interested_roles);
                        side_art_craft.setInterested_in(hobbies);
                        side_art_craft.setPic_links(photo_link);
                        side_art_craft.setVideolinks(video_link);
                        Log.i(actor_craft.getDance_style()+actor_craft.getFacial_Hair()+actor_craft.getSports()+actor_craft.getPriorexperience_desc()+actor_craft.getPrior_exp_links()+actor_craft.getFirst_Name()+actor_craft.getFirst_Name(),"kkkkk");

                    } break;
                    case "Assistant Director":{
                        short_film=assdir_22.getText().toString();
                        TV_show=assdir_11.getText().toString();
                        assis_dir_craft.setShort_film(short_film);
                        assis_dir_craft.setTv_show(TV_show);
                        assis_dir_craft.setIstvshow(is_tvshow);
                        assis_dir_craft.setIsshotfilm(is_shortfilm);
                        assis_dir_craft.setIslookingdirector(is_dir);
                        assis_dir_craft.setIslookingcrew(is_crew);
                        assis_dir_craft.setIslookingproducer(is_produce);
                        assis_dir_craft.setIspassport(is_passport);
                        assis_dir_craft.setBio(bio);

                        assis_dir_craft.setInterest_role(interested_roles);
                        assis_dir_craft.setInterested_in(hobbies);
                        assis_dir_craft.setPic_links(photo_link);
                        assis_dir_craft.setVideo_links(video_link);


                    } break;
                    case "Lyric Writer / Lyricist":{
                        TV_show=lyric_11.getText().toString();
                        list_lang=lyric_12.getText().toString();
                        dialogue=lyric_31.getText().toString();
                        lyricist_craft.setTv_desc(TV_show);
                        lyricist_craft.setLanguage_writttendialorlyrorscript(list_lang);
                        lyricist_craft.setAdditional(dialogue);
                        lyricist_craft.setIs_tvperform(is_tvshow);
                        lyricist_craft.setIsadditional(is_dial);
                        lyricist_craft.setIspassport(is_passport);

                        lyricist_craft.setBio(bio);

                        lyricist_craft.setInterest_role(interested_roles);
                        lyricist_craft.setInterested_in(hobbies);
                        lyricist_craft.setPiclinks(photo_link);
                        lyricist_craft.setVideolinks(video_link);


                    } break;
                    case "Dialouge Writer":{
                        TV_show=dwrite_11.getText().toString();
                        list_lang=dwrite_2.getText().toString();
                        ly_ric=dwrite_41.getText().toString();
                        dialoguewriter_craft.setTv_desc(TV_show);
                        dialoguewriter_craft.setLanguage_writttendialorlyrorscript(list_lang);
                        dialoguewriter_craft.setAdditional(ly_ric);
                        dialoguewriter_craft.setIs_tvperform(is_tvshow);
                        dialoguewriter_craft.setIsadditional(is_own_lyric);
                        dialoguewriter_craft.setIspassport(is_passport);

                        dialoguewriter_craft.setBio(bio);

                        dialoguewriter_craft.setInterest_role(interested_roles);
                        dialoguewriter_craft.setInterested_in(hobbies);
                        dialoguewriter_craft.setPiclinks(photo_link);
                        dialoguewriter_craft.setVideolinks(video_link);

                    } break;
                    case "Script / Screenplay Writers": {
                        TV_show=screenp_11.getText().toString();
                        list_lang=screenp_2.getText().toString();
                        additional=screenp_41.getText().toString();

                        screenplaywriters_craft.setTv_desc(TV_show);
                        screenplaywriters_craft.setLanguage_writttendialorlyrorscript(list_lang);
                        screenplaywriters_craft.setAdditional(additional);
                        screenplaywriters_craft.setIs_tvperform(is_tvshow);
                        screenplaywriters_craft.setIsadditional(is_additional);
                        screenplaywriters_craft.setIspassport(is_passport);

                        screenplaywriters_craft.setBio(bio);

                        screenplaywriters_craft.setInterest_role(interested_roles);
                        screenplaywriters_craft.setInterested_in(hobbies);
                        screenplaywriters_craft.setPiclinks(photo_link);
                        screenplaywriters_craft.setVideolinks(video_link);

                    } break;
                    case "Story Board Artist": {
                        TV_show=sba_11.getText().toString();

                        storyboard_craft.setIspassport(is_passport);
                        storyboard_craft.setIs_tvshow(is_tvshow);
                        storyboard_craft.setTv_showdesc(TV_show);
                        storyboard_craft.setDesign_on(design_on);
                        storyboard_craft.setDesign_type(design_type);
                        storyboard_craft.setBio(bio);
                        storyboard_craft.setInterest_role(interested_roles);
                        storyboard_craft.setInterested_in(hobbies);
                        storyboard_craft.setPic_links(photo_link);
                        storyboard_craft.setVideo_links(video_link);

                    } break;
                    case "Choreographer": {
                        sound_track=choreo_21.getText().toString();
                        classic_traintime=choreo_41.getText().toString();
                        TV_show=choreo_52.getText().toString();
                        group_size=choreo_6.getText().toString();
                        choreo_craft.setInterested_in(interest_in);
                        choreo_craft.setIs_ownsoundtrack(is_own_soundtrack);
                        choreo_craft.setSound_track(sound_track);
                        choreo_craft.setDance_style(dance_styles_dancer);
                        choreo_craft.setIs_trained(is_classic_train);
                        choreo_craft.setTrain_detail(classic_traintime);
                        choreo_craft.setIs_tvshow(is_tvshow);
                        choreo_craft.setTv_show_desc(TV_show);
                        choreo_craft.setGroup_num(group_size);
                        choreo_craft.setInterested_in(hobbies);
                        choreo_craft.setInterest_role(interested_roles);
                        choreo_craft.setPic_links(photo_link);
                        choreo_craft.setVideo_links(video_link);
                        choreo_craft.setBio(bio);
                        Log.i("choreo",group_size+interested_roles+interest_in);
                    } break;
                }
                Log.i("detailssss:",bio+"photo"+photo_link+"dancer"+is_dance+"");
                Log.i("photo",photo_link);


                Intent next = new Intent(getApplicationContext(),signup4.class);
                startActivity(next);
            }
        });
    }

    //keyboard disappears when you click outside
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        View v = getCurrentFocus();

        if (v != null &&
                (ev.getAction() == MotionEvent.ACTION_UP || ev.getAction() == MotionEvent.ACTION_MOVE) &&
                v instanceof EditText &&
                !v.getClass().getName().startsWith("android.webkit.")) {
            int scrcoords[] = new int[2];
            v.getLocationOnScreen(scrcoords);
            float x = ev.getRawX() + v.getLeft() - scrcoords[0];
            float y = ev.getRawY() + v.getTop() - scrcoords[1];

            if (x < v.getLeft() || x > v.getRight() || y < v.getTop() || y > v.getBottom())
                hideKeyboard(this);
        }
        return super.dispatchTouchEvent(ev);
    }

    public static void hideKeyboard(Activity activity) {
        if (activity != null && activity.getWindow() != null && activity.getWindow().getDecorView() != null) {
            InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

}
