import java.util.Scanner;

public class Main {
 static void pattern(int num){
     System.out.println(num +" ");
     if(num>0){
         pattern(num-5);
         System.out.println(num +" ");
     }

 }

    public static void main(String[] args) {
     Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz  :");
        int num= inp.nextInt();
        pattern(num);
        inp.close();

    }
}