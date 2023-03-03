package Buoi2;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        // nhap chuoi tu ban phim roi in ra chuoi viet hoa
        // chuong trinh dung khi user typing exit/
        // a ->A
        // bkacad -> BKACAD
        // exit --> out program
        String s="";
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("Nhap chuoi: ");
            s= in.nextLine();
            if (s.equalsIgnoreCase("exit")){
                break;
            }
            s= s.toUpperCase();
            System.out.println("Viet hoa : " +s);
        }
        in.close();
    }
}
