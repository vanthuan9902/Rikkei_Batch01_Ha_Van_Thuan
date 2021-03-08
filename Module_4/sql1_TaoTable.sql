create database QuanLyNhaSach;
create table quanlynhasach.SanPhamSach(
	MaSPSach varchar(255) NOT NULL,
    TenSPSach varchar(255) NOT NULL ,
    SoLuong int NOT NULL ,
    DonGia int,
    DonVi int NOT NULL ,
    MaDMSach varchar(255) NOT NULL ,
    NhaXuatBan varchar(255),
    NamXuatBan year, 
    TacGia varchar(255),
    NgayXuatBan date,
    LanTaiBan int,
    PRIMARY KEY (MaSPSach),
	FOREIGN KEY (MaDMSach) REFERENCES DMSach(MaDMSach) 
	
    );
    ALTER TABLE sanphamsach MODIFY DonVi varchar(255);
    

create table DMSach(
MaDMSach varchar(255) not null,
TheLoai varchar(255) not null,
MoTa varchar(255) ,
primary key (MaDMSach)
);
CREATE table NhanVien( 
MaNhanVien varchar(255) not null ,
 primary Key(MaNhanVien),
TenNhanVien varchar(255),
NgaySinh date ,
ViTri varchar(255),
SoDienThoai int,
Email varchar(255),
DiaChi varchar(255)
);
create table DonHang(
MaDonHang varchar(255) not null ,
MaKhachHang varchar(255),
MaNhanVien varchar (255),
NgayMuaHang date,
TongTien float,
primary key (MaDonHang),
foreign key (MaKhachHang) references KhachHang(MaKhachHang),
foreign key (MaNhanVien) references nhanvien(MaNhanVien)
);
create table ChiTietDonHang(
MaDonHang varchar(255) not null,
MaSanPham varchar(255) not null,
SoLuong int ,
foreign key (MaDonHang) references donhang(MaDonHang),
foreign key(MaSanPham) references sanphamsach(MaSPSach),
foreign key(MaSanPham) references sanphamdungcu(MaSPDungCu),
foreign key(MaSanPham) references sanphamdochoi(MaSPDoChoi)
);
create table KhachHang(
MaKhachHang varchar(255) not null,
TenKhachHang varchar(255),
Email varchar(255),
SoDienThoai int,
NgaySinh date,
MaLoai varchar (255),
primary key (MaKhachHang),
foreign key (MaLoai) references LoaiKhachHang(MaLoai)
);
create table LoaiKhachHang(
MaLoai varchar (255) not null,
TenLoai varchar(255) ,
primary key (MaLoai)
);
create table SanPhamDoChoi(
MaSPDoChoi varchar(255),
TenSPDoChoi varchar(255),
SoLuong int,
DonGia int,
Donvi varchar(255),
MaDMDoChoi varchar(255),
XuatXu varchar(255),
ThuongHieu varchar(255),
NhaCungCap varchar(255),
HuongDan varbinary(1000),
primary key (MaSPDoChoi),
foreign key (MaDMDoChoi) references DMDoChoi(MaDMDoChoi)
);
ALTER TABLE sanphamdochoi MODIFY DonVi varchar(255);
create table DMDoChoi(
MaDMDoChoi varchar(255),
Nhom varchar(255),
MoTa varchar(255),
primary key (MaDMDoChoi)
);
create table SanPhamDungCu(
MaSPDungCu varchar(255),
TenSPDungCu varchar(255),
SoLuong int,
Donvi varchar(255),
MaDMDungCu varchar(255),
XuatXu varchar(255),
ThuongHieu varchar(255),
NhaCungCap varchar(255),
MauSac varchar(255),
KichThuoc varchar(255),
ChatLieu varchar(255),
HuongDan varbinary(1000),
primary key (MaSPDungCu),
foreign key (MaDMDungCu) references DMDungCu(MADMDungCu)
);
 ALTER TABLE sanphamdungcu
ADD Dongia int;
create table DMDungCu(
MaDMDungCu varchar(255),
Khoi varchar(255),
MoTa varbinary(255),
primary key (MaDMDungCu)
);