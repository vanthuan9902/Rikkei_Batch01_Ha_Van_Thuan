package Demo;

import java.util.Scanner;

public abstract class SanPham {

        protected String masp, tensp;
        protected int soluong;
        protected int dongia;
        protected String danhmuc;

    public SanPham(String masp, String tensp, int soluong, int dongia, String danhmuc) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.dongia = dongia;
        this.danhmuc = danhmuc;
    }

    public SanPham()
        {

        }
    @Override
    public String toString() {
        return "SanPham{" +
                "masp='" + masp + '\'' +
                ", tensp='" + tensp + '\'' +
                ", soluong=" + soluong +
                ", dongia=" + dongia +
                ", danhmuc='" + danhmuc + '\'' +
                '}';
    }
    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getDanhmuc() {
        return danhmuc;
    }

    public void setDanhmuc(String danhmuc) {
        this.danhmuc = danhmuc;
    }

    public   void hienThiThongTin()
    {
        System.out.println("Ma san pham :" + masp);
        System.out.println("Ten san pham:" +tensp);
        System.out.println("So luong:" + soluong);
        System.out.println("Don gia:" + dongia);
        System.out.println("Danh muc:"+ danhmuc);
    };
    public abstract void phanTramGiamgia(String LoaiKh);
    }


