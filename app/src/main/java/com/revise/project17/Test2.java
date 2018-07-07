package com.revise.project17;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.revise.project17.Year2018.T2_2018;
import com.revise.project17.Year2017.T2_2017;

public class Test2 extends AppCompatActivity {
    Button year2018, year2017, year2016, year2015;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);

        year2018 = (Button) findViewById(R.id.year_2018);
        year2017 = (Button) findViewById(R.id.year_2017);
        year2016 = (Button) findViewById(R.id.year_2016);
        year2015 = (Button) findViewById(R.id.year_2015);

        // perform setOnClickListener event on First Button
        year2018.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragment
                loadFragment(new T2_2018());
                Toast.makeText(Test2.this,
                        "You Have Clicked Year 2018", Toast.LENGTH_LONG).show();
            }
        });
// perform setOnClickListener event on Second Button
        year2017.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new T2_2017());
                Toast.makeText(Test2.this,
                        "You Have Clicked Year 2017", Toast.LENGTH_LONG).show();
            }
        });

        // perform setOnClickListener event on First Button
        year2016.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load First Fragment
                Toast.makeText(Test2.this,
                        "You Have Clicked Year 2016", Toast.LENGTH_LONG).show();
            }
        });
// perform setOnClickListener event on Second Button
        year2015.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Test2.this,
                        "You Have Clicked Year 2015", Toast.LENGTH_LONG).show();

            }
        });

    }

    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}