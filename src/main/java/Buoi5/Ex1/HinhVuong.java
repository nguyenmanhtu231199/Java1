package Buoi5.Ex1;

public class HinhVuong extends HinhHoc{
    private double canh = 1.0;
    public  HinhVuong(){

    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(String color, double canh) {
        super(color);
        this.canh = canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }
    public double getCanh() {
        return canh;
    }
    @Override
    public double tinhChuvi(){
        return canh*4;
    }

    @Override
    public double tinhDientich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + super.toString()+
                "canh=" + canh +
                '}';
    }
}
