package Buoi2;

import java.util.Scanner;

public class B33 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n= in.nextInt();
        in.close();
        if (n<1) {
            System.out.print("ERROR");
            System.exit(0);
        }
        double t=0;
        for (int i= 1; i<=n ; i++) {
            t= Math.sqrt(t + 2);
        }
           System.out.println("S(n) = " + t);
        }
        }

