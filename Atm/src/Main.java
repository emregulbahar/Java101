
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int right=3;
        int select;
        int balance=1500;
        while(right>0){
            System.out.print("Lütfen kullanıcı isminizi giriniz :");
            String username= inp.nextLine();

            System.out.print("Lütfen şifrenizi giriniz :");
            String password= inp.nextLine();

            if(username.equals("patika")&&password.equals("dev123")){
                System.out.println("Merhabalar GLB bankasına HoşGeldiniz");

                do{
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz\n1-Para yatırma\n2-Para çekme\n3-Bakiye sorgulama\n4-Çıkış yap");
                    select= inp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Lütfen yatırmak istediğiniz miktarı giriniz :");
                            int enterMany= inp.nextInt();
                            balance+=enterMany;
                            break;
                        case 2:
                            System.out.print("Lütfen çekmek istediğiniz miktarı giriniz :");
                            int autMany= inp.nextInt();
                            if(autMany>balance){
                                System.out.println("Bakiye yetersiz!");

                            }else{
                                balance-=autMany;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :"+balance);


                    }
                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere!");
                break;
            }else {
                right--;
                System.out.println("Kullanıcı ismi veya şifre yanlış");
                if(right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen müşteri hizmetleri ile iletişime geçiniz");
                }else{
                    System.out.println("Kalan giriş hakkınız :"+right);
                }
            }


        }


        }

    }
