import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        double kilo ,boy,indeks;

        System.out.print("Lütfen kilonuzu kg cinsinden giriniz :");
        kilo= inp.nextDouble();
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        boy= inp.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz :" +indeks);
    }
}
