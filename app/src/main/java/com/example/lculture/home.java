package com.example.lculture;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;



public class home extends Fragment {

     TextView tv1,tv2,tv3;
     EditText ed1,ed2,ed3;
     ImageView img1,img2,img3;


    public home() {
        // Required empty public constructor
    }


    @SuppressLint("CutPasteId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);

        tv1=v.findViewById(R.id.temp);
        tv2=v.findViewById(R.id.humi);
        tv3=v.findViewById(R.id.soil);

        ed1=v.findViewById(R.id.edit_temp);
        ed2=v.findViewById(R.id.edit_humi);
        ed3=v.findViewById(R.id.edit_soil);

        img1=v.findViewById(R.id.edit_temp);
        img2=v.findViewById(R.id.edit_humi);
        img3=v.findViewById(R.id.edit_soil);

        return v;
    }

}
