package com.cntt_2.thanhngoc.baith7_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> dsTenTinhThanh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dsTenTinhThanh=new ArrayList<String>();
        dsTenTinhThanh.add("Hà Nội");
        dsTenTinhThanh.add("Đà Nẵng");
        dsTenTinhThanh.add("Khánh Hòa");
        dsTenTinhThanh.add("Ninh Thuận");
        dsTenTinhThanh.add("Nha Trang");
        ArrayAdapter<String> adapterTinhThanh;
        adapterTinhThanh=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,dsTenTinhThanh);
        ListView lvTenTinhThanh=findViewById(R.id.lvTenTinhThanh);
        lvTenTinhThanh.setAdapter(adapterTinhThanh);
        lvTenTinhThanh.setOnItemClickListener(BoLangNghevaXL);
    }
    AdapterView.OnItemClickListener BoLangNghevaXL=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            String strTenTinhChon= dsTenTinhThanh.get(i);
            Toast.makeText(MainActivity.this,strTenTinhChon,Toast.LENGTH_LONG).show();
        }
    };

}