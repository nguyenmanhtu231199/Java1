package Buoi3;

public class ex147 {
    public static boolean checkamduong(double n){

        if(n<0) return true;
        return false;
    }
    public static double duongcuoi(double arr[]){
        double soduong=-1;
        for(int i=arr.length-1;i>=0;i--){
            if (checkamduong(arr[i])==false) {
                soduong = arr[i];
                break;
            }
        }
        return soduong;
    }
    public static void main(String[] args) {
        double[] arr1 = { 9, -8, 4, -5, 9, 11, 13, 30};
        double[] arr2 = {28, 4, 0, 4, 8, 10, 20};
        System.out.println("So duong cuoi :" +duongcuoi(arr1));
        System.out.println("So duong cuoi :" +duongcuoi(arr2));
    }
}
