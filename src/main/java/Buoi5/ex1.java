package Buoi5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        // Viết 1 chương trình thương a/b . chương trình sẽ dwufng khi tính được 1 phép tính đầu tiên
        int a,b;
        Scanner in = new Scanner(System.in);
        while (true){
        try {
            System.out.println("a,b =");
            a =in.nextInt();
            b = in.nextInt();
            in.close();
            System.out.println("a/b = "+ (a / b));
            break;
        }
        catch (InputMismatchException e){
            System.out.println(" Nhap sai data");
        }
        catch (ArithmeticException e){
            System.out.println(" Lỗi chia cho 0 !");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
        in.close();
    }
}
