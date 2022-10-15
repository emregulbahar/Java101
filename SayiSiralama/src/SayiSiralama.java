import java.util.Scanner;

public class SayiSiralama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner inp=new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz  :");
        a= inp.nextInt();

        System.out.print("İkinci sayıyı giriniz  :");
        b= inp.nextInt();

        System.out.print("Üçünçü sayıyı giriniz  :");
        c=inp.nextInt();

        if((a<b)&&(a<c)){
            if(c>b){
                System.out.println(a+"<"+b+"<"+c);

                }else{
                System.out.println(a+"<"+c+"<"+b);
            }

            }else if ((b<a)&&(b<c)){
                if (a>c){
                    System.out.println(b+"<"+c+"<"+a);
                }else{
                    System.out.println(b+"<"+a+"<"+c);
                }

        } else if ((c<a)&&(c<b)) {
            if(a>b){
                System.out.println(c+"<"+b+"<"+a);
            }else {
                System.out.println(c+"<"+a+"<"+b);
            }

        }

    }
    }
