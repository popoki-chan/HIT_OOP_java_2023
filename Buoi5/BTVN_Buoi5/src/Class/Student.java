package Class;

import java.util.Scanner;

public class Student {
    private String Name;
    private String Lop;
    private Double Score;
    private Faculty y = new Faculty();

    public Student() {

    }

    public Student(String Name, String Lop, Double Score, Faculty y) {
        this.Name = Name;
        this.Lop = Lop;
        this.Score = Score;
        this.y = y;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLop() {
        return this.Lop;
    }

    public void setClass(String Lop) {
        this.Lop = Lop;
    }

    public Double getScore() {
        return this.Score;
    }

    public void setScore(Double Score) {
        this.Score = Score;
    }

    public Faculty getY() {
        return this.y;
    }

    public void setY(Faculty y) {
        this.y = y;
    }
    
    public void Input(Scanner sc) {
        System.out.print("Nhap ten sinh vien: ");
        Name = sc.next();
        System.out.print("Nhap lop: ");
        Lop = sc.next();
        System.out.print("Nhap diem so: ");
        Score = sc.nextDouble();
        y.Input(sc);
    }

    public void Output() {
        System.out.println("Ten sinh vien: " + Name);
        System.out.println("Lop: " + Lop);
        System.out.println("Diem so: " + Score);
        y.Output();
    }
    
}
