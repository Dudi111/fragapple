package com.example.fragment5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class BuyAppleFragment extends Fragment {
    private EditText etBUY;
    private Button mbtnbuyapple;
    private FragListener listener;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buy_apple, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        listener= (FragListener) context;
    }

    private void initView(View view) {
        etBUY=view.findViewById(R.id.etbuy);
        mbtnbuyapple=view.findViewById(R.id.btnBUY);
        mbtnbuyapple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nobuy= (Integer.parseInt(etBUY.getText().toString()));
               Bundle bundle=new Bundle();
               bundle.putInt("nobuy",nobuy);
                if(listener!=null){
                    listener.launchTotalFragments(bundle);
                }
            }
        });
    }
}