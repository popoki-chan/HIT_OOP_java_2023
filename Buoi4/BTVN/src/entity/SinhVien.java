package entity;

import java.util.Scanner;

public class SinhVien {
    //thuoc tinh
    private int maSinhVien;
    private String hoTen;
    private float diemToan, diemLy, diemHoa;

    //phuong thuc
    public SinhVien(){

    }

    public SinhVien(int maSinhVien2, String hoTen2, float diemToan2, float diemLy2, float diemHoa2){
        maSinhVien = maSinhVien2;
        hoTen = hoTen2;
        diemToan = diemToan2;
        diemLy = diemLy2;
        diemHoa = diemHoa2;
    }

    public void nhapThongTinSV(Scanner sc){
        System.out.print("Nhap ma sinh vien: ");
        maSinhVien = sc.nextInt();
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextFloat();
        System.out.print("Nhap diem ly: ");
        diemLy = sc.nextFloat();
        System.out.print("Nhap diem hoa: ");
        diemHoa = sc.nextFloat();
    }

    public void xuatThongTinSV(){
        System.out.printf("%15d %25s %10d %10d %10d\n", maSinhVien, hoTen, diemToan, diemLy, diemHoa);
    }

    public float diemTB(){
        return (diemToan + diemLy + diemHoa)/3;
    }
    public void setMaSV(int maSinhVien2){
        maSinhVien = maSinhVien2;
    }

    public int getMaSV(){
        return maSinhVien;
    }

    public void setHoTen(String hoTen2){
        hoTen = hoTen2;
    }

    public String getHoTen(){
        return hoTen;
    }
    public void setDiemToan(float diemToan2){
        diemToan = diemToan2;
    }

    public float getDiemToan(){
        return diemToan;
    }
    
    public void setDiemyLy(float diemLy2){
        diemLy = diemLy2;
    }

    public float getDiemLy(){
        return diemLy;
    }
    public void setDiemHoa(float diemHoa2){
        diemHoa = diemHoa2;
    }

    public float getDiemHoa(){
        return diemHoa;
    }
}
