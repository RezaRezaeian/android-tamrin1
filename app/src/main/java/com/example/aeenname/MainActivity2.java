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
                    Intent intentok=new Intent (MainActivity2.this,MainActivity3.class);
                    intentok.putExtra("true answer",True);
                    intentok.putExtra("false answer",False);
                    intentok.putExtra("tests number",TestsNumber);
                    startActivity(intentok);
                    Toast.makeText(MainActivity2.this, "صحیح", Toast.LENGTH_SHORT).show();
                }   else {
                    ++False;
                    Intent intentfalse=new Intent (MainActivity2.this,MainActivity3.class);
                    intentfalse.putExtra("false answer",False);
                    intentfalse.putExtra("true answer",True);
                    intentfalse.putExtra("tests number",TestsNumber);
                    startActivity(intentfalse);
                    Toast.makeText(MainActivity2.this, "غلط", Toast.LENGTH_SHORT).show();
                }
            }
        });


/*
  if (rbutton.isChecked())
                    Toast.makeText(MainActivity2.this,"درسته",Toast.LENGTH_LONG).show();
 */
    }
}