package Class;
import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private NSX x = new NSX();
    
    public Hang() {

    }

    public Hang(String maHang, String tenHang, NSX x) {

    }

    public void inputHang(Scanner sc) {
        System.out.print("Nhap ma hang: ");
        this.setMaHang(sc.nextLine());
        System.out.print("Nhap ten hang: ");
        this.setTenHang(sc.nextLine());
        System.out.println("Nhap thong tin NXS: ");
        x.nhap(sc);
    }

    public void outputHang() {
        System.out.println("Ma Hang: " + this.getMaHang());
        System.out.println("Ten Hang: " + this.getTenHang());
        System.out.println("Thong tin NSX: ");
        x.xuat();
    }
    public String getMaHang() {
        return this.maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return this.tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public NSX getX() {
        return this.x;
    }

    public void setX(NSX x) {
        this.x = x;
    }

    
}