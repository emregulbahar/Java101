import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Ulaşmak istediğiniz fibonacci serisini yazınız :");
        int number= inp.nextInt();
        int n1=0,n2=1,n3;

        for(int i=2;i<=number;i++){
            n3=n1+n2;
            System.out.println(n1+"+"+n2+"="+n3);
            n1=n2;
            n2=n3;
            System.out.println();
        }

    }


}

