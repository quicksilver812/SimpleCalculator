package com.example.fullcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double val=0.0,x=0.0;
    int y=0,z=0,k=0,d=0,g=1;
    TextView res;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,add,sub,mul,div,clear,equals,sign,mod,decimal;

    @SuppressLint("MissingInflatedId")

    public void numBtn(double num, int d, int f){
        if(d==1){
            val=val+ (num/ Math.pow(10, f));
            g++;
        }
        else {
            val = val * 10 + num;
        }
        res.setText(val.toString());
    }

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.zeroBtn);
        b1=findViewById(R.id.oneBtn);
        b2=findViewById(R.id.twoBtn);
        b3=findViewById(R.id.threeBtn);
        b4=findViewById(R.id.fourBtn);
        b5=findViewById(R.id.fiveBtn);
        b6=findViewById(R.id.sixBtn);
        b7=findViewById(R.id.sevenBtn);
        b8=findViewById(R.id.eightBtn);
        b9=findViewById(R.id.nineBtn);
        add=findViewById(R.id.addBtn);
        sub=findViewById(R.id.subBtn);
        mul=findViewById(R.id.mulBtn);
        div=findViewById(R.id.divBtn);
        clear=findViewById(R.id.clearBtn);
        equals=findViewById(R.id.equalsBtn);
        sign=findViewById(R.id.signBtn);
        mod=findViewById(R.id.modBtn);
        decimal=findViewById(R.id.decimalBtn);
        res=findViewById(R.id.result);

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d=1;
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");
                val=0.0;
                d=0;
                g=1;
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(d==1){
                    val=val+ (0.0/ Math.pow(10, g));
                    g++;
                }
                else {
                    val = val * 10;
                }
                res.setText(val.toString()+"0");
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(1.0,d,g);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(2.0,d,g);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(3.0,d,g);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(4.0,d,g);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(5.0,d,g);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(6.0,d,g);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(7.0,d,g);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(8.0,d,g);
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numBtn(9.0,d,g);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d=0;
                g=1;
                res.setText(val+" +");
                y=1;
                if(k==1){
                    val=x+val;
                }
                x=val;
                k=1;
                val=0.0;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(val+" -");
                y=2;
                if(k==1){
                    val=x-val;
                }
                x=val;
                k=1;
                val=0.0;
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(val+" ×");
                y=3;
                if(k==1){
                    val=x*val;
                }
                x=val;
                k=1;
                val=0.0;
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(val+" ÷");
                y=4;
                if(k==1){
                    val=x/val;
                }
                x=val;
                k=1;
                val=0.0;
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText(val+" %");
                y=5;
                if(k==1){
                    val=x%100;
                }
                x=val;
                k=1;
                val=0.0;
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val=val*(-1.0);
                res.setText(val.toString());
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(y==1)
                    val=x+val;
                else if(y==2)
                    val=x-val;
                else if(y==3)
                    val=x*val;
                else if(y==4)
                    val=x/val;
                else if(y==5)
                    val=x%100;

                res.setText(val.toString());
                k=0;
            }
        });
    }
}