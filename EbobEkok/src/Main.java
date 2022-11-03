import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number1,number2;
        int ebob=1,ekok,i=1;
        System.out.print("Lütfen ilk sayıyı giriniz :");
        number1= inp.nextInt();
        
        System.out.print("Lütfen ikinci sayıyı giriniz :");
        number2= inp.nextInt();
        if(number1<number2) {

            while (i <= number1) {
                if (number1 % i == 0 && number2 % i == 0) {
                    ebob=i;
                }
                i++;
            }
            System.out.println("Girdiğiniz sayının EBOB'u  :"+ebob);

        }else{
            while (i<=number2){
                if(number1 % i == 0 && number2 % i == 0){

                    ebob=i;
                }
                i++;
            }
            System.out.println("Girdiğiniz sayıların EBOB'u  :" +ebob);


        }
            ekok=(number1*number2)/ebob;
                System.out.println("Girdiğiniz sayının EKOK'u "+ekok);
    }

}









