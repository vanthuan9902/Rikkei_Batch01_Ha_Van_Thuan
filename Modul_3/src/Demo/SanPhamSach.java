package Demo;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;

public class SanPhamSach extends SanPham implements Serializable {
    public SanPhamSach(String masp, String tensp, int soluong, int dongia, String danhmuc, String nhaxb, Year nam, String tacgia, Date ngay, int lantb) {
        super(masp, tensp, soluong, dongia, danhmuc);
        this.nhaxb = nhaxb;
        this.nam = nam;
        this.tacgia = tacgia;
        this.ngay = ngay;
        this.lantb = lantb;
    }

    protected String nhaxb;
    protected Year nam;
    protected String tacgia;
    protected Date ngay;
    protected int lantb;



    public SanPhamSach(int maid, String name, int soluong, Float dongia, String danhmuc, String nhaxb, Year nam, String tacgia, Date ngay, int lantb)
    {

    }

    public String getNhaxb() {
        return nhaxb;
    }

    public void setNhaxb(String nhaxb) {
        this.nhaxb = nhaxb;
    }

    public Year getNam() {
        return nam;
    }

    public void setNam(Year nam) {
        this.nam = nam;
    }

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getLantb() {
        return lantb;
    }

    public void setLantb(int lantb) {
        this.lantb = lantb;
    }

    @Override
    public String toString() {
        return "SanPhamSach{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                ", danhmuc='" + danhmuc + '\'' +
                '}';
    }



    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Nha xuat ban:" +nhaxb);
    }

    @Override
    public void phanTramGiamgia(String loaikh) {

        switch (loaikh)
    {
        case "Thuong":
            System.out.println("giam gia 2%");break;
        case "Vip1"   :
            System.out.println("giam gia 5%"); break;
        case "Vip2"   :
            System.out.println("giam gia 7%"); break;
        default:
            System.out.println("khoong thuoc loai khach hang dc giam gia");
    }

    }
}
