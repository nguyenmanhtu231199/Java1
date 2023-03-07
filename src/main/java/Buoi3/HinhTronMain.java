package Buoi3;

import java.util.Scanner;

public class HinhTronMain {
    public static void main(String[] args) {
        int size;
        int count=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap kich thuoc mang");
        size = in.nextInt();
        HinhTron[] arr = new HinhTron[size];
        for (int i= 0; i<size;i++){
            System.out.println("Hinh chu nhat thu" +i);
            System.out.print("Ban Kinh: ");
            double banKinh = in.nextDouble();
            arr[i] = new HinhTron(banKinh);
        }
        in.close();
        for (int i=0; i<size; i++){
            System.out.println(arr[i].toString());
        }
        double cvMax = arr[0].tinhChuvi();
        int vtcvMax = 0;
        for (int i = 1; i < arr.length; i++) {
            if (cvMax < arr[i].tinhChuvi()) {
                cvMax = arr[i].tinhChuvi();
                vtcvMax = i;
            }
        }
        double dtMin = arr[0].tinhDienTich();
        int vtdtMin = 0;
        for (int i = 1; i < arr.length; i++) {
            if (dtMin > arr[i].tinhDienTich()) {
                dtMin = arr[i].tinhDienTich();
                vtdtMin = i;
            }
        }
        double total = 0;
        for ( int i = 0; i< arr.length; i++ ){
               total = total + arr[i].tinhChuvi();
        }
        double avgChuvi = total/ arr.length;
        System.out.println("Trung binh cua chu vi hinh tron la" + avgChuvi);
        // ve ngam cuu lai cai nay (  kho vcl )
//        for (HinhTron circle: arr
//             ) {
//            if(circle.tinhChuvi() > avgChuvi){
//                count++;
//            }
//        }
//        System.out.println(count);
    }
}
