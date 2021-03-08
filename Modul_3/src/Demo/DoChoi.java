package Demo;

public class DoChoi extends SanPham{
    protected String xuatxu;
    protected String thuonghieu;

    public DoChoi(String masp, String tensp, int soluong, int dongia, String danhmuc, String xuatxu, String thuonghieu, String nhacc, String hdsd) {
        super(masp, tensp, soluong, dongia, danhmuc);
        this.xuatxu = xuatxu;
        this.thuonghieu = thuonghieu;
        this.nhacc = nhacc;
        this.hdsd = hdsd;
    }

    protected String nhacc;
    protected String hdsd;
    public DoChoi()
    {

    }

    public String getXuatxu() {
        return xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.xuatxu = xuatxu;
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

    @Override
    public String toString() {
        return "DoChoi{" +
                "xuatxu='" + xuatxu + '\'' +
                ", thuonghieu='" + thuonghieu + '\'' +
                ", nhacc='" + nhacc + '\'' +
                ", hdsd='" + hdsd + '\'' +
                '}';
    }

    @Override
    public void hienThiThongTin() {
        System.out.println();
    }

    @Override
    public void phanTramGiamgia(String LoaiKh) {

    }


}
