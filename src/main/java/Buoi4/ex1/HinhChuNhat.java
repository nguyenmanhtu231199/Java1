package Buoi4.ex1;

public class HinhChuNhat {
    private double chieuDai = 1.0;
    private double chieuRong = 1.0;
    public HinhChuNhat(){

    }
    public HinhChuNhat (double chieuDai, double chieuRong) {
        if (chieuDai <= 0 || chieuRong <= 0) {
            System.out.println("Cạnh phải là số dương");
            System.out.println("Kích thước mặc định 1x1");
        } else {
            this.chieuDai = chieuDai;
            this.chieuRong = chieuRong;
        }
    }
    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        if( chieuDai >= 0){
            this.chieuDai=chieuDai;
        }
        else {
            System.out.println("Chieu dai khong hop le");
            System.exit(0);
        }
    }

    public void setChieuRong(double chieuRong) {
        if (chieuRong >= 0) {
            this.chieuRong = chieuRong;
        }
        else {
            System.out.println("Chieu rong khong hop le");
            System.exit(0);
        }
    }
    public double chuVi(){
        return (chieuDai + chieuRong)*2;
    }
    public double dienTich(){
        return chieuDai*chieuRong;
    }
}
