package com.example.calculator_spiderrd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;

public class SpiActivity extends AppCompatActivity {
    Button button10;
    TextView spians,spains2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spi);
        button10=findViewById(R.id.button2);
        spians=findViewById(R.id.textView4);
        spains2=findViewById(R.id.textView5);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar c= Calendar.getInstance();
                int th=c.get(Calendar.HOUR);
                int tm=c.get(Calendar.MINUTE);
                int ts=c.get(Calendar.SECOND);
                double cs =calenspi(tm,ts,th);
                spains2.setText(String.valueOf(th)+":"+String.valueOf(tm)+":"+String.valueOf(ts));
                spians.setText(String.valueOf(cs));

            }
        });

    }
    static double calenspi(int tm,int ts,int th){
        int z=1;
        for(int i=1;i<=th;i++){
            z=z*i;
        }
        return z/(Math.pow(tm,3)+ts);
    }
}