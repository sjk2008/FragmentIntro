package com.imsjkumar.fragmentintro;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
private FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout=findViewById(R.id.frame_container);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DemoFragment demoFragment = new DemoFragment();
        fragmentTransaction.add(frameLayout.getId(),demoFragment);
        fragmentTransaction.commit();
    }


}