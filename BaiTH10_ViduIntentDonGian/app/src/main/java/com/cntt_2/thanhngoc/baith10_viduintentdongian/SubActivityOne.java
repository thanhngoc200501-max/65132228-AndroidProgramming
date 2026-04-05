package com.cntt_2.thanhngoc.baith10_viduintentdongian;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivityOne extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_sub_one);
    }
    public void QuayVe(View v){
        Intent iManHinhChinh=new Intent(this,MainActivity.class);
        startActivity(iManHinhChinh);
    }
}
