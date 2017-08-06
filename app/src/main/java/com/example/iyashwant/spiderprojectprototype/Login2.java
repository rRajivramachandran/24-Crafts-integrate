package com.example.iyashwant.spiderprojectprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.github.clans.fab.FloatingActionButton;

public class Login2 extends AppCompatActivity {

    FloatingActionButton floatingActionButton1,floatingActionButton2,floatingActionButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        floatingActionButton1 =(FloatingActionButton)findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextpage = new Intent(getApplicationContext(),Login.class);
                startActivity(nextpage);
            }
        });

        floatingActionButton2 = (FloatingActionButton)findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextpage = new Intent(getApplicationContext(),signup.class);
                startActivity(nextpage);
            }
        });
    }
}
