package com.sebastienpouliot.activityinitiation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button b = (Button)this.findViewById(R.id.btnBackToFirst);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // l'une de ces méthodes est la bonne, l'autre non.
                // méthode 1
                SecondActivity.this.finish();
                // méthode 2
                //SecondActivity.this.startActivity(new Intent(SecondActivity.this, MainActivity.class));
            }
        });
    }
}
