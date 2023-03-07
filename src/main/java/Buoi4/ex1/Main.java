package Buoi4.ex1;

public class Main {
    public static void main(String[] args) {
        HinhChuNhat testCase1 = new HinhChuNhat(0,4);
        System.out.println("HCN 1:");
        System.out.println(testCase1.chuVi());
        System.out.println(testCase1.dienTich());
        HinhChuNhat testCase2 = new HinhChuNhat(3,4);
        System.out.println("HCN 2:");
        System.out.println(testCase2.chuVi());
        System.out.println(testCase2.dienTich());
    }
}
