import { Component, OnInit } from '@angular/core';
export  class Khachhang{
  makh: string;
  tenkh: string;
  email: string;
  sdt: number;
  ngaysinh: string;
  maloai: string;
}
@Component({
  selector: 'app-khachhang',
  templateUrl: './khachhang.component.html',
  styleUrls: ['./khachhang.component.css']
})
export class KhachhangComponent implements OnInit {
  khachhang: Khachhang[] = [
    {makh: 'KH01', tenkh: 'ha van thuan', email: 'vanthuanha@gmail.com', sdt: 759989733, ngaysinh: '04/03/1999', maloai: 'LK01' },
    {makh: 'KH02', tenkh: 'ha vna phong', email: 'vanha@gmail.com', sdt: 878875609, ngaysinh: '04/06/2000', maloai: 'LK03' },
    {makh: 'KH03', tenkh: 'ha van dai', email: 'huanha@gmail.com', sdt: 987563623, ngaysinh: '07/03/2002', maloai: 'LK02' },
    {makh: 'KH04', tenkh: 'ha van loi', email: 'huha@gmail.com', sdt: 987563623, ngaysinh: '01/02/1998', maloai: 'LK01' },
    ];
  constructor() { }

  ngOnInit(): void {
  }

}
