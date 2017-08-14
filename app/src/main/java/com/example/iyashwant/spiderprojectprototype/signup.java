package com.example.iyashwant.spiderprojectprototype;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

import io.apptik.widget.multiselectspinner.MultiSelectSpinner;

public class signup extends AppCompatActivity{
    public static actor actor_craft = new actor();
    public static actress actress_craft = new actress();
    public static childartist childart_craft = new childartist();
    public static singer sing_craft = new singer();
    public static dancerorchoreo dance_craft = new dancerorchoreo();
    public static sideartists side_art_craft = new sideartists();
    public static AssistantDirector assis_dir_craft = new AssistantDirector();
    public static Lyricist lyricist_craft = new Lyricist();
    public static dialoguewriter dialoguewriter_craft = new dialoguewriter();
    public static screenplaywriters screenplaywriters_craft = new screenplaywriters();
    public static storyboardartist storyboard_craft = new storyboardartist();
    public static choreographers choreo_craft = new choreographers();
    public static dirphoto dir_photo_craft =new dirphoto();

    String[] whoN={"Who am I?",
            "Actor","Actress","Child Artist","Singer","Dancer",
            "Side Artists","Assistant Director","Lyric Writer / Lyricist",
            "Dialouge Writer","Script / Screenplay Writers", "Story Board Artist",
            "Choreographer"};

    String[] genderString={"Choose Gender",
            "Male","Female","Other"};

    String name,selectedcraft = "Who am I?";
    String gender_selected;

    //datepicker
    private DatePicker datePicker;
    private Calendar calendar;
    private TextView dateView;
    private int year, month, day;
    private EditText first_name,last_name,email,password,mob_num,residing_in;
    private EditText natives,craft;
    private Spinner gender,lang_known;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        first_name = (EditText) findViewById(R.id.first_name);
        last_name = (EditText) findViewById(R.id.last_name);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        //gender = (Spinner) findViewById(R.id.gender);
        //String s = dateView.getText().toString();

        first_name = (EditText) findViewById(R.id.first_name);
        mob_num = (EditText) findViewById(R.id.mobile);
        residing_in = (EditText) findViewById(R.id.residing);
        natives = (EditText) findViewById(R.id.hometown);
        lang_known = (MultiSelectSpinner) findViewById(R.id.languages);
        Spinner craft = (Spinner) findViewById(R.id.spinner);
        CustomAdapterSpinner craftAdapter=new CustomAdapterSpinner(getApplicationContext(),whoN);
        craft.setAdapter(craftAdapter);

        gender = (Spinner) findViewById(R.id.gender);
        CustomAdapterSpinner genderAdapter=new CustomAdapterSpinner(getApplicationContext(),genderString);
        gender.setAdapter(genderAdapter);
        craft.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(whoN[position])
                {
                    case "Actor":selectedcraft = "Actor";break;
                    case "Actress": selectedcraft = "Actress"; break;
                    case "Child Artist": selectedcraft = "Child Artist"; break;
                    case "Singer": selectedcraft = "Singer"; break;
                    case "Dancer": selectedcraft = "Dancer"; break;
                    case "Side Artists": selectedcraft = "Side Artists"; break;
                    case "Assistant Director": selectedcraft = "Assistant Director"; break;
                    case "Lyric Writer / Lyricist": selectedcraft = "Lyric Writer / Lyricist"; break;
                    case "Dialouge Writer": selectedcraft = "Dialouge Writer"; break;
                    case "Script / Screenplay Writers": selectedcraft = "Script / Screenplay Writers"; break;
                    case "Story Board Artist": selectedcraft = "Story Board Artist"; break;
                    case "Choreographer": selectedcraft = "Choreographer"; break;
                    case "Director of Photography": selectedcraft = "Director of Photography"; break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        gender.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch(genderString[position])
                {
                    case "Male": gender_selected="Male";break;
                    case "Female": gender_selected = "Female"; break;
                    case "Other": gender_selected = "Other"; break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


        //multiselect spinner
        ArrayList<String> options = new ArrayList<>();
        options.add("English");
        options.add("Hindi");
        options.add("Telugu");
        options.add("Tamil");
        options.add("Kannada");
        options.add("Malayalam");
        options.add("Punjabi");
        options.add("Bhojpuri");

        MultiSelectSpinner multiSelectSpinner = (MultiSelectSpinner) findViewById(R.id.languages);
        ArrayAdapter<String> adapter = new ArrayAdapter <String>(getApplicationContext(), android.R.layout.simple_list_item_multiple_choice, options);
        multiSelectSpinner.setListAdapter(adapter);
        multiSelectSpinner.setTitle("Select Languages Known");



        final EditText name1 =(EditText)findViewById(R.id.first_name);


        Button next = (Button)findViewById(R.id.button11);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname = first_name.getText().toString();
                String lname = last_name.getText().toString();
                String pass_word = password.getText().toString();
                String date = dateView.getText().toString();
                String mobile_num = mob_num.getText().toString();
                String languages_known = lang_known.getSelectedItem().toString();
                String residing = residing_in.getText().toString();
                String home = natives.getText().toString();
                String email_id = email.getText().toString();
                switch (selectedcraft)
                {
                    case "Actor": {
                        actor_craft.setFirst_Name(fname);
                        actor_craft.setLast_name(lname);
                        actor_craft.setGender(gender_selected);
                        actor_craft.setEmail_id(email_id);
                        actor_craft.setDate_Of_Birth(date);
                        actor_craft.setLangauges_Spoken(languages_known);
                        actor_craft.setNative(home);
                        actor_craft.setPassword(pass_word);
                        actor_craft.setResiding_In(residing);
                        actor_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Actress":{
                        actress_craft.setFirst_Name(fname);
                        actress_craft.setLast_name(lname);
                        actress_craft.setGender(gender_selected);
                        actress_craft.setEmail_id(email_id);
                        actress_craft.setDate_Of_Birth(date);
                        actress_craft.setLangauges_Spoken(languages_known);
                        actress_craft.setNative(home);
                        actress_craft.setPassword(pass_word);
                        actress_craft.setResiding_In(residing);
                        actress_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Child Artist": {
                        childart_craft.setFirst_Name(fname);
                        childart_craft.setLast_name(lname);
                        childart_craft.setGender(gender_selected);
                        childart_craft.setEmail_id(email_id);
                        childart_craft.setDate_Of_Birth(date);
                        childart_craft.setLangauges_Spoken(languages_known);
                        childart_craft.setNative(home);
                        childart_craft.setPassword(pass_word);
                        childart_craft.setResiding_In(residing);
                        childart_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Singer": {
                        sing_craft.setFirst_Name(fname);
                        sing_craft.setLast_name(lname);
                        sing_craft.setGender(gender_selected);
                        sing_craft.setEmail_id(email_id);
                        sing_craft.setDate_Of_Birth(date);
                        sing_craft.setLangauges_Spoken(languages_known);
                        sing_craft.setNative(home);
                        sing_craft.setPassword(pass_word);
                        sing_craft.setResiding_In(residing);
                        sing_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Dancer": {
                        dance_craft.setFirst_Name(fname);
                        dance_craft.setLast_name(lname);
                        dance_craft.setGender(gender_selected);
                        dance_craft.setEmail_id(email_id);
                        dance_craft.setDate_Of_Birth(date);
                        dance_craft.setLangauges_Spoken(languages_known);
                        dance_craft.setNative(home);
                        dance_craft.setPassword(pass_word);
                        dance_craft.setResiding_In(residing);
                        dance_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Side Artists": {
                        side_art_craft.setFirst_Name(fname);
                        side_art_craft.setLast_name(lname);
                        side_art_craft.setGender(gender_selected);
                        side_art_craft.setEmail_id(email_id);
                        side_art_craft.setDate_Of_Birth(date);
                        side_art_craft.setLangauges_Spoken(languages_known);
                        side_art_craft.setNative(home);
                        side_art_craft.setPassword(pass_word);
                        side_art_craft.setResiding_In(residing);
                        side_art_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Assistant Director": {
                        assis_dir_craft.setFirst_Name(fname);
                        assis_dir_craft.setLast_name(lname);
                        assis_dir_craft.setGender(gender_selected);
                        assis_dir_craft.setEmail_id(email_id);
                        assis_dir_craft.setDate_Of_Birth(date);
                        assis_dir_craft.setLangauges_Spoken(languages_known);
                        assis_dir_craft.setNative(home);
                        assis_dir_craft.setPassword(pass_word);
                        assis_dir_craft.setResiding_In(residing);
                        assis_dir_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Lyric Writer / Lyricist": {
                        lyricist_craft.setFirst_Name(fname);
                        lyricist_craft.setLast_name(lname);
                        lyricist_craft.setGender(gender_selected);
                        lyricist_craft.setEmail_id(email_id);
                        lyricist_craft.setDate_Of_Birth(date);
                        lyricist_craft.setLangauges_Spoken(languages_known);
                        lyricist_craft.setNative(home);
                        lyricist_craft.setPassword(pass_word);
                        lyricist_craft.setResiding_In(residing);
                        lyricist_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Dialouge Writer": {
                        dialoguewriter_craft.setFirst_Name(fname);
                        dialoguewriter_craft.setLast_name(lname);
                        dialoguewriter_craft.setGender(gender_selected);
                        dialoguewriter_craft.setEmail_id(email_id);
                        dialoguewriter_craft.setDate_Of_Birth(date);
                        dialoguewriter_craft.setLangauges_Spoken(languages_known);
                        dialoguewriter_craft.setNative(home);
                        dialoguewriter_craft.setPassword(pass_word);
                        dialoguewriter_craft.setResiding_In(residing);
                        dialoguewriter_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Script / Screenplay Writers": {
                        screenplaywriters_craft.setFirst_Name(fname);
                        screenplaywriters_craft.setLast_name(lname);
                        screenplaywriters_craft.setGender(gender_selected);
                        screenplaywriters_craft.setEmail_id(email_id);
                        screenplaywriters_craft.setDate_Of_Birth(date);
                        screenplaywriters_craft.setLangauges_Spoken(languages_known);
                        screenplaywriters_craft.setNative(home);
                        screenplaywriters_craft.setPassword(pass_word);
                        screenplaywriters_craft.setResiding_In(residing);
                        screenplaywriters_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Story Board Artist": {
                        storyboard_craft.setFirst_Name(fname);
                        storyboard_craft.setLast_name(lname);
                        storyboard_craft.setGender(gender_selected);
                        storyboard_craft.setEmail_id(email_id);
                        storyboard_craft.setDate_Of_Birth(date);
                        storyboard_craft.setLangauges_Spoken(languages_known);
                        storyboard_craft.setNative(home);
                        storyboard_craft.setPassword(pass_word);
                        storyboard_craft.setResiding_In(residing);
                        storyboard_craft.setContact_Phone_Number(mobile_num);

                    } break;
                    case "Choreographer": {
                        choreo_craft.setFirst_Name(fname);
                        choreo_craft.setLast_name(lname);
                        choreo_craft.setGender(gender_selected);
                        choreo_craft.setEmail_id(email_id);
                        choreo_craft.setDate_Of_Birth(date);
                        choreo_craft.setLangauges_Spoken(languages_known);
                        choreo_craft.setNative(home);
                        choreo_craft.setPassword(pass_word);
                        choreo_craft.setResiding_In(residing);
                        choreo_craft.setContact_Phone_Number(mobile_num);

                    } break;
                   /* case "Director of Photography": {
                        dir_photo_craft.setFirst_Name(fname);
                        dir_photo_craft.setLast_name(lname);
                        dir_photo_craft.setGender(gender_selected);
                        dir_photo_craft.setEmail_id(email_id);
                        dir_photo_craft.setDate_Of_Birth(date);
                        dir_photo_craft.setLangauges_Spoken(languages_known);
                        dir_photo_craft.setNative(home);
                        dir_photo_craft.setPassword(pass_word);
                        dir_photo_craft.setResiding_In(residing);
                        dir_photo_craft.setContact_Phone_Number(mobile_num);

                    } break;*/
                }
Log.i(selectedcraft,"select");
                if(selectedcraft.equals("Who am I?"))
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Select a craft",Toast.LENGTH_SHORT);
                    toast.show();

                }

                else if(selectedcraft.equals("Actor") || selectedcraft.equals("Actress") || selectedcraft.equals("Child Artist") || selectedcraft.equals("Dancer") || selectedcraft.equals("Side Artists")){
                    name=name1.getText().toString();
                    Intent goToNextActivity = new Intent(getApplicationContext(), signup2.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("craft",selectedcraft);
                    goToNextActivity.putExtras(bundle);
                    startActivity(goToNextActivity);




                }
                else
                {
                    name=name1.getText().toString();
                    Intent goToNextActivity = new Intent(getApplicationContext(), signup3.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("name",name);
                    bundle.putString("craft",selectedcraft);
                    goToNextActivity.putExtras(bundle);
                    startActivity(goToNextActivity);
                }

                //Log.i("his",actor_craft.getGender()+"screen"+screenplaywriters_craft.getEmail_id().toString()+" ");

            }
        });

        //datepicker
        dateView = (TextView) findViewById(R.id.dob);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);




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


    //datepicker
    @SuppressWarnings("deprecation")
    public void setDate(View view) {
        showDialog(999);
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        // TODO Auto-generated method stub
        if (id == 999) {
            return new DatePickerDialog(this,
                    myDateListener, year, month, day);
        }
        return null;
    }

    private DatePickerDialog.OnDateSetListener myDateListener = new
            DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker arg0,
                                      int arg1, int arg2, int arg3) {
                    // TODO Auto-generated method stub
                    // arg1 = year
                    // arg2 = month
                    // arg3 = day
                    showDate(arg1, arg2+1, arg3);
                }
            };

    private void showDate(int year, int month, int day) {
        dateView.setText(new StringBuilder().append(day).append("/")
                .append(month).append("/").append(year));
    }

}
