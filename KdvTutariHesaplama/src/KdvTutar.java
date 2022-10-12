import java.util.Scanner;

public class KdvTutar {

    public static void main(String[] args) {
        double tutar,kdvTutar,kdvliTutar;
        Scanner inp =new Scanner(System.in);
        System.out.print("Fiyatı giriniz :");
        tutar= inp.nextDouble();
        boolean yuksekTutar=(tutar>1000);
        boolean dusukTutar=(tutar<=1000);
        double kdvOrani=(yuksekTutar)?0.8:0.18;
        kdvTutar=tutar*kdvOrani;
        System.out.println("Kdv tutarınız  :" +kdvTutar);
        kdvliTutar=kdvTutar+tutar;
        System.out.println("Kdvli tutarınız :"+kdvliTutar);


    }
}