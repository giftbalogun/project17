package com.revise.project17.Year2017.Test1.Phy112;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.revise.project17.R;
import com.revise.project17.Year2018.Test1.Phy112.Phy112Q;

public class Phy112_score extends AppCompatActivity {
    TextView rs;
    Button rp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.score);

        rs = (TextView) findViewById(R.id.score);
        rs.setText("Your Test 1 score for Phy112 is: " + com.revise.project17.Year2018.Test1.Phy112.Phy112Q.score);
        rp = (Button) findViewById(R.id.replay);

        rp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                com.revise.project17.Year2018.Test1.Phy112.Phy112Q.score = 0;
                Intent in = new Intent(getApplicationContext(), Phy112Q.class);
                startActivity(in);
                finish();

            }
        });
    }
}
