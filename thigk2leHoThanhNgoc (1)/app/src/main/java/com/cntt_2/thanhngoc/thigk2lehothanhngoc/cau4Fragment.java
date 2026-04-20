package com.cntt_2.thanhngoc.thigk2lehothanhngoc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cau4Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cau4Fragment extends Fragment {
    ImageView imageView;
    TextView textView3;
    TextView textView4;
    TextView textView9;


    public cau4Fragment() {
        // Required empty public constructor
    }


    public static cau4Fragment newInstance(String param1, String param2) {
        cau4Fragment fragment = new cau4Fragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau4 = inflater.inflate(R.layout.fragment_cau4, container, false);

        // 2. Ánh xạ (tìm ID) từ file giao diện XML
        // Lưu ý: Các ID R.id... bên dưới phải trùng khớp với ID bạn đặt trong file fragment_cau4.xml
        imageView = viewCau4.findViewById(R.id.imageView);
        textView3 = viewCau4.findViewById(R.id.textView3);
        textView4 = viewCau4.findViewById(R.id.textView4);
        textView9 = viewCau4.findViewById(R.id.textView9);
        imageView.setImageResource(R.mipmap.img);



        textView3.setText("Họ và tên: Lê Hồ Thanh Ngọc");
        textView4.setText("Mã số sinh viên: 65132228");
        textView9.setText("Sở thích: thích đi chơi");

        // 4. Trả về view đã được thiết lập xong
        return viewCau4;
    }
}