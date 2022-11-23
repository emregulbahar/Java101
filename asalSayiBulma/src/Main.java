

public class Main {
    static boolean prime(int num , int i){
        if(i == num){
            System.out.println(num + " Asal sayıdır");
            return true;
        } else if (num % i == 0) {
            System.out.println(num + " Asal sayı değildir");
            return false;
        }
        return prime(num ,i+1);
    }

    public static void main(String[] args) {
        prime(15,2);



    }
}