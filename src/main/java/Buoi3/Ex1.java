package Buoi3;

public class Ex1 {
        // modifier returnType nameOfMethod (Parameter List){
        // method body
        // }
    // Đề bài: viết 1 hàm có input : chuỗi bất kì --> in ra chuỗi
        // tên hàm : inChuoiVIEThOA()
        // Danh sách tham số (input) : String s
        // Kết quả trả về: void
        // Static: Tĩnh -> Phương thức thuộc lớp
        // Nếu không có static --> phương thức thuộc đối tượng
        public static void inChuoiVietHoa(String s) {
            System.out.println(s.toUpperCase());
        }
        public static void main(String[] args) {
            inChuoiVietHoa("Hello");
            inChuoiVietHoa("Hi");
    }
}
