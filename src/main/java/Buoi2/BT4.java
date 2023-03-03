package Buoi2;

import java.util.Scanner;

public class BT4 {
    public static void main(String[] args) {
        String user = "user";
        String password = "password";

        Scanner scanner = new Scanner(System.in);

        int count = 1;

        while (true) {
            count++;
            System.out.print("Nhập vào tài khoản : ");
            user = scanner.nextLine();
            System.out.print("Nhập vào mật khẩu : ");
            password = scanner.nextLine();

            if (user.equalsIgnoreCase("admin") && password.equals("admin")) {
                System.out.println("Đăng nhập thành công");
                break;
            } else if (count <= 4) {
                System.out.printf("Ban con %d lan nhap!", count);
                System.out.print(" Vui lòng nhập lại \n");
            } else {
                System.out.println("đăng nhập thất bại");
                break;
            }

        }
        scanner.close();
    }
}
