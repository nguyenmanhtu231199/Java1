package BaiKiemTra.Bai2;

public abstract class NhanVien {
    private String id;
    private String name;
    private String born;

    private String address;

    public NhanVien(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public NhanVien(String id, String name, String born, String address) {
        this.id = id;
        this.name = name;
        this.born = born;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBorn() {
        return born;
    }

    public void setBorn(String born) {
        this.born = born;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "NhanVien[" +
                "maNhanVien='" + id + '\'' +
                ", hoTen='" + name + '\'' +
                ", namSinh='" + born + '\'' +
                ", address='" + address + '\'' +
                ']';
    }

    public abstract String moTaCongViec();
}
