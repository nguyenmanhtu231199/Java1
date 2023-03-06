package Buoi3;

import org.example.Main;

public class ExampleHCN {
    public static void main(String[] args) {
        // Tạo ra hình chữ nhât 3,4
        HCN hcn1= new HCN();
        hcn1.chieuDai = 3;
        hcn1.chieuRong = 4;
        System.out.printf("Chu vi = %.2f, dien tich = %.2f \n", hcn1.tinhChuVi(), hcn1.tinhS());
        HCN hcn2= new HCN(5,6);
        System.out.printf("Chu vi = %.2f, dien tich = %.2f \n", hcn2.tinhChuVi(), hcn2.tinhS());

    }
}
