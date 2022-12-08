
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;
        System.out.print("Lütfen matrisinizin sütun sayısını giriniz : ");
        int a= inp.nextInt();
        System.out.print("Lütfen matrisinizin satır sayısını giriniz : ");
        int b= inp.nextInt();

        int[][] array=new int[a][b];
        int[][] transpozArray=new int[b][a];
        System.out.println("matris sayılarınızı giriniz : ");
        for(int i=0;i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(i + " . sütun " + j + " . satır :");
                number = inp.nextInt();
                array[i][j] = number;

            }

        }
        for(int i=0;i< array.length; i++){
            for(int j=0; j < array[i].length; j++){
                transpozArray[j][i]=array[i][j];
                System.out.print(transpozArray[j][i] +" ");
            }
            System.out.println();

        }






























    }
}