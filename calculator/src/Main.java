import java.util.Scanner;

public class Main {

    static void plus(){
        Scanner inp =new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz =");
        int counter= inp.nextInt();
        int num,result=0;
        for(int i=1;i<=counter;i++){
            System.out.println(i +". sayı =");
            num= inp.nextInt();
            if(num==0){
                break;
            }
            result +=num;
        }


        System.out.println("Sonuç = " + result);

    }

    static void minus(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireçeksiniz =");
        int counter= inp.nextInt();
        int num,result=0;
        for(int i=1;i <= counter; i++){
            System.out.print(i +". sayı =");
            num= inp.nextInt();
            if(i ==1){
                result += num;
                continue;
            }
            result -=num;
        }
        System.out.println("Sonuç = " +result);
    }


    static void multiplication(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz =");
        int counter= inp.nextInt();
        int num,result=1;
        for(int i=1;i<=counter;i++){
            System.out.print(i +". sayı =");
            num= inp.nextInt();
            if(num == 0){
                result =0;

            }
            result *= num;
        }
        System.out.println("Sonuç = " + result);
    }

    static void division(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Kaç adet sayı gireçeksiniz =");
        int counter= inp.nextInt();
        double num,result=0.0;
        for(int i=1;i<=counter;i++){
            System.out.print(i +". sayı =");
            num = inp.nextInt();
            if( i != 1 && num ==0){
                System.out.println("0 bölenini giremezdiniz");
                continue;
            }
            if(i==1){
                result = num;
                continue;

            }
            result /= num;
        }
        System.out.println("Sonuç = "+ result);
    }

    static void power(){
        Scanner inp=new Scanner(System.in);
        int base,exponent,result=1;
        System.out.print("Taban değeri giriniz = ");
        base= inp.nextInt();
        System.out.print("Üs değerini giriniz = ");
        exponent= inp.nextInt();

        for(int i=1;i<=exponent;i++){
            result *=base;
        }
        System.out.println("Sonuç = " + result);
    }

    static void factorial(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayıyı giriniz =");
        int num= inp.nextInt();
        int result=1;

        for(int i=1;i<=num;i++){
            result *=i;
        }
        System.out.println("Sonuç = " + result);
    }

    static void mod(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen modu alıncak sayıyı girniz = ");
        int num= inp.nextInt();
        System.out.print("Lütfen mod almak istediğniz sayıyı giriniz = ");
        int modNum= inp.nextInt();
        int result=0;
        result = num % modNum;
        System.out.println("Sonuç = " +result);
    }

    static void rectangle(){
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen uzun kenarı girniz = ");
        int longEdge= inp.nextInt();
        System.out.print("Lütfen kısa kenarı giriniz = ");
        int shortEdge= inp.nextInt();

        int area=longEdge*shortEdge;
        System.out.println("Dikdörgenin ALANI = "+area);

        int environment=(longEdge*2) + (shortEdge*2);
        System.out.println("Diktörtgenin ÇEVRESİ = " + environment);
    }





    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int select;
        String menu = "1-Toplam işlemi\n"
                +"2-Çıkarma işlemi\n"
                +"3-Çarpma işlemi\n"
                +"4-Bölme işlemi\n"
                +"5-Üslü sayı hesaplama\n"
                +"6-Faktöriyel hesaplama\n"
                +"7-Mod alma\n"
                +"8-Dikdörtgen çevre ve alan hesabı\n"
                +"0-Çıkış yap";


        do{
            System.out.println(menu);
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz :");
             select= inp.nextInt();
             switch (select){
                 case 1:
                     plus();
                     break;
                 case 2:
                     minus();
                     break;
                 case 3:
                     multiplication();
                     break;
                 case 4:
                     division();
                     break;
                 case 5:
                     power();
                     break;
                 case 6:
                     factorial();
                     break;
                 case 7:
                     mod();
                     break;
                 case 8:
                     rectangle();
                     break;
                 case 0:
                     break;
                 default:
                     System.out.println("Geçersiz seçim yaptınız , tekrar deneyiniz");
             }


        }while(select!=0);
    }
}