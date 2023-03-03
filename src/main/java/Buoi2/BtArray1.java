package Buoi2;

import java.util.Random;
import java.util.Scanner;

public class BtArray1 {
    public static void main(String[] args) {
        // Tạo 1 mảng ngẫu nhiên gồm n số tự nhiên từ 0-->9999
        // a. In ra mảng vừa tạo
        // b. In ra số lớn nhất và bé nhất
        // c. tính trung bình cộng các số trong mảng
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
        // In ra mảng vừa tạo
        for (int i = 0; i < n; i++) {
            System.out.printf("arr[%d]=%d \n", i, arr[i]);
        }
        // Tạo giá trị max và min
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Gia tri nho nhat" + min);
        System.out.println("Gia tri lon nhat" + max);
        double Total= 0;
        for ( int i=0; i< arr.length; i++){
            Total = Total + arr[i];
        }
        double avg = Total/ arr.length;
        System.out.println("Gia tri trung binh la :"+ avg);
    }
}
