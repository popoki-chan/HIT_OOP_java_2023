package Class;
import java.util.Scanner;

public class Faculty {
    private String Name;
    private String Date;
    private School x = new School();

    public Faculty() {

    }

    public Faculty(String Name, String Date, School x) {
        this.Name = Name;
        this.Date = Date;
        this.x = x;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDate() {
        return this.Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public School getX() {
        return this.x;
    }

    public void setX(School x) {
        this.x = x;
    }
    
    public void Input(Scanner sc) {
        System.out.print("Nhap ten truong: ");
        this.x.setName(sc.next());
        System.out.print("Nhap ngay vao truong: ");
        this.x.setDate(sc.next());
        System.out.print("Nhap ten khoa: ");
        Name = sc.next();
        System.out.print("Nhap ngay vao khoa: ");
        Date = sc.next();
    }

    public void Output() {
        System.out.println("Ten truong: " + x.getName());
        System.out.println("Ngay vao truong: " + x.getDate());
        System.out.println("Ten khoa: " + Name);
        System.out.println("Ngay vao khoa: " + Date);
    }
}
