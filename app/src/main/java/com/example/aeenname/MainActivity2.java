package com.example.aeenname;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RadioButton btnTrue =findViewById(R.id.radioButton);
        RadioGroup radioGroup =findViewById(R.id.radioGroup);
        Button btnNext =findViewById(R.id.btnNext);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int True =0;
                int False =0;
                int TestsNumber =0;
                TestsNumber++;
                if (btnTrue.isChecked()) {
                    ++True;
                    Intent intentOk=new Intent (MainActivity2.this,MainActivity3.class);
                    intentOk.putExtra("true answer",True);
                    intentOk.putExtra("false answer",False);
                    intentOk.putExtra("tests number",TestsNumber);
                    startActivity(intentOk);
                    Toast.makeText(MainActivity2.this, "صحیح", Toast.LENGTH_SHORT).show();
                }   else if(radioGroup.getCheckedRadioButtonId() == -1) {
                    Toast.makeText(MainActivity2.this, "یک گزینه انتخاب کنید", Toast.LENGTH_SHORT).show();
                }else{
                    ++False;
                    Intent intentFalse =new Intent (MainActivity2.this,MainActivity3.class);
                    intentFalse.putExtra("false answer",False);
                    intentFalse.putExtra("true answer",True);
                    intentFalse.putExtra("tests number",TestsNumber);
                    startActivity(intentFalse);
                    Toast.makeText(MainActivity2.this, "غلط", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}