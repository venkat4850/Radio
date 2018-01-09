package com.example.lenovo.radio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.lenovo.radio.R.id.radiogroup;
import static com.example.lenovo.radio.R.id.textview2;

public class MainActivity extends AppCompatActivity {

TextView tv1,tv2;
    Button bn;

    Button r1,r2;
    RadioGroup r3,r4,r5,r6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r3 = (RadioGroup) findViewById(radiogroup);

        tv1= (TextView) findViewById(R.id.textview1);
        tv2= (TextView) findViewById(textview2);




    }

    public void onclickbuttonMethod(View v){
        int selectedId = r3.getCheckedRadioButtonId();
        RadioButton genderradioButton = (RadioButton) findViewById(selectedId);
        if(selectedId==-1){
            Toast.makeText(MainActivity.this,"Nothing selected", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,genderradioButton.getText(), Toast.LENGTH_SHORT).show();
        }

    }
}
