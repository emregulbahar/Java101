import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5;
        double a,e,d,m,p,tutar;

        System.out.print("Armut kaç kilo ? :");
        a= inp.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        e= inp.nextDouble();
        System.out.print("Domates kaç kilo ? :");
        d= inp.nextDouble();
        System.out.print("Muz kaç kilo ? :");
        m= inp.nextDouble();
        System.out.print("Patlıcan kaç kilo ? :");
        p= inp.nextDouble();

        tutar=(a*armut)+(e*elma)+(d*domates)+(m*muz)+(p*patlican);
        System.out.println("Alışveriş tutarı :"+tutar);


    }

}