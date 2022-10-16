import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int dogumYili;
        int burc;
        System.out.print("Doğum yılınızı giriniz  :");
        dogumYili= inp.nextInt();
        burc=dogumYili%12;
        switch (burc){
            case 0:
                System.out.println("Burcunuz : Maymun ");
            case 1:
                System.out.println("Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Burcunuz : köpek");
                break;
            case 3:
                System.out.println("Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Burcunuz : Tavşan");
                break;
            case 8:
                System.out.println("Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Burcunuz : Yılan");
                break;
            case 10:
                System.out.println("Burcunuz : At");
                break;
            case 11:
                System.out.println("Burcunuz : Koyun");
                break;
        }




    }
}