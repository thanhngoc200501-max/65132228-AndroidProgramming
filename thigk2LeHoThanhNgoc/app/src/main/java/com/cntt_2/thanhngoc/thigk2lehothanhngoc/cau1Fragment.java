package com.cntt_2.thanhngoc.thigk2lehothanhngoc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cau1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cau1Fragment extends Fragment {

    EditText edtSoMet1;
    EditText edtSoMet2;
    EditText edtChuVi;
    EditText edtDienTich;

    public cau1Fragment() {
        // Required empty public constructor
    }


    public static cau1Fragment newInstance(String param1, String param2) {
        cau1Fragment fragment = new cau1Fragment();
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
        View viewCau1 = inflater.inflate(R.layout.fragment_cau1, container, false);
        //tìm đk trong view này
        edtSoMet1 = viewCau1.findViewById(R.id.edtSoMet1);
        edtSoMet2 = viewCau1.findViewById(R.id.edtSoMet2);
        edtChuVi = viewCau1.findViewById(R.id.edtChuVi);
        edtDienTich = viewCau1.findViewById(R.id.edtDienTich);
        edtDienTich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String duLieusoMet1 = edtSoMet1.getText().toString();
                String duLieusoMet2 = edtSoMet2.getText().toString();
                if (!duLieusoMet1.isEmpty())
                {
                    Toast.makeText(viewCau1.getContext(), "chu vi hình chữ nhật", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(viewCau1.getContext(), "diện tích hình chữ nhật", Toast.LENGTH_SHORT).show();
                }
            }
        });



        return viewCau1;
    }
}