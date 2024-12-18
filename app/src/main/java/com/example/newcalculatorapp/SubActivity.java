package com.example.newcalculatorapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SubActivity extends AppCompatActivity {

    EditText ed1,ed2;
    TextView tv;
    Button b1;
    String getNum1,getNum2,result;
    int num1,num2,diff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub);


        b1=(Button) findViewById(R.id.SUB1);

        ed1=(EditText) findViewById(R.id.num11);
        ed2=(EditText) findViewById(R.id.num22);
        tv=(TextView) findViewById(R.id.resToDisplay1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getNum1=ed1.getText().toString();
                getNum2=ed2.getText().toString();
                num1=Integer.parseInt(getNum1);
                num2=Integer.parseInt(getNum2);
                diff=num1-num2;
                result=String.valueOf(diff);
                Toast.makeText(getApplicationContext(),result, Toast.LENGTH_SHORT).show();
                tv.setText(result);
            }
        });


    }
}