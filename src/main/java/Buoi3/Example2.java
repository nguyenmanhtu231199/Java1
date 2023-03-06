package Buoi3;

import java.util.Random;

public class Example2 {
    // Hàm không có giá trị trả về không có tham số
    public static void sayHello() {
        System.out.println("Hello, lô con cak");
    }
    // 2 Hàm không có giá trị trả về và có tham số
    public static void sayHello(String language) {
         System.out.println("Hello, welcome to " + language);
    }
    //3. Hàm có giá trị trả về v không có tham số(opp- dùng nhiều)
    public static int getRandomNumber() {
    //o-->999
        return new Random().nextInt(1000);

    }
    // 4.Hàm có giá trị trả về và có tham số
    // viết hàm tính tổng 2 số thực
     public static  double sumAB(double a, double b){
        return  (a+b);
     }
    public static void main(String[] args) {
         sayHello();
         sayHello("PHP");
         sayHello("Python");
         int number1=getRandomNumber();
         int number2 = getRandomNumber();
         int t= number1 +number2;
         System.out.println("T =" +t);
         // Tính tổng 3 so ??? x,y,z
        double x=1.5, y=3.5,z=2.5;
        double k= sumAB(sumAB(x,y),z);
        System.out.println(k);
    }
}
