package BTVN_Buoi4;

import java.util.Scanner;

import entity.SinhVien;;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien a = new SinhVien();
        SinhVien b = new SinhVien();
        SinhVien c = new SinhVien();
        SinhVien d = new SinhVien();
        SinhVien e = new SinhVien();

        System.out.println("Nhap thong tin sinh vien thu 1: ");
        a.nhapThongTinSV(sc);
        System.out.println("Nhap thong tin sinh vien thu 2: ");
        b.nhapThongTinSV(sc);
        System.out.println("Nhap thong tin sinh vien thu 3: ");
        c.nhapThongTinSV(sc);
        System.out.println("Nhap thong tin sinh vien thu 4: ");
        d.nhapThongTinSV(sc);
        System.out.println("Nhap thong tin sinh vien thu 5: ");
        e.nhapThongTinSV(sc);

        System.out.printf("%15d %25s %10d %10d %10d\n", "maSinhVien", "hoTen", "diemToan", "diemLy", "diemHoa");
        a.xuatThongTinSV();
        b.xuatThongTinSV();
        c.xuatThongTinSV();
        d.xuatThongTinSV();
        e.xuatThongTinSV();

        System.out.println("Diem trung binh cua sinh vien thu 1 la: " + a.diemTB());
        System.out.println("Diem trung binh cua sinh vien thu 2 la: " + b.diemTB());
        System.out.println("Diem trung binh cua sinh vien thu 3 la: " + c.diemTB());
        System.out.println("Diem trung binh cua sinh vien thu 4 la: " + d.diemTB());
        System.out.println("Diem trung binh cua sinh vien thu 5 la: " + e.diemTB());
    }
}
