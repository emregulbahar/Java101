import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double a,b;
        int c;

        Scanner inp=new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz  :");
        a= inp.nextDouble();
        System.out.print("İkinçi sayıyı giriniz  :");
        b= inp.nextDouble();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçim  :");
        c= inp.nextInt();

        switch (c){
            case 1:
            System.out.println("Toplama sonucu :"+(a+b));
                break;
            case 2:
                System.out.println("Çıkarma sonucu  :"+(a-b));
                break;
            case 3:
                System.out.println("Çarpma sonucu  :"+(a*b));
                break;
            case 4:
                System.out.println("Bölme sonucu  :"+(a/b));
            default:
                System.out.println("Değerleri girmediniz veya yapmak istediğiniz seçimi yapmadınız");
        }
        System.out.println("Program bitti");





    }
}
