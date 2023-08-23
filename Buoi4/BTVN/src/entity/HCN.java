package entity;

import java.util.Scanner;

public class HCN {
    //thuoc tinh
    private int D, R;

    //phuong thuc
    public HCN(){

    }

    public HCN(int D2, int R2){
        D = D2;
        R = R2;
    }

    public void nhapHCN(Scanner sc){
        System.out.print("Nhap chieu dai: ");
        D = sc.nextInt();
        if (D<=0){
            do{
                System.out.println("Chieu dai ko hop le, nhap lai: ");
                D = sc.nextInt();
            }while(D<=0);
        }
        System.out.print("Nhap chieu rong: ");
        R = sc.nextInt();
        if (R<=0){
            do{
                System.out.println("Chieu rong ko hop le, nhap lai: ");
                R = sc.nextInt();
            }while(R<=0);
        }
    }

    public void setD(int D2){
        D = D2;
    }
    public int getD(){
        return D;
    }

    public void setR(int R2){
        R = R2;
    }
    public int getR(){
        return R;
    }

    public void veHCN(){
        for(int i = 0; i < R; i++){
            for(int j = 0; j < D; j++){
                if (i == 0 || i == R-1 || j == 0 || j == D-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.print("\n");
        }
    }

    public float chuVi(){
        return 2*(D+R);
    }

    public float dienTich(){
        return D*R;
    }
}
