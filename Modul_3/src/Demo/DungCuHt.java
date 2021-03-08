package Demo;

public class DungCuHt extends SanPham{
    protected  String Xuatxu, thuonghieu,nhacc, hdsd,mausac,chatlieu,kichthuoc;

    public String getXuatxu() {
        return Xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        Xuatxu = xuatxu;
    }

    public String getThuonghieu() {
        return thuonghieu;
    }

    public void setThuonghieu(String thuonghieu) {
        this.thuonghieu = thuonghieu;
    }

    public String getNhacc() {
        return nhacc;
    }

    public void setNhacc(String nhacc) {
        this.nhacc = nhacc;
    }

    public String getHdsd() {
        return hdsd;
    }

    public void setHdsd(String hdsd) {
        this.hdsd = hdsd;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    public String getChatlieu() {
        return chatlieu;
    }

    public void setChatlieu(String chatlieu) {
        this.chatlieu = chatlieu;
    }

    public String getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(String kichthuoc) {
        this.kichthuoc = kichthuoc;
    }

    @Override
    public String toString() {
        return "DungCuHt{" +
                "Xuatxu='" + Xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", hdsd='" + hdsd + '\'' +
                ", mausac='" + mausac + '\'' +
                ", chatlieu='" + chatlieu + '\'' +
                ", kichthuoc='" + kichthuoc + '\'' +
                '}';
    }

    public DungCuHt(String masp, String tensp, int soluong, int dongia, String danhmuc, String xuatxu, String thuonghieu, String nhacc, String hdsd, String mausac, String chatlieu, String kichthuoc) {
        super(masp, tensp, soluong, dongia, danhmuc);
        Xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.hdsd = hdsd;
        this.mausac = mausac;
        this.chatlieu = chatlieu;
        this.kichthuoc = kichthuoc;
    }

    @Override
    public void hienThiThongTin() {

    }

    @Override
    public void phanTramGiamgia(String LoaiKh) {

    }


}
