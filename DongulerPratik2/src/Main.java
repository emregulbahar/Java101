import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k = 0;
        int top = 0;
        do {
            System.out.print("Lütfen sayıyı giriniz :");
            k = inp.nextInt();

        } while (k % 2 == 1);

        for (int i = 0; i <= k; i++) {
            if (i % 4 == 0) {
                top += i;

            }


        }
        System.out.println(top);
    }
}