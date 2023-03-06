package Buoi3;

public class Ex148 {
    public static boolean soNguyenTo(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static int SNTCuoiCung(int[] arr) {
        for (int i=arr.length-1;i>=0;i--) {
            if (soNguyenTo(arr[i]) == true) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 8, 4, -5, 9, 11, 13,23, 30};
        int[] arr2 = {1, 4, 0, -4, 8, 10, 20};
        System.out.println(SNTCuoiCung(arr1));
        System.out.println(SNTCuoiCung(arr2));
    }
}
