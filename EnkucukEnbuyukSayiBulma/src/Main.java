
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int entNumber,number,max=1,min=1;
        System.out.print("Kaç sayı gireceksiniz :");
        entNumber= inp.nextInt();

            for(int i=1;i<=entNumber;i++){
                System.out.print(i+". sayıyı giriniz :");
                    number= inp.nextInt();
                    if(entNumber==1){
                        number=max;
                        number=min;
                    }
                    if(number>max){
                        max=number;

                    }
                    if(number<min){
                        min=number;
                    }
            }
            System.out.println("En büyük sayı :"+max);
            System.out.println("En küçük sayı : "+min);












        }





    }



