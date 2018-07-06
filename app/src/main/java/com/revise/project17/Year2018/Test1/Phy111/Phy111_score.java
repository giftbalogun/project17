package com.revise.project17.Year2018.Test1.Phy111;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.revise.project17.R;

public class Phy111_score extends AppCompatActivity {
    TextView rs;
    Button rp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);

        rs = (TextView) findViewById(R.id.score);
        rs.setText("Your Test 1 score for Phy111 is: " + Phy111Q.score);
        rp = (Button) findViewById(R.id.replay);

        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Phy111Q.score = 0;
                Intent in = new Intent(getApplicationContext(), Phy111Q.class);
                startActivity(in);
                finish();

            }
        });
    }
}
