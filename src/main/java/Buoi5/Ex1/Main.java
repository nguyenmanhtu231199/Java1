package Buoi5.Ex1;

public class Main {
    public static void main(String[] args) {
        HinhHoc[] arr= new HinhHoc[3];
        arr[0] = new HinhTron(3);
        arr[1] = new HinhVuong(4);
        arr[2] = new HinhTron(10);
        // Dien tich lon nhat
        HinhHoc hinhHocMax= null;
        double dtMax = 0;
        for (HinhHoc h : arr){
            if (h.tinhDientich() > dtMax){
                dtMax = h.tinhDientich();
                hinhHocMax = h;
            }
        }
        System.out.println("Hinh có dien tich lon nhat là :");
        System.out.println(hinhHocMax);
    }
}
