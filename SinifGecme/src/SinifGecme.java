import java.sql.SQLOutput;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fiz,kim,turk,muzik;
        double ortalama =0;
        int toplamDers=0;
        double ortlamaHesabi;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz :");
            mat= inp.nextInt();
            if((mat<=100)&&(mat>=0)){
            toplamDers+=1;
            ortalama+=mat;
            } else {
            System.out.println("Notunuz hesaplanmayacaktır");
            }
        System.out.print("Fizik notunuzu giriniz :");
            fiz= inp.nextInt();
            if((fiz<=100)&&(fiz>=0)){
            toplamDers+=1;
            ortalama+=fiz;
            }else{
            System.out.println("Notunuz hesaplanmayacaktır");
            }
        System.out.print("Kimya notunuzu giriniz :");
            kim=inp.nextInt();
            if((kim<=100)&&(kim>=0)){
            toplamDers+=1;
            ortalama+=kim;
            }else{
            System.out.println("Notunuz hesaplanmayacaktır");
            }
        System.out.print("Türkçe notunuzu giriniz  :");
            turk= inp.nextInt();
            if ((turk<=100)&&(turk>=0)) {
            toplamDers+=1;
            ortalama+=turk;
            }else{
                System.out.println("Notunuz hesaplanmayacaktır");
            }
        System.out.print("Müzik notunuzu giriniz :");
            muzik= inp.nextInt();
            if((muzik<=100)&&(muzik>=0)){
                toplamDers+=1;
                ortalama+=muzik;

            }else{
                System.out.println("Notunuz hesaplanmayacaktır");
            }

            ortlamaHesabi=ortalama/toplamDers;
            if (ortlamaHesabi<=55){
                System.out.println("Sınıfta kaldınız seneye görüşürüz !");

            }else{
                System.out.println("Sınıfı geçtiniz tebrikler !");
            }
        System.out.println("Ortalamanız : "+ortlamaHesabi);
        }




    }
