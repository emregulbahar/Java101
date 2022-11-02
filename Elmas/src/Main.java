import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz");
        int size= inp.nextInt();

        int odd = 1, nos = size/2; // nos =number of spaces
        for (int i = 1; i <= size; i++) { // for number of rows i.e n rows
            for (int k = nos; k >= 1; k--) { // for number of spaces i.e
                // 3,2,1,0,1,2,3 and so on
                System.out.print(" ");
            }
            for (int j = 1; j <= odd; j++) { // for number of columns i.e
                // 1,3,5,7,5,3,1
                System.out.print("*");
            }
            System.out.println();
            if (i < size/2) {
                odd += 2; // columns increasing till center row
                nos -= 1; // spaces decreasing till center row
            } else {
                odd -= 2; // columns decreasing
                nos += 1; // spaces increasing

            }



        }

    }
}

