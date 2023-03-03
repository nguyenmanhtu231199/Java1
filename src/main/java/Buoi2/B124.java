package Buoi2;

import java.util.Random;
import java.util.Scanner;

public class B124 {
    public static void main(String[] args) {
    int[] testArr = {0,1999,3001,2001,2000,2005};
    // Duyệt mảng
        // Chỉ cần tìm giá trị đầu tiên thỏa mãn
        boolean check = false;
        for (int i=0; i<testArr.length; i++){
            if(testArr[i] % 2 ==0 && testArr[i] <2004){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("Có giá trị thỏa mãn");
        }
        else {
            System.out.println("Khong Có giá trị thỏa mãn");
        }
    }
}
