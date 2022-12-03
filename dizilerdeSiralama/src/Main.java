import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int arrayElement;
        System.out.print("Dizinin boyutunu giriniz  :");
        int arrayDimension = inp.nextInt();
        int[] array = new int[arrayDimension];


        for(int i=0; i< array.length; i++){
            System.out.print( (i +1) + ". elemanı  :");
            arrayElement = inp.nextInt();
            array[i]=arrayElement;


        }
        System.out.println("Sıralama  :" + Arrays.toString(array));




    }
}