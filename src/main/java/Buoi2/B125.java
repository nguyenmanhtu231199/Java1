package Buoi2;

import java.util.Scanner;

public class B125 {
    public static void main(String[] args) {
        // Thuộc số tự nhiên
        Scanner in = new Scanner(System.in);
        System.out.print("n=");
        int n = in.nextInt();
        in.close();
        // Kiểm tra n có phải số nguyên tố ?
        // 2 --> can bac 2 cua n
        if(n<=1){
            System.out.println("Khong hop le");
            System.exit(0);
        }
        //  Mặc định là số nguyên tố
        boolean flag = true;

        for ( int i=2;i <= Math.sqrt(n); i++){
            if(n % i ==0){
                //  Chỉ cần tìm 1 giá trị chia k phải 1 và n
                flag = false;
                break;
            }
        }
        if (flag){
            System.out.println("La so nguyen to");
        }
        else  System.out.println("khong phai la so nguyen to");
    }
}
