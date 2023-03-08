package BaiKiemTra.Bai3;

public class VanBan {
    private String data;

    public VanBan(String data) {
        this.data = data;
    }

    public VanBan() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String vietHoaToanBo(){
        String tmp =  data.toUpperCase();
        return tmp;
    }

    public String vietThuongToanBo(){
        String tmp = data.toLowerCase();
        return tmp;
    }

    public String chuanHoaVanBan(){
        String tmp = data.trim().replaceAll("\\s+"," ");
        return tmp;
    }

    public long demSoTu(){
        StringBuffer buffer = new StringBuffer(data);
        long size = 0;
        for(int i = 0; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                size ++;
            }
        }
        return size;
    }

    public String vietHoaMoiTuDauTien(){
        data = vietThuongToanBo();
        StringBuffer buffer = new StringBuffer(data);
        buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
        for (int i = 1; i < buffer.length() - 1; i++){
            if(buffer.charAt(i) == ' ' && buffer.charAt(i+1) != ' '){
                buffer.setCharAt(i+1, Character.toUpperCase(buffer.charAt(i+1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return data;
    }
}
