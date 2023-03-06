package Buoi3;

public class Ex144 {
    public static boolean soNguyenTo(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int SNTDauTien(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (soNguyenTo(arr[i]) == true) {
                return arr[i];
            }
        }
                return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 8, 4, -5, 9, 11, 13, 30};
        int[] arr2 = {1, 4, 0, -4, 8, 10, 20};
        System.out.println(SNTDauTien(arr1));
        System.out.println(SNTDauTien(arr2));
    }
}
