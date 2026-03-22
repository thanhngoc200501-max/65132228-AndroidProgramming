package com.exam.vd2;

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
    void XuLyCong(View v){
        EditText editTextSo1= findViewById(R.id.editSo1);
        EditText editTextSo2=findViewById(R.id.editSo2);
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float soA=Float.parseFloat(soThu1);
        float soB=Float.parseFloat(soThu2);
        float tong=soA+soB;
        EditText editTextKQ=(EditText)findViewById(R.id.editKQ);
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);


    }
    void XuLyTru(View v){
        EditText editTextSo1= findViewById(R.id.editSo1);
        EditText editTextSo2=findViewById(R.id.editSo2);
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float soA=Float.parseFloat(soThu1);
        float soB=Float.parseFloat(soThu2);
        float tong=soA-soB;
        EditText editTextKQ=(EditText)findViewById(R.id.editKQ);
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XuLyNhan(View v){
        EditText editTextSo1= findViewById(R.id.editSo1);
        EditText editTextSo2=findViewById(R.id.editSo2);
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float soA=Float.parseFloat(soThu1);
        float soB=Float.parseFloat(soThu2);
        float tong=soA*soB;
        EditText editTextKQ=(EditText)findViewById(R.id.editKQ);
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
    void XuLyChia(View v){
        EditText editTextSo1= findViewById(R.id.editSo1);
        EditText editTextSo2=findViewById(R.id.editSo2);
        String  soThu1=editTextSo1.getText().toString();
        String  soThu2=editTextSo2.getText().toString();
        float soA=Float.parseFloat(soThu1);
        float soB=Float.parseFloat(soThu2);
        float tong=soA/soB;
        EditText editTextKQ=(EditText)findViewById(R.id.editKQ);
        String chuoiKQ=String.valueOf(tong);
        editTextKQ.setText(chuoiKQ);
    }
}