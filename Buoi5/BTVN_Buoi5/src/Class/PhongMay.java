package Class;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private Double dienTich;
    private QuanLy x = new QuanLy();
    private May y[] = new May[50];
    private int n;

    public PhongMay() {

    }

    public PhongMay(String maPhong, String tenPhong, Double dienTich, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma phong: ");
        maPhong = sc.next();
        System.out.print("Nhap ten phong: ");
        tenPhong = sc.next();
        x.Nhap(sc);
        System.out.print("Nhap so luong may: ");
        n = sc.nextInt();
        if (n < 1 || n > 50) {
            do {
                System.out.print("So luong may ko hop le, nhap lai: ");
                n = sc.nextInt();
            }while (n < 1 || n > 50);
        }
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap thong tin may thu " + (i+1) + ": /n");
            y[i] = new May();
            y[i].Nhap(sc);
        }

    }

    public void Xuat() {
        System.out.println("Ma Phong: " + maPhong);
        System.out.println("Ten Phong: " + tenPhong);
        System.out.println("Dien Tich: " + dienTich + " m2");
        x.Xuat();
        for (int i = 0; i < n; i++) {
            System.out.print("Thong tin may thu " + (i+1) + ": /n");
            y[i].Xuat();
        }

    }

    public String getMaPhong() {
        return this.maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return this.tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Double getDienTich() {
        return this.dienTich;
    }

    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return this.x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return this.y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        this.n = n;
    }

}

