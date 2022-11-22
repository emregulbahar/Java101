import java.util.Scanner;

public class Main {

    static int power(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Taban değeri giriniz = ");
        int base= inp.nextInt();
        System.out.print("Üs değeri giriniz =");
        int exponent= inp.nextInt();

        int result=1;
        if(exponent ==0){
            return 1;
        } else if (base==0) {
            return 0;

        }

        for(int i=1;i<=exponent;i++){
            result *= base;
        }

        return result;



    }
    public static void main(String[] args) {
        System.out.println("Sonuç : " + power());
    }
}