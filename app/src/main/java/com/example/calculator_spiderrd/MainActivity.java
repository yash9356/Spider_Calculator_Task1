package com.example.calculator_spiderrd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button7,button8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button7 = findViewById(R.id.button3);
        button8 =findViewById(R.id.button4);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLorentzActivity();
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSpiActivity();
            }
        });
    }
    public void openLorentzActivity(){
        Intent intent= new Intent(this,LorentzActivity.class);
        startActivity(intent);
    }
    public void openSpiActivity(){
        Intent intent=new Intent(this,SpiActivity.class);
        startActivity(intent);
    }
}