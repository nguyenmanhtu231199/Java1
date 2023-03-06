package Buoi3;

public class Ex146 {
    public static boolean checkamduong(double n){

        if(n<0) return true;
        return false;
    }
    public static double amdau(double arr[]){
        double soam=-1;
        for(int i=0;i<arr.length;i++){
            if (checkamduong(arr[i])) {
                soam = arr[i];
                break;
            }
        }
        return soam;
    }
    public static void main(String[] args) {
        double[] arr1 = { 9, -8, 4, -5, 9, 11, 13, 30};
        double[] arr2 = {28, 4, 0, 4, 8, 10, 20};
        System.out.println("So am dau :" +amdau(arr1));
        System.out.println("So am dau :" +amdau(arr2));
    }
}
