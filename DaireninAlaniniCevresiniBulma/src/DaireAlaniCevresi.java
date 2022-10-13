import java.util.Scanner;

public class DaireAlaniCevresi {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int r;
        double pi=3.14;
        int merkezAci;

        System.out.print("Lütfen yarıçapı giriniz :");
        r= inp.nextInt();
        System.out.print("Lütfen dairenin merkez açısını giriniz :");
        merkezAci= inp.nextInt();
        double cevre=pi*r*r;
        double alan=((pi*(r*r)*merkezAci)/360);
        System.out.println("Dairenin alanı :"+alan);
        System.out.println("Dairenin çevresi :" +cevre);

    }
}