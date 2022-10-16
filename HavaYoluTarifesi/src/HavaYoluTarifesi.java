import java.util.Scanner;

public class HavaYoluTarifesi {
    public static void main(String[] args) {
        int mesafe, yas, yolculuk;
        double tutar;
        double sonTutar;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz  :");
        mesafe = inp.nextInt();
        if (mesafe > 0) {
            tutar = mesafe * 0.10;
            System.out.print("Yaşınızı giriniz  :");
            yas = inp.nextInt();
            if (yas > 0) {
                if (yas < 12) {
                    tutar -= tutar * 0.50;
                } else if ((yas >= 12) && (yas <= 24)) {
                    tutar -= tutar * 0.10;
                } else if (yas > 65) {
                    tutar -= tutar * 0.30;
                }
            }else if(yas<=0){
                System.out.println("Yanlış değer girdiniz");
            }
            System.out.println("1-Tek gidiş\n2-Gidiş dönüş");
            System.out.print("Yolculuk tipinizi seçiniz  :");
            yolculuk = inp.nextInt();
            if ((yolculuk >= 1) && (yolculuk <= 2)) {
                if (yolculuk == 1) {
                    System.out.println("Bilet fiyatı :" + tutar);
                } else if (yolculuk == 2) {
                    tutar -= tutar * 0.20;
                    sonTutar = tutar * 2;
                    System.out.println("Bilet fiyatı  :" + sonTutar);

                }

            }else if((yolculuk<1)||(yolculuk>2)){
                System.out.println("Yanlış değer girdiniz ");
            }



        }else if(mesafe<=0){
            System.out.println("Yanlış değer girdiniz");
        }

    }
    }

