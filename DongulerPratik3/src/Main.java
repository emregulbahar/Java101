import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int k;
        System.out.print("Sayıyı giriniz  :");
        k= inp.nextInt();
        System.out.println("Dördün kuvvetleri");
        for (int i=0;i<=k;){
            i+=4;
            System.out.println(i);

        }
        System.out.println("Beşin kuvvetleri");
        for(int i=0;i<=k;){
            i+=5;
            System.out.println(i);
        }
    }
}