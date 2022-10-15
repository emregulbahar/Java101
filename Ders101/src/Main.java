import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen ilk sayıyı giriniz  :");
        double a= inp.nextDouble();

        System.out.print("Lütfen ikinçi sayıyı giriniz  :");
        double b= inp.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Bölme\n4-Çarpma");
        System.out.println("Seçiminizi yapınız  :");
        int c= inp.nextInt();

        if(c==1){
            System.out.println("Toplam sonucu : "+ (a+b));

        } else if (c==2) {
            System.out.println("Çıkarma sonucu  :"+(a-b));

        } else if (c==3) {
            System.out.println("Bölme sonucu  :"+(a/b));

        } else if (c==4) {
            System.out.println("Çarpma sonucu  :"+(a*b));

        }else{
            System.out.println("Seçim yapmadınız");
        }
        System.out.println("Program bitti");


    }
}