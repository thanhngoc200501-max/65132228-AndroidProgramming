package com.cntt_2.thanhngoc.thigk2lehothanhngoc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cau3Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cau3Fragment extends Fragment {

    ItemLandscapAdapter adapter;
    ArrayList<LandScape> list;
    //khai bao cac bien dai dien cho ca view can tw tac
    RecyclerView recyclerViewLandscap;

    public cau3Fragment() {
        // Required empty public constructor
    }


    public static cau3Fragment newInstance(String param1, String param2) {
        cau3Fragment fragment = new cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        list.add(new LandScape("Hà Nội", "thac.jpg"));
        list.add(new LandScape("Quảng Ninh", "quangninh.jpg"));
        list.add(new LandScape("Đà Nẵng", "hoian.jpg"));
        list.add(new LandScape("Hà Giang", "img_1.png"));
        list.add(new LandScape("Cao Bằng", "img.png"));
        list.add(new LandScape("Khánh Hòa", "vhlong.jpg"));
        list.add(new LandScape("Lê Hồ Thanh Ngọc", "img.png"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        //4. tìm đk Recycler
        recyclerViewLandscap = viewCau3.findViewById(R.id.ryCau3);

        //5. Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandscap.setLayoutManager(layoutLinear);
        //6. tạo adapter gắn với nguồn dl
        adapter = new ItemLandscapAdapter(viewCau3.getContext(), list);
        //7. gắn adapter với Recycler
        recyclerViewLandscap.setAdapter(adapter);


        return viewCau3;
    }
}