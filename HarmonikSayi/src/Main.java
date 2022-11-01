import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen harmonik serisini bulmak istediğiniz sayıyı giriniz :");
        int number= inp.nextInt();
        double result=0;
        for(double i =1; i<=number; i++){
            result +=(1/i);
        }
        System.out.println(result);


    }
}