package entity;

import java.util.Scanner;
public class Sach {
    //thuoc tinh
    private int maSach;
    private String tenSach, tenTacGia, nxb;
    private int namxb;
    //phuong thuc
    //ham ko doi so
    public Sach(){

    }
    //ham co doi so
    public Sach(int maSach2, String tenSach2, String tenTacGia2, String nxb2, int namxb2){
        maSach = maSach2;
        tenSach = tenSach2;
        tenTacGia = tenTacGia2;
        nxb = nxb2;
        namxb = namxb2;
    }
    //nhap
    public void nhapThongTin(Scanner sc){
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextInt();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.next();
        System.out.print("Nhap ten tac gia: ");
        tenTacGia = sc.next();
        System.out.print("Nhap ten nha xuat ban: ");
        nxb = sc.next();
        System.out.print("Nhap nam xuat ban: ");
        namxb = sc.nextInt();
    }
    //xuat
    public void xuatThongTin(){
        System.out.printf( "%10d %20s %20s %15s %10d\n", maSach, tenSach, tenTacGia, nxb, namxb);
    }

    public void setMaSach(int maSach2){
        maSach = maSach2;
    }
    public int getMaSach(){
        return maSach;
    }

    public void setTenSach(String tenSach2){
        tenSach = tenSach2;
    }
    public String getTenSach(){
        return tenSach;
    }

    public void setTenTacGia(String tenTacGia2){
        tenTacGia = tenTacGia2;
    }
    public String getTenTacGia(){
        return tenTacGia;
    }

    public void setNxb(String nxb2){
        nxb = nxb2;
    }
    public String getNxb(){
        return nxb;
    }

    public void setNamxb(int namxb2){
        namxb = namxb2;
    }
    public int getNamxb(){
        return namxb;
    }

}
