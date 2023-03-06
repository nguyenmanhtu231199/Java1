package Buoi3;

public class EX143 {
    public static int soChan(int arr[]){
        int soChan= arr[0];
        for (int i= 1; i<arr.length; i++){
            if(arr[i]%2 == 0){
                soChan = arr[i];
                break;
            }
            return -1;
        }
        return soChan;
    }
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, -5, 7, 9 };
        int[] arr2 = {1, 7, 5, 1, 1, 9};
        System.out.println(soChan(arr1));
        System.out.println(soChan(arr2));
    }
}
