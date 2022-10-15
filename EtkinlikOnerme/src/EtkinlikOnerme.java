import java.sql.SQLOutput;
import java.util.Scanner;

public class EtkinlikOnerme {
    public static void main(String[] args) {
        int heat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz  :");
        heat= inp.nextInt();
        if (heat<5){
            System.out.println("Kayağa gidebilirsiniz ");
        } else if ((heat>=5)&&(heat<=10)) {
            System.out.println("Sinemaya gidebilirsiniz");

        } else if ((heat>10)&&(heat<15)) {
            System.out.println("Sinemaya ve Pikniğe gidebilirsiniz");

        } else if ((heat>=15)&&(heat<=25)) {
            System.out.println("Pikniğe gidebilirsiniz");

        }else{
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    }
}