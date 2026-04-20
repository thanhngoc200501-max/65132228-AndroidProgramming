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
    Button btnTinhToan;

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


        edtSoMet1 = viewCau1.findViewById(R.id.edtSoMet1);
        edtSoMet2 = viewCau1.findViewById(R.id.edtSoMet2);
        edtChuVi = viewCau1.findViewById(R.id.edtChuVi);
        edtDienTich = viewCau1.findViewById(R.id.edtDienTich);


        btnTinhToan = viewCau1.findViewById(R.id.btnTinhToan);


        btnTinhToan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String duLieusoMet1 = edtSoMet1.getText().toString().trim();
                String duLieusoMet2 = edtSoMet2.getText().toString().trim();

                if (!duLieusoMet1.isEmpty() && !duLieusoMet2.isEmpty()) {
                    try {
                        double canh1 = Double.parseDouble(duLieusoMet1);
                        double canh2 = Double.parseDouble(duLieusoMet2);

                        double chuVi = (canh1 + canh2) * 2;
                        double dienTich = canh1 * canh2;

                        edtChuVi.setText(String.valueOf(chuVi));
                        edtDienTich.setText(String.valueOf(dienTich));

                        Toast.makeText(viewCau1.getContext(), "Tính toán thành công!", Toast.LENGTH_SHORT).show();

                    } catch (NumberFormatException e) {
                        Toast.makeText(viewCau1.getContext(), "Vui lòng chỉ nhập số!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(viewCau1.getContext(), "Vui lòng nhập đủ chiều dài và chiều rộng!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return viewCau1;
    }
}