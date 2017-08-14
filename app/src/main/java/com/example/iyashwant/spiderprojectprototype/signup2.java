package com.example.iyashwant.spiderprojectprototype;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.iyashwant.spiderprojectprototype.signup.actor_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.actress_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.childart_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.dance_craft;
import static com.example.iyashwant.spiderprojectprototype.signup.side_art_craft;

public class signup2 extends AppCompatActivity {

    String[] bodytypeString={"Choose Body Type",
            "Athletic","Average","Petite","Thin","Heavy","Other"};

    String[] haircolorString={"Choose Hair Color",
            "Black", "Brown", "White","Red", "Blonde", "Burgundy", "Ginger", "Other"};

    String[] hairlengthString={"Choose Hair Length",
            "Short", "Medium", "Long", "Bald", "Shaved", "Other"};

    String[] eyecolorString={"Choose Eye Color",
            "Black", "Brown", "Blue", "Amber", "Grey", "Green", "Hazel", "Other"};

    String[] skintoneString={"Choose Skin Tone",
            "Very Fair", "Fair", "Medium", "Olive", "Brown", "Dark", "Other"};

    String[] facialhairString={"Choose Facial Hair",
            "Beard","Moustache", "Beard & Moustache", "Stubble", "None", "Other"};

    String body_type,hair_color,hair_length,eye_color,skin_tone,facial_hair,ht,wt,hip,waist,chest;
    boolean body_type1=false,hair_color1=false,hair_length1=false,eye_color1=false,skin_tone1=false,facial_hair1=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);

        final Bundle bundle = getIntent().getExtras();
        final String name = bundle.getString("name");
        final String craft = bundle.getString("craft");

        TextView textView =(TextView)findViewById(R.id.welcome);
        textView.setText("Welcome, "+name);
         final EditText height = (EditText) findViewById(R.id.height);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final TextView other_bodytype = (TextView) findViewById(R.id.other_bodytype);
        other_bodytype.setVisibility(View.GONE);
        final TextView other_haircolor = (TextView) findViewById(R.id.other_haircolor);
        other_haircolor.setVisibility(View.GONE);
        final TextView other_hairlength = (TextView) findViewById(R.id.other_hairlength);
        other_hairlength.setVisibility(View.GONE);
        final TextView other_eyecolor = (TextView) findViewById(R.id.other_eyecolor);
        other_eyecolor.setVisibility(View.GONE);
        final TextView other_skintone = (TextView) findViewById(R.id.other_skintone);
        other_skintone.setVisibility(View.GONE);
        final TextView other_facialhair = (TextView) findViewById(R.id.other_facialhair);
        other_facialhair.setVisibility(View.GONE);

        final TextView hipsize = (TextView) findViewById(R.id.hip_size);
        final TextView waistsize = (TextView) findViewById(R.id.waist_size);
        final TextView chestsize = (TextView) findViewById(R.id.chest_size);


        final Spinner bodytype = (Spinner) findViewById(R.id.body_type);
        CustomAdapterSpinner bodytypeAdapter=new CustomAdapterSpinner(getApplicationContext(),bodytypeString);
        bodytype.setAdapter(bodytypeAdapter);
        bodytype.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                other_bodytype.setText("");
                if(bodytypeString[position].equals("Other")) {
                    bodytype.setBackgroundResource(R.drawable.box3);
                    other_bodytype.setVisibility(View.VISIBLE);
                }
                else {

                    bodytype.setBackgroundResource(R.drawable.box);
                    other_bodytype.setVisibility(View.GONE);
                }
                switch (bodytypeString[position])
                {
                    case "Atheletic":body_type="Atheletic";break;
                    case "Average":body_type="Average";break;
                    case "Petite":body_type="Petite";break;
                    case "Thin":body_type="Thin";break;
                    case "Heavy":body_type="Heavy";break;
                    case "Other": body_type1=true;break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });



        final Spinner haircolor = (Spinner) findViewById(R.id.hair_color);
        CustomAdapterSpinner haircolorAdapter=new CustomAdapterSpinner(getApplicationContext(),haircolorString);
        haircolor.setAdapter(haircolorAdapter);
        haircolor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                other_haircolor.setText("");
                if(haircolorString[position].equals("Other")) {
                    haircolor.setBackgroundResource(R.drawable.box3);
                    other_haircolor.setVisibility(View.VISIBLE);
                }
                else {
                    haircolor.setBackgroundResource(R.drawable.box);
                    other_haircolor.setVisibility(View.GONE);
                }
                switch (haircolorString[position])
                {
                    case "Black":hair_color="Black";break;
                    case "Brown":hair_color="Brown";break;
                    case "White":hair_color="White";break;
                    case "Red":hair_color="Red";break;
                    case "Blonde":hair_color="Blonde";break;
                    case "Burgundy": hair_color="Burgundy";break;
                    case "Ginger":hair_color="Ginger";break;
                    case "Other":hair_color1=true;break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        final Spinner hairlength = (Spinner) findViewById(R.id.hair_length);
        CustomAdapterSpinner hairlengthAdapter=new CustomAdapterSpinner(getApplicationContext(),hairlengthString);
        hairlength.setAdapter(hairlengthAdapter);
        hairlength.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                other_hairlength.setText("");
                if(hairlengthString[position].equals("Other")) {
                    hairlength.setBackgroundResource(R.drawable.box3);
                    other_hairlength.setVisibility(View.VISIBLE);
                }
                else {
                    hairlength.setBackgroundResource(R.drawable.box);
                    other_hairlength.setVisibility(View.GONE);
                }
                switch (hairlengthString[position])
                {
                    case "Short":hair_length="Short";break;
                    case "Medium":hair_length="Medium";break;
                    case "Long":hair_length="Long";break;
                    case "Bald":hair_length="Bald";break;
                    case "Shaved":hair_length="Shaved";break;
                    case "Other":hair_length1=true;break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        final Spinner eyecolor = (Spinner) findViewById(R.id.eye_color);
        CustomAdapterSpinner eyecolorAdapter=new CustomAdapterSpinner(getApplicationContext(),eyecolorString);
        eyecolor.setAdapter(eyecolorAdapter);
        eyecolor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                other_eyecolor.setText("");
                if(eyecolorString[position].equals("Other")) {
                    eyecolor.setBackgroundResource(R.drawable.box3);
                    other_eyecolor.setVisibility(View.VISIBLE);
                }
                else {
                    eyecolor.setBackgroundResource(R.drawable.box);
                    other_eyecolor.setVisibility(View.GONE);
                }
                switch (eyecolorString[position])
                {
                    case "Black":eye_color="Black";break;
                    case "Brown":eye_color="Brown";break;
                    case "Blue":eye_color="Blue";break;
                    case "Amber":eye_color="Amber";break;
                    case "Grey":eye_color="Grey";break;
                    case "Hazel":eye_color="Hazel";break;
                    case "Other":eye_color1=true;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        final Spinner skintone = (Spinner) findViewById(R.id.skin_tone);
        CustomAdapterSpinner skintoneAdapter=new CustomAdapterSpinner(getApplicationContext(),skintoneString);
        skintone.setAdapter(skintoneAdapter);
        skintone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                other_skintone.setText("");
                if(skintoneString[position].equals("Other"))
                    other_skintone.setVisibility(View.VISIBLE);
                else
                    other_skintone.setVisibility(View.GONE);
                switch (skintoneString[position])
                {
                    case "Very Fair":skin_tone="Very Fair";break;
                    case "Fair":skin_tone="Fair";break;
                    case "Medium":skin_tone="Medium";break;
                    case "Olive":skin_tone="Olive";break;
                    case "Brown":skin_tone="Brown";break;
                    case "Dark":skin_tone="Dark";break;
                    case "Other":skin_tone1=true;break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        final Spinner facialhair = (Spinner) findViewById(R.id.facial_hair);
        CustomAdapterSpinner facialhairAdapter=new CustomAdapterSpinner(getApplicationContext(),facialhairString);
        facialhair.setAdapter(facialhairAdapter);
        facialhair.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                other_facialhair.setText("");
                if(facialhairString[position].equals("Other"))
                    other_facialhair.setVisibility(View.VISIBLE);
                else
                    other_facialhair.setVisibility(View.GONE);
                switch (facialhairString[position])
                {
                    case "Beard":facial_hair="Beard";break;
                    case "Moustache":facial_hair="Moustache";break;
                    case "Beard & Moustache":facial_hair="Beard & Moustache";break;
                    case "Stubble":facial_hair="Stubble";break;
                    case "None":facial_hair="None";break;
                    case "Other":facial_hair1=true;break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        Button button = (Button)findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hip = hipsize.getText().toString();
                waist=waistsize.getText().toString();
                chest=chestsize.getText().toString();
                ht = height.getText().toString();
                wt = weight.getText().toString();
                if(hair_color1)
                {
                    hair_color=other_haircolor.getText().toString();
                    hair_color1=false;
                }
                if(hair_length1)
                {
                    hair_length=other_hairlength.getText().toString();
                    hair_length1=false;
                }
                if(eye_color1)
                {
                    eye_color=other_eyecolor.getText().toString();
                    eye_color1=false;
                }
                if(skin_tone1)
                {
                    skin_tone=other_skintone.getText().toString();
                    skin_tone1=false;
                }
                if(facial_hair1)
                {
                    facial_hair=other_facialhair.getText().toString();
                    facial_hair1=false;
                }
                if(body_type1)
                {
                    body_type=other_bodytype.getText().toString();
                    body_type1=false;
                }


                switch(craft)
                {
                    case "Child Artist":
                        childart_craft.setHair_Color(hair_color);
                        childart_craft.setHair_Length(hair_length);
                        childart_craft.setEye_Color(eye_color);
                        childart_craft.setSkin_Tone(skin_tone);
                        childart_craft.setHeight(ht);
                        childart_craft.setWeight(wt);
                        break;
                    case "Side Artists":
                        side_art_craft.setHair_Color(hair_color);
                        side_art_craft.setHair_Length(hair_length);
                        side_art_craft.setEye_Color(eye_color);
                        side_art_craft.setSkin_Tone(skin_tone);
                        side_art_craft.setHeight(ht);
                        side_art_craft.setWeight(wt);
                        side_art_craft.setBody_Type(body_type);
                        side_art_craft.setFacial_Hair(facial_hair);
                        side_art_craft.setChest_Size(chest);
                        side_art_craft.setWaist_Size(waist);
                        break;
                    case "Actor":
                        actor_craft.setHair_Color(hair_color);
                        actor_craft.setHair_Length(hair_length);
                        actor_craft.setEye_Color(eye_color);
                        actor_craft.setSkin_Tone(skin_tone);
                        actor_craft.setHeight(ht);
                        actor_craft.setWeight(wt);
                        actor_craft.setBody_Type(body_type);
                        actor_craft.setFacial_Hair(facial_hair);
                        actor_craft.setChest_Size(chest);
                        actor_craft.setWaist_Size(waist);
                        break;
                    case "Actress":
                        actress_craft.setHair_Color(hair_color);
                        actress_craft.setHair_Length(hair_length);
                        actress_craft.setEye_Color(eye_color);
                        actress_craft.setSkin_Tone(skin_tone);
                        actress_craft.setHeight(ht);
                        actress_craft.setWeight(wt);
                        actress_craft.setBody_Type(body_type);

                        actress_craft.setChest_Size(chest);
                        actress_craft.setWaist_Size(waist);
                        actress_craft.setHip_size(hip);
                        break;
                    case "Dancer":
                        dance_craft.setHair_Color(hair_color);
                        dance_craft.setHair_Length(hair_length);
                        dance_craft.setEye_Color(eye_color);
                        dance_craft.setSkin_Tone(skin_tone);
                        dance_craft.setHeight(ht);
                        dance_craft.setWeight(wt);
                        dance_craft.setBody_Type(body_type);
                        dance_craft.setFacial_hair(facial_hair);
                        dance_craft.setChest_Size(chest);
                        dance_craft.setWaist_Size(waist);
                        break;



                }
                Log.i("deatils","Dance gender:"+dance_craft.getGender()+dance_craft.getLast_name()+"Fh;"+dance_craft.getFacial_hair()+"ACT:"+actress_craft.getHip_size()+"");
                Log.i(body_type,"body"+"hair:"+actor_craft.getHair_Color()+actor_craft.getSkin_Tone()+actress_craft.getHip_size());

                Intent goToNextActivity = new Intent(getApplicationContext(), signup3.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
                bundle.putString("craft",craft);
                goToNextActivity.putExtras(bundle);
                startActivity(goToNextActivity);
            }
        });





        switch(craft)
        {
            case "Child Artist":
                bodytype.setVisibility(View.GONE);
                facialhair.setVisibility(View.GONE);
                hipsize.setVisibility(View.GONE);
                waistsize.setVisibility(View.GONE);
                chestsize.setVisibility(View.GONE);
                                break;
            case "Side Artists":hipsize.setVisibility(View.GONE);
                break;
            case "Actor": hipsize.setVisibility(View.GONE);
                break;
            case  "Actress": facialhair.setVisibility(View.GONE);
                break;
            case "Dancer": hipsize.setVisibility(View.GONE);
                break;
           }

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
        Log.i("hi","hi");
    }

}
