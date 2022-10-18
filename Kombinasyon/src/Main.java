import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n,r,kom;

        int totaln=1,totalr=1,totalnr=1;

        System.out.print("Lütfen kümenizin eleman sayını giriniz  :");
        n= inp.nextInt();
        System.out.print("Lütfen oluşturmak istediğiniz gurupların elaman sayısını giriniz :");
        r= inp.nextInt();

        for(int i=1;i<=n;i++) {
            totaln = totaln * i;
        }
        for (int i=1; i<=r; i++){
            totalr=totalr*i;

        }
        for(int i=1;i<=(n-r);i++){
            totalnr=totalnr*i;
        }
        kom=totaln/(totalr*totalnr);
        System.out.println(n+"-"+r+" kombinasyonus "+kom);


    }
}