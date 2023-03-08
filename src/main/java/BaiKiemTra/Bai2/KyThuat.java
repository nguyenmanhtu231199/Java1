package BaiKiemTra.Bai2;

public class KyThuat extends NhanVien {
    private String chuyenNghanh;

    public KyThuat(String id, String name) {
        super(id, name);
    }

    public KyThuat(String id, String name, String born, String address, String chuyenNghanh) {
        super(id, name, born, address);
        this.chuyenNghanh = chuyenNghanh;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    @Override
    public String moTaCongViec() {
        return "Hỗ trợ kỹ thuật";
    }

    @Override
    public String toString() {
        return "KyThuat[" + super.toString() +
                ", chuyenNghanh='" + chuyenNghanh + '\'' +
                ']';
    }
}
