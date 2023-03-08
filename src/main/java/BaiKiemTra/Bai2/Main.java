package BaiKiemTra.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new KyThuat("NV001", "Nguyễn Mạnh Tú", "23/11/1999",
                "Vĩnh Phúc", "Điện tử viễn thông" );
        System.out.println("Nhập thông tin nhân viên: ");
        System.out.println(" Mã Nhân viên: ");
        String id= sc.nextLine();
        System.out.println(" Họ và tên: ");
        String name = sc.nextLine();
        System.out.println(" Ngày tháng năm sinh: ");
        String born = sc.nextLine();
        System.out.println(" Địa chỉ: ");
        String address = sc.nextLine();
        System.out.println("Chuyên Nghành :");
        String chuyenNghanh = sc.nextLine();
        NhanVien nv2 = new KyThuat(id,name,born,address,chuyenNghanh);
        System.out.println(nv1);
        System.out.println("JD: " + nv1.moTaCongViec());
        System.out.println(nv2);
        System.out.println("JD: " + nv2.moTaCongViec());
    }
}
