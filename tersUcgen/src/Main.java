import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int size= inp.nextInt();

       for(int i=size;i>0;i--){
           for(int k=size-i;k>0;k--){
               System.out.print(" ");
           }
           for(int j=(2*i)-1;j>0;j--){
               System.out.print("*");
           }
           System.out.println(" ");
       }

    }
}