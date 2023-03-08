package BaiKiemTra.Bai3;

public class Main {
    public static void main(String[] args) {
        VanBan v1 = new VanBan();
        v1.setData("   Welcome   to   advanced  java 1 ");
        System.out.println(v1.demSoTu());
        v1.setData(v1.chuanHoaVanBan());
        System.out.println(v1);
        v1.setData(v1.vietThuongToanBo());
        System.out.println(v1);
        v1.setData(v1.vietHoaToanBo());
        System.out.println(v1);
        v1.setData(v1.vietHoaMoiTuDauTien());
        System.out.println(v1);
    }
}
