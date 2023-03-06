package Buoi3;

public class HinhTron {
     double banKinh;
    public HinhTron(double banKinh){
        this.banKinh =banKinh;
    }
     public double tinhChuvi(){
         return banKinh*2*Math.PI;
     }
     public double tinhDienTich(){
         return banKinh*banKinh*Math.PI;
     }

    @Override
    public String toString() {
        return "HinhTron{" +
                "banKinh=" + banKinh +
                '}';
    }
}


