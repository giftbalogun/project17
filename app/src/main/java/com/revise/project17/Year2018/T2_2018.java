package com.revise.project17.Year2018;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.revise.project17.R;
import com.revise.project17.Year2018.Test2.Chm111.Chm111Q;
import com.revise.project17.Year2018.Test2.Mat111.Mat111Q;
import com.revise.project17.Year2018.Test2.Mat112.Mat112Q;
import com.revise.project17.Year2018.Test2.Phy111.Phy111Q;
import com.revise.project17.Year2018.Test2.Phy112.Phy112Q;

public class T2_2018 extends Fragment {
    View view;
    Button mat111, mat112, phy111, phy112, chm111;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        view = inflater.inflate(R.layout.t1_2018, container, false);
// get the reference of Button
        mat111 = (Button) view.findViewById(R.id.mat111);
        mat112 = (Button) view.findViewById(R.id.mat112);
        phy111 = (Button) view.findViewById(R.id.phy111);
        phy112 = (Button) view.findViewById(R.id.phy112);
        chm111 = (Button) view.findViewById(R.id.chm111);
// perform setOnClickListener on first Button
        mat111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Mat111Q.class);
                startActivity(intent);
            }
        });
        mat112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Mat112Q.class);
                startActivity(intent);
            }
        });
        phy111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phy111Q.class);
                startActivity(intent);
            }
        });
        phy112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phy112Q.class);
                startActivity(intent);
            }
        });
        chm111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Chm111Q.class);
                startActivity(intent);
            }
        });
        return view;
    }
}