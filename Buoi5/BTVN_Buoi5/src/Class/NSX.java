package Class;
import java.util.Scanner;

public class NSX {
    private String maNSX;
    private String tenNSX;
    private String dcNSX;

    public NSX() {

    }

    public NSX(String maNSX, String tenNSX, String dcNSX) {
        this.maNSX = maNSX;
        this.tenNSX = tenNSX;
        this.dcNSX = dcNSX;
    }

    public void nhap(Scanner sc) {
        System.out.print("Nhap ma nha san xuat: ");
        maNSX = sc.next();
        
        System.out.print("Nhap ten nha san xuat: ");
        tenNSX = sc.next();
        
        System.out.print("Nhap dia chi nha san xuat: ");
        dcNSX = sc.next();
        
    }

    public void xuat() {
        System.out.println("Ma NSX: " + maNSX);
        System.out.println("Ten NSX: " + tenNSX);
        System.out.println("Dia Chi NSX: " + dcNSX);
    }

    public String getMaNSX() {
        return this.maNSX;
    }

    public void setMaNSX(String maNSX) {
        this.maNSX = maNSX;
    }

    public String getTenNSX() {
        return this.tenNSX;
    }

    public void setTenNSX(String tenNSX) {
        this.tenNSX = tenNSX;
    }

    public String getDcNSX() {
        return this.dcNSX;
    }

    public void setDcNSX(String dcNSX) {
        this.dcNSX = dcNSX;
    }

}
