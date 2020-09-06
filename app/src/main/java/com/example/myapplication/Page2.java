package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Page2 extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

bottomNavigationView = findViewById(R.id.bottomNav);
bottomNavigationView.setOnNavigationItemSelectedListener(bottonNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new Place()).commit();
    }

   private BottomNavigationView.OnNavigationItemSelectedListener bottonNavMethod = new
           BottomNavigationView.OnNavigationItemSelectedListener() {
               @Override
               public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                   Fragment fragment = null;

                   switch (menuItem.getItemId()){

                       case  R.id.page_1:
                           fragment = new User();
                           break;

                       case  R.id.page_2:
                           fragment = new Place();
                           break;

                       case  R.id.page_3:
                           fragment = new Maz();
                           break;

                   }
                   getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();

                   return true;
               }
           };


}