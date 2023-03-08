package Buoi5.Ex1;

public abstract class HinhHoc {
    private String color= "Trắng";
    public HinhHoc(){

    }

    public HinhHoc(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double tinhChuvi();
    public abstract double tinhDientich();

    @Override
    public String toString() {
        return "HinhHoc{" +
                "color='" + color + '\'' +
                '}';
    }
}
