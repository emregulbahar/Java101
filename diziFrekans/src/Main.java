import java.util.Arrays;

public class Main {
    static boolean returnArray(int [] arr,int value,int c){

        for(int i =0; i < c; i++){
            if(value == arr[i]){
                return false;
            }
        }
        return true;
    }

    static  int arrayCount(int[] arr,int value){
        int count=0;
        for(int i: arr){
            if(i == value){
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int [] array = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(array));
        System.out.println("Terkrar Sayıları");
        for(int i=0; i< array.length; i++){
            if(returnArray(array,array[i],i)){
                System.out.println(array[i] + "  Sayıyısı  " + arrayCount(array,array[i]) + "  kez tekrar edildi  ");
            }
        }



            }


        }


