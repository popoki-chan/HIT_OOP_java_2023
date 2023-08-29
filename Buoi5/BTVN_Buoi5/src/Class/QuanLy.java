package Class;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public QuanLy() {

    }

    public QuanLy(String maQL, String hoTen) {
        this.maQL = maQL;
        this.hoTen = hoTen;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma quan ly: ");
        maQL = sc.next();
        System.out.print("Nhap ho ten quan ly: ");
        hoTen = sc.next();
    }

    public void Xuat() {
        System.out.println("Ma Quan Ly: " + maQL);
        System.out.println("Ho Ten Quan Ly: " + hoTen);
    }

    public String getMaQL() {
        return this.maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


}
