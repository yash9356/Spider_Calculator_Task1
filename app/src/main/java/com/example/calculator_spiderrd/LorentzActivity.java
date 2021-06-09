package com.example.calculator_spiderrd;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LorentzActivity extends AppCompatActivity {
    EditText mEditText1,mEditText2;
    TextView mTextViewResult1;
    Button mButtonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lorentz);
        mEditText1 = findViewById(R.id.edittext_number1);
        mTextViewResult1 =findViewById(R.id.textView_result1);
        mEditText2= findViewById(R.id.edittext_number2);
        mButtonSubmit =findViewById(R.id.button);
        mButtonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double speed =Double.parseDouble(mEditText1.getText().toString());
                double yans =Double.parseDouble(mEditText2.getText().toString());
                double result =calculation(speed);
                if(speed>300000000 || speed<=0){
                    if(yans>=0){
                        Toast.makeText(LorentzActivity.this,"invalid input in v",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(LorentzActivity.this,"invalid input in V & your ans",Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    if(yans==result){
                        mTextViewResult1.setText(String.valueOf(result));
                        mTextViewResult1.setBackgroundColor(Color.GREEN);
                    }
                    else {
                        mTextViewResult1.setText(String.valueOf(result));
                        mTextViewResult1.setBackgroundColor(Color.RED);
                    }
                }

            }
        });
    }
    static double calculation(Double speed){
        double w=speed/ 300_000_000;
        double k=w*w;
        double b=Math.sqrt(1-k);
        return 1/b;
    }
}