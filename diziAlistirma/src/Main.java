import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);


        int[] array = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Lütfen bir sayı giriniz :");
        int number = inp.nextInt();

        for(int i=0;i< array.length;i++){
            if(number > array[i] && array[i] > array[i-1]){
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + array[i]);
            }
        }

         for(int i=0; i< array.length; i++) {
            if(number < array[i] && array[i]< array[i+1]){
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + array[i]);
            }

            }
        }
    }
