package com.cntt_2.thanhngoc.baith8_tuychinhlistview;

public class MonAn {
    private  String tenMonAn;
    private  double donGia;
    private String Mota;
    private int idAnhMinhHoa;

    public MonAn(String tenMonAn, double donGia, String mota, int idAnhMinhHoa) {
        this.tenMonAn = tenMonAn;
        this.donGia = donGia;
        Mota = mota;
        this.idAnhMinhHoa = idAnhMinhHoa;
    }
    public String getTenMonAn() {
        return tenMonAn;
    }

    public double getDonGia() {
        return donGia;
    }

    public String getMoTa() {
        return Mota;
    }

    public int getIdAnhMinhHoa() {
        return idAnhMinhHoa;
    }
}
