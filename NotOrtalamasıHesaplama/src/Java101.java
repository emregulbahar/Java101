import java.util.Scanner;

public class Java101 {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp= new Scanner(System.in);

        System.out.print("Matemtik notunuzu giriniz  :");
        mat= inp.nextInt();

        System.out.print("Fizik notunuzu giriniz  :");
        fizik= inp.nextInt();

        System.out.print("Kimya notunuzu giriniz  :");
        kimya= inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz  :");
        turkce= inp.nextInt();

        System.out.print("Tarih notunuzu giriniz  :");
        tarih=inp.nextInt();

        System.out.print("Müzik notunuzu giriniz  :");
        muzik=inp.nextInt();

        int toplam =mat+fizik+kimya+turkce+tarih+muzik;
        double ortalama=(toplam/6);

        System.out.println("Ortalamanız  :" +ortalama);

        boolean sonuc=(ortalama>=60);
        String okuluGecme =(sonuc) ? "Sınıfı geçtiniz" : "Sınıftı kaldınız";
        System.out.print(okuluGecme);











    }
}
