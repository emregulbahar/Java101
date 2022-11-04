import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen mükemmel sayı olup olmadınğını bulmak istediğiniz sayıyı giriniz  :");
        int number= inp.nextInt();
        int muk=0;

        for(int i=1;i<number;i++){
            if(number % i==0){

                muk+=i;

            }

        }

        if(muk==number){
            System.out.println(muk+"  Mükemmel bir sayıdır");
        }else{
            System.out.println(number+" Mükemmmel bir sayı değildir");
        }
    }
}