package Buoi3;

public class Ex145 {
    public static boolean soHoanThien(int n) {
        int tong=0;
        for (int i=1 ; i<n; i++)
            if(n%i==0)
                tong = tong + i;
        if (tong == n)
            return true;
        return false;
    }
    public static int SHTDauTien(int[] arr) {
        for(int i=0; i< arr.length; i++) {
            if (soHoanThien(arr[i])) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = { 9, 8, 4, -5, 9, 11, 13, 30};
        int[] arr2 = {28, 4, 0, -4, 8, 10, 20};
        System.out.println(SHTDauTien(arr1));
        System.out.println(SHTDauTien(arr2));
    }
}
