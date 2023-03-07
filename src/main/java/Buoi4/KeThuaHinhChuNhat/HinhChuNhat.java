package Buoi4.KeThuaHinhChuNhat;

public class HinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;

    public HinhChuNhat(){

    }
    public HinhChuNhat(double chieuDai, double chieuRong) {
        if(chieuDai<= 0 || chieuRong <=0){
            throw new RuntimeException("canh phai la so duong");
        }
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }
    public double tinhChuVi(){
        return (chieuDai + chieuRong) *2;
    }
    public double tinhDienTich(){
        return (chieuDai * chieuRong) ;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
