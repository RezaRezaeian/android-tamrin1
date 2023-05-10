package com.example.aeenname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        RadioButton btnTrue =findViewById(R.id.radioButton4);
        RadioGroup radioGroup =findViewById(R.id.radioGroup);
        Button btnNext =findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent recieve =getIntent();
                int True =recieve.getIntExtra("true answer",0);
                int False =recieve.getIntExtra("false answer",0);
                int TestsNumber =recieve.getIntExtra("tests number",0);
                TestsNumber++;
                if (btnTrue.isChecked()) {
                    ++True;
                    Toast.makeText(MainActivity6.this, "صحیح", Toast.LENGTH_SHORT).show();
                    Intent intentOk =new Intent (MainActivity6.this,MainActivity7.class);
                    intentOk.putExtra("true answer",True);
                    intentOk.putExtra("false answer",False);
                    intentOk.putExtra("tests number",TestsNumber);
                    startActivity(intentOk);
                }else if(radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity6.this, "یک گزینه انتخاب کنید", Toast.LENGTH_SHORT).show();
                } else {
                    ++False;
                    Toast.makeText(MainActivity6.this, "غلط", Toast.LENGTH_LONG).show();
                    Intent intentFalse =new Intent (MainActivity6.this,MainActivity7.class);
                    intentFalse.putExtra("false answer",False);
                    intentFalse.putExtra("true answer",True);
                    intentFalse.putExtra("tests number",TestsNumber);
                    startActivity(intentFalse);
                }

            }
        });
    }
}