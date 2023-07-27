package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 frag1 = new Fragment1();
        Fragment2 frag2 = new Fragment2();
        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.rela, frag1).commit();

        findViewById(R.id.btn_fragment1).setOnClickListener(v -> fragmentManager.beginTransaction().remove(frag2).replace(R.id.rela, frag1).commit());

        findViewById(R.id.btn_fragment2).setOnClickListener(v -> fragmentManager.beginTransaction().remove(frag1).replace(R.id.rela, frag2).commit());
    }
}