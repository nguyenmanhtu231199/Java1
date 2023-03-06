package Buoi3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // Tạo đối tượng
        Dog d1 = new Dog();
        d1.id = 1;
        d1.name = "Pitbull ";
        d1.color="Black Bink ";
        d1.age= 2;
        // Hành vi
        d1.eat();
        d1.run();
        // Tạo đối tượng d2 - dữ liệu nhập từ bàn phím
        // Dùng các phương thức : run(), eat(), sleep()
        Dog d2 = new Dog();
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap id:");
        d2.id =Integer.parseInt(in.nextLine());
        System.out.print("Nhap Name:");
        d2.name =in.nextLine();
        System.out.print("Nhap Mau:");
        d2.color =in.nextLine();

        d2.run();
        d2.eat();
        d2.sleep();
    }
}
