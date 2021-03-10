package rikki.com.demo_springboot1.model;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;
@Table(name="khachhang")
@Entity
public class UserProduct {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String makhachhang;
    private String tenkhachhang;
    private String email;
    private  int sodienthoai;
    private Date ngaysinh;
    private String maloai;
    protected UserProduct() {

    }
    public String getMakhachhang()
    {
        return makhachhang;
    }

    public void setMakhachhang(String makhachhang) {
        this.makhachhang = makhachhang;
    }

    public String getTenkhachhang() {
        return tenkhachhang;
    }

    public void setTenkhachhang(String tenkhachhang) {
        this.tenkhachhang = tenkhachhang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(int sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getMaloai() {
        return maloai;
    }

    public void setMaloai(String maloai) {
        this.maloai = maloai;
    }
}
