package Demo;

import java.util.Date;

public class KhachHang {
    protected String makh, hoten, sdt, email;
    protected Date ngaysinh;
    protected String loaikh;

    public KhachHang(String makh, String hoten, String sdt, String email, Date ngaysinh, String loaikh) {
        this.makh = makh;
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.loaikh = loaikh;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLoaikh() {
        return loaikh;
    }

    public void setLoaikh(String loaikh) {
        this.loaikh = loaikh;
    }
}
