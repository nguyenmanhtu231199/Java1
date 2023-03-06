package Buoi3;

public class HCN {
    double chieuDai;
    double chieuRong;
    public HCN(){

    }
    public HCN(double chieuDai, double chieuRong){
       this.chieuDai =chieuDai;
       this.chieuRong = chieuRong;
    }
    public double tinhChuVi(){
        return  (chieuDai + chieuRong)*2;

    }
    public double tinhS(){
        return chieuRong * chieuDai;
    }
    // alt insert chon toString

    @Override
    public String toString() {
        return "HCN{" +
                "chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
