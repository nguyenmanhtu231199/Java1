package BaiKiemTra.Bai1;

public class main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println(c1);
        System.out.println(" Dien tich cua hinh la :" +c1.getArea());
        System.out.println(" Chu vi cua hinh la :"+c1.getCircumference());
        Circle c2 = new Circle(10);
        System.out.println(c2);
        System.out.println(" Dien tich cua hinh la :" +c2.getArea());
        System.out.println(" Chu vi cua hinh la :"+c2.getCircumference());
        try{
            Circle c3 = new Circle(-3);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            Circle c4 = new Circle(3);
            c4.setRadius(-3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
