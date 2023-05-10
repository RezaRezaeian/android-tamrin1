package com.example.aeenname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView exampercent=findViewById(R.id.textView2);
        Button btnrestart=findViewById(R.id.button);
        TextView True =findViewById(R.id.textView3);
        TextView False =findViewById(R.id.textView4);
        TextView TestsNumber =findViewById(R.id.textView5);
        Intent recieve =getIntent();
        int TrueA =recieve.getIntExtra("true answer",0);
        int FalseA =recieve.getIntExtra("false answer",0);
        int TestsNumbers =recieve.getIntExtra("tests number",0);
        int percent =100-(20 * FalseA);
        True.setText("پاسخ های درست : "+String.valueOf(TrueA));
        True.setTextSize(18);
        False.setText("پاسخ های غلط : "+String.valueOf(FalseA));
        False.setTextSize(18);
        TestsNumber.setText("تعداد سوالات : "+String.valueOf(TestsNumbers));
        TestsNumber.setTextSize(18);
        exampercent.setText("نمره پایانی : "+String.valueOf(percent)+"%");
        exampercent.setTextSize(18);
        btnrestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity7.this,"آزمون مجدد",Toast.LENGTH_LONG).show();
                Intent backTo1 =new Intent(MainActivity7.this,MainActivity.class);
                startActivity(backTo1);

            }
        });
    }
}