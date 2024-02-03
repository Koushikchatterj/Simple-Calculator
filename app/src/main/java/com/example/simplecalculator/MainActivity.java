package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etn1,etn2;
    TextView tv4,tv2;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv4=findViewById(R.id.tv4);
        etn1=findViewById(R.id.etn1);
        etn2=findViewById(R.id.etn2);
        tv2=findViewById(R.id.tv2);
        b1=findViewById(R.id.b1);
        b2=findViewById(R.id.b2);
        b3=findViewById(R.id.b3);
        b4=findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Is The Result", Toast.LENGTH_SHORT).show();
                int sum=Integer.parseInt(etn1.getText().toString()) + Integer.parseInt(etn2.getText().toString());
                tv4.setText("Congratulations");
                tv2.setText("The Sum Is " + sum);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Is The Result", Toast.LENGTH_SHORT).show();
                int sum=Integer.parseInt(etn1.getText().toString()) - Integer.parseInt(etn2.getText().toString());
                tv4.setText("Congratulations");
                tv2.setText("The Sub Is " + sum);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Is The Result", Toast.LENGTH_SHORT).show();
                int sum=Integer.parseInt(etn1.getText().toString()) * Integer.parseInt(etn2.getText().toString());
                tv4.setText("Congratulations");
                tv2.setText("The Product Is " + sum);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This Is The Result", Toast.LENGTH_SHORT).show();
                int sum=Integer.parseInt(etn1.getText().toString()) + Integer.parseInt(etn2.getText().toString());
                tv4.setText("Congratulations");
                tv2.setText("The Div Is " + sum);
            }
        });
    }
}