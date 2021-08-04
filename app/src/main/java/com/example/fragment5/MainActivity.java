package com.example.fragment5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragListener {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager=getSupportFragmentManager();
        launchtotalApplefragment();
    }
    private void launchtotalApplefragment() {

        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        TotalAppleFragment totalAppleFragment=new TotalAppleFragment();
        fragmentTransaction.add(R.id.container,totalAppleFragment,"TotalAppleFragment").commit();
    }


    @Override
    public void launchTotalFragments(Bundle bundle) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        TotalAppleFragment totalAppleFragment=new TotalAppleFragment();
        totalAppleFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,totalAppleFragment,"totalappleFragment").addToBackStack("").commit();



    }

    @Override
    public void launchBuyFragments(Bundle bundle) {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        BuyAppleFragment buyAppleFragment=new BuyAppleFragment();
        buyAppleFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.container,buyAppleFragment,"buyappleFragment").addToBackStack("").commit();



    }
}