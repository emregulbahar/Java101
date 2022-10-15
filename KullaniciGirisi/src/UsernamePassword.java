import java.sql.SQLOutput;
import java.util.Scanner;

public class UsernamePassword {
    public static void main(String[] args) {
        String username, password, newPassword;
        int a;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen kullanıcı adınızı giriniz  :");
        username = inp.nextLine();

        System.out.print("Lütfen şifrenizi giriniz  :");
        password = inp.nextLine();

        if ( username.equals("yavuz")&&password.equals("candır")) {
            System.out.println("Giriş başarılı !");

        } else if(!password.equals("candır")){
            System.out.println("Şifrenizi yanlış girdiniz");
            System.out.println("Şifrenizi değiştirmek istermisiniz\n1-İstiyorum\n2-İstemiyorum");
            System.out.print("Seçim  :");
            a = inp.nextInt();
                if(a==1){
                    System.out.print("Yeni şifrenizi giriniz  :");
                    newPassword= inp.next();
                        if(newPassword.equals("candır")){
                            System.out.println("Yeni şifre eski şifreyle aynı olamaz");
                        } else{
                            System.out.println("Şifreniz başarıyla oluşturuldu");
                            System.out.println("Yeniden giriş yapınız");
                        }
                } else if (a==2) {
                    System.out.println("Oturum sonlandırıldı");

                }

        }
        System.out.println("Kullanıcı adı yanlış");
        System.out.println("Kullanıcı adını yeniden giriniz");


            }


        }

































