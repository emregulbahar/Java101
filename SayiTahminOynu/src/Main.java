import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = (int) (Math.random() *100);

        Scanner inp = new Scanner(System.in);
        int right=0;
        int select;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while(right < 5){
            System.out.print("Lütfen tahmin sayınızı giriniz  :");
            select= inp.nextInt();
            if(select < 0 || select > 99){
                if(isWrong){
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız Kalan hakklarınız :" + (5 - right));

                }else{
                    isWrong =true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşecektir");
                }
                continue;
            }
            if(select == number){
                System.out.println("Tebrikler sayıyı doğru tahmin ettiniz !");
                isWin = true;
                break;
            }else{
                if(select > number){
                    System.out.println("Girdiğiniz sayı tahmin etmeye calıştığınız sayıdan büyüktür");
                }else{
                    System.out.println("Girdiğiniz sayı tahmin etmeye calıştığınız sayıdan küçüktür");
                }
                wrong[right++]= select;
                System.out.println("Kalan hakkınız : " + (5-right));
            }

        }
        if(!isWin){
            System.out.println("Kaybettiniz ! ");
            if(!isWrong){
                System.out.println("Tahminleriniz  : " + Arrays.toString(wrong));
            }
        }

    }
}