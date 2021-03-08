#cau 2
select *from sanphamsach s
where s.SoLuong>60 and s.Dongia<1000000 ;
select *from sanphamdochoi d
where d.SoLuong>300 and d.Dongia<1000000 ; 
select *from sanphamdungcu c
where c.SoLuong>200 and c.Dongia<1000000 ; 

#khong co dia chi trong bang khachhang, cau 3
select *from khachhang 
where ROUND(DATEDIFF(now(),( NgaySinh)/365) BETWEEN 16 and 30) AND ROUND(DATEDIFF(now(), NgaySinh)/365) = 40;

#cau 4
select c.TenSPSach, c.SoLuong, c.DonGia, a.TenSPDoChoi, a.SoLuong, a.DonGia, b.TenSPDungCu, b.SoLuong, b.DonGia 
 from donhang dh, chitietdonhang ct, sanphamdochoi a, sanphamdungcu b,sanphamsach c
where year(dh.NgayMuaHang)=2020;

#cau 5
select * from donhang d, khachhang
where QUARTER(d.NgayMuaHang)=1;


#cau 6
select *from khachhang
where length(TenKhachHang)>15 and (left(TenKhachHang,1)='N' or left(TenKhachHang,1)='Đ' or left(TenKhachHang,1)='C');

#cau 7:Hien thi thong tin san pham sach duoc khach mua va chua mua
select MaSPSach,TenSPSach, SoLuong,DonGia, DonVi, MaDMSach, NhaXuatBan, TacGia, SoLuong*DonGia as ThanhTien from sanphamsach;
