package Demo;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SachManager {
    public static Scanner scanner = new Scanner(System.in);
    private List<SanPhamSach> sanPhamSachList;
    private SachDao sachDao;

    public SachManager() {
        sachDao = new SachDao();
        sanPhamSachList = sachDao.read();
    }

    public void add() {
//        int maid = (sanPhamSachList.size() > 0) ? (sanPhamSachList.size() + 1) : 1;
//        System.out.println("sach id = " + maid);
        String masp = intputMaSP();
        String ten = inputTen();
        Integer soluong = inputSoLuong();
        Integer dongia = inputDongia();
        String danhmuc = inputDanhMuc();
        String nhaxb = inputNhaxb();
        Year nam = inputNam();
        String tacgia = inputTacGia();
        Date ngay = inputNgay();
        Integer lantb = inputLanTB();
        SanPhamSach sanpham = new SanPhamSach(masp, ten, soluong, dongia, danhmuc, nhaxb, nam, tacgia, ngay, lantb);
        sanPhamSachList.add(sanpham);
        sachDao.write(sanPhamSachList);
    }


    public void show() {
        for (SanPhamSach sanpham : sanPhamSachList) {
            System.out.format("%5s | ", sanpham.getMasp());
            System.out.format("%5s | ", sanpham.getTensp());
            System.out.format("%5d | ", sanpham.getSoluong());
            System.out.format("%5d", sanpham.getDongia());
            System.out.format("%5s | ", sanpham.getDanhmuc());
            System.out.format("%5s | ", sanpham.getNhaxb());
            System.out.format("%5s | ", sanpham.getNam());
            System.out.format("%5s | ", sanpham.getTacgia());
            System.out.format("%5s | ", sanpham.getNgay());
            System.out.format("%5d \n ", sanpham.getLantb());


        }
    }


    private String intputMaSP() {
        System.out.print("Input student id san pham: ");
        while (true) {
            try {
                String masp = scanner.nextLine();
                return masp;
            } catch (NumberFormatException ex) {
                System.out.print("invalid! Input student id again: ");
            }
        }

    }

    private String inputTen() {
        System.out.print("Input sach name: ");
        return scanner.nextLine();
    }

    private int inputSoLuong() {
        System.out.print("Input so luong: ");
        return Integer.parseInt((scanner.nextLine()));
    }

    private int inputDongia() {
        System.out.print("Input don gia: ");
        return Integer.parseInt((scanner.nextLine()));
    }

    private String inputDanhMuc() {
        System.out.print("Input danh muc: ");
        return scanner.nextLine();
    }

    private String inputNhaxb() {
        System.out.print("Input nhaxb: ");
        return scanner.nextLine();
    }

    private Year inputNam() {
        System.out.print("Input sach nam: ");
        return Year.parse(scanner.nextLine());
    }

    private String inputTacGia() {
        System.out.print("Input tac gia: ");
        return scanner.nextLine();
    }

    private Date inputNgay() {
        System.out.print("Input Ngay Xuat Ban: ");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        try {
            date = formatter.parse(scanner.nextLine());
        } catch (Exception e) {
        }
        return date;
    }

    private int inputLanTB() {
        System.out.print("Input lan tai ban: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public List<SanPhamSach> getSanPhamSachList() {
        return sanPhamSachList;
    }

    public void setSanPhamSachList(List<SanPhamSach> sanPhamSachList) {
        this.sanPhamSachList = sanPhamSachList;
    }

    public SanPhamSach timHoaDonTheoMASACH(String maS){
        if (sanPhamSachList == null) {
            System.out.println("Khong co sach nay!");
        } else {
            for (SanPhamSach masach :
                    sanPhamSachList) {
                if (masach.getMasp() == maS) {
                    return masach;
                }
            }
        }
        return null;
    }


}

   


