package BTVN_Buoi4;

import java.util.Scanner;

import entity.HCN;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HCN a = new HCN();
        System.out.println("Nhap thong tin HCN: ");
        a.nhapHCN(sc);
        a.veHCN();
        System.out.println("Chu vi HCN la: " + a.chuVi());
        System.out.println("Dien tich HCN la: " + a.dienTich());
    }
}
