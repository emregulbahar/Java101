import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int s1,s2;
        int total=1;

        System.out.print("Lütfen üssü bulunacak sayıyı giriniz  :");
            s1= inp.nextInt();

        System.out.print("Lütfen bulmak istediğiniz üst sayısını giriniz  :");
            s2= inp.nextInt();

            for (int i=1;i<=s2;i++){
                total*=s1;
            }
            System.out.println(total);



    }
}