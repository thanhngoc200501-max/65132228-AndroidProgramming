package com.cntt_2.thanhngoc.baith5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextSo1;
    EditText editTextSo2;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimDieuKhien();
        View.OnClickListener boLangNgheCong=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CONG();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_TRU();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_NHAN();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                XULY_CHIA();
            }
        });
    }
    void TimDieuKhien(){
        editTextSo1= findViewById(R.id.editSo1);
        editTextSo2=findViewById(R.id.editSo2);
        editTextKQ=(EditText)findViewById(R.id.editKQ);
        nutCong=(Button) findViewById(R.id.btncong);
        nutTru=(Button) findViewById(R.id.btntru);
        nutNhan=(Button) findViewById(R.id.btnnhan);
        nutChia=(Button) findViewById(R.id.btnchia);
    }
    void XULY_CONG(){

        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float num1=Float.parseFloat(soThu1);
        float num2=Float.parseFloat(soThu2);
        float tong=num1+num2;
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);


    }
    void XULY_TRU(){
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float num1=Float.parseFloat(soThu1);
        float num2=Float.parseFloat(soThu2);
        float tong=num1-num2;
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_NHAN(){
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float num1=Float.parseFloat(soThu1);
        float num2=Float.parseFloat(soThu2);
        float tong=num1*num2;
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XULY_CHIA(){
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float num1=Float.parseFloat(soThu1);
        float num2=Float.parseFloat(soThu2);
        float tong=num1/num2;
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
}