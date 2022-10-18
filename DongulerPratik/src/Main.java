import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k;
        int top=0;
        int sayac=0;

        System.out.print("Lütfen bir sayı girniz  :");
        k= inp.nextInt();
        for(int i =1;i<=k; i++){

            if(i%12==0){
                top+=i;
                sayac++;
            }

        }
        System.out.println(top/sayac);





    }


}















