package Class;

import java.util.Scanner;

public class May {
    private String maMay;
    private String tenMay;
    private String tinhTrang;

    public May() {
        
    }

    public May(String maMay, String tenMay, String tinhTrang) {
        this.maMay = maMay;
        this.tenMay = tenMay;
        this.tinhTrang = tinhTrang;
    }

    public void Nhap(Scanner sc) {
        System.out.print("Nhap ma may: ");
        maMay = sc.next();
        System.out.print("Nhap ten may: ");
        tenMay = sc.next();
        System.out.print("Nhap tinh trang may: ");
        tinhTrang = sc.next();
    }

    public void Xuat() {
        System.out.println("Ma may: " + maMay);
        System.out.println("Ten may: " + tenMay);
        System.out.println("Tinh trang: " + tinhTrang);
    }
    
    public String getMaMay() {
        return this.maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getTenMay() {
        return this.tenMay;
    }

    public void setTenMay(String tenMay) {
        this.tenMay = tenMay;
    }

    public String getTinhTrang() {
        return this.tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }


}
