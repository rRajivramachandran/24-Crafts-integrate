package com.example.iyashwant.spiderprojectprototype;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import android.widget.Spinner;

import java.util.ArrayList;

public class signup extends AppCompatActivity {

   // String[] country = {"Who am I? ","Producer","director"};

    String[] whoN={"Who am I? ","Actor","Actress","Music Director","Singer","Producer","Director","Co-Director"};

    String name;

    //int flags[] = {R.drawable.india, R.drawable.china, R.drawable.australia, R.drawable.portugle, R.drawable.america, R.drawable.new_zealand};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        Spinner spin = (Spinner) findViewById(R.id.spinner);
       // spin.setOnItemSelectedListener(ge);

        CustomAdapterSpinner customAdapter=new CustomAdapterSpinner(getApplicationContext(),whoN);
        spin.setAdapter(customAdapter);


        final EditText name1 =(EditText)findViewById(R.id.name1);


        Button next = (Button)findViewById(R.id.button1);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name=name1.getText().toString();
                Intent goToNextActivity = new Intent(getApplicationContext(), signup2.class);
                Bundle bundle = new Bundle();
                bundle.putString("name",name);
              //  bundle.putInt("pos",position);
                goToNextActivity.putExtras(bundle);
                startActivity(goToNextActivity);
            }
        });




    }
}
