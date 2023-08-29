import java.util.Scanner;
public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void inputPoint(Scanner sc){
        System.out.print("Nhap hoanh do: ");
        x = sc.nextInt();
        System.out.print("Nhap tung do:");
        y = sc.nextInt();
    }
    
    public void setX(int x){
        this.x = x;
    }
    public int getX(){
        return x;
    }

    public void setY(int y){
        this.y = y;
    }
    public int getY(){
        return y;
    }
}
