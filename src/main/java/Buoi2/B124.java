package Buoi2;

import java.util.Random;
import java.util.Scanner;

public class B124 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập kích thước mảng : ");
        int n = in.nextInt();
        in.close();
        if (n < 1) {
            System.out.println("Kích thước mảng không hợp lệ!!!");
            System.exit(0);
        }
        Random random = new Random();
        //  Tạo mảng
        int[] arr = new int[n];
        // Lặp n lần
        // Mỗi lần lặp --> gán giá trị ngẫu nhiên cho mảng vừa lập
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(9999);
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]=%d \n", i, arr[i]);
        }
        for ( int i=0 ; i <n; i++){

        }
    }
}
