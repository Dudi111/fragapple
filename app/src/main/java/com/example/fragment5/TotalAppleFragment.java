package com.example.fragment5;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class TotalAppleFragment extends Fragment {
    private EditText etTotal;
    private TextView tvavai;
    private Button mbtnNext;
    private FragListener listener;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_total_apple, container, false);

    }

    @Override
    public void onViewCreated(@NonNull  View view, @Nullable  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
    }

    @Override
    public void onAttach(@NonNull  Context context) {
        super.onAttach(context);
        listener= (FragListener) context;
    }

    private void initviews(View view) {
        etTotal=view.findViewById(R.id.ettotal);
        tvavai=view.findViewById(R.id.tvavailable);
        mbtnNext=view.findViewById(R.id.btnnext);
        mbtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int totalapple= Integer.parseInt(etTotal.getText().toString());
                Bundle bundle=new Bundle();
                bundle.putInt("totalapple",totalapple);
                if(listener!=null){
                   listener.launchBuyFragments(bundle);
                }
            }
        });
    }
}