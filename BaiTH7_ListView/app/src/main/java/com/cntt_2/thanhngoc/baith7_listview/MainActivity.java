package com.cntt_2.thanhngoc.baith7_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ArrayList<String> dsTenTinhThanh;
        dsTenTinhThanh=new ArrayList<String>();
        dsTenTinhThanh.add("Hà Nội");
        dsTenTinhThanh.add("Đà Nẵng");
        dsTenTinhThanh.add("Khánh Hòa");
        dsTenTinhThanh.add("Ninh Thuận");
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dsTenTinhThanh);
        ListView lvTenTinhThanh=findViewById(R.id.lvTenTinhThanh);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);

    }

}