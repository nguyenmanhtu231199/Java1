package Buoi5.Ex1;

public class HinhTron extends HinhHoc {
    private double banKinh = 1.0;
    public HinhTron(){

    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron(String color, double banKinh) {
        super(color);
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    public double tinhChuvi(){
        return banKinh*Math.PI *2;
    }

    @Override
    public double tinhDientich() {
        return banKinh*banKinh*Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" + super.toString()+
                "banKinh=" + banKinh +
                '}';
    }
}
