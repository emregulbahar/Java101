import java.util.Scanner;

public class AlanHesaplayanProgram {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double a,b,c;
        System.out.print("Birinçi kenar uzunluğunu giriniz :");
        a= inp.nextDouble();
        System.out.print("İkinçi kenar uzunluğunu giriniz :");
        b= inp.nextDouble();
        System.out.print("Üçünçü kenar uzunluğunu giriniz :");
        c= inp.nextDouble();
        double cevre,cevre2;
        cevre=((a+b+c)/2);
        cevre2=cevre*2;
        System.out.println("Çevre :"+cevre2);
        double alan;
        alan=Math.sqrt(cevre*((cevre-a)*(cevre-b)*(cevre-c)));
        System.out.println("Alan hesaplamsı :"+alan);

    }
}