public class Main {

    static boolean pali(int number){
        int temp = number,reverseNumber =0,lastNumber;

        while(temp !=0){
            lastNumber = temp %10;
            reverseNumber = (reverseNumber *10) + lastNumber;
            temp /= 10;
        }
        if(reverseNumber==number){
            System.out.println("Sayınız bir PALİNDROM sayıdır : " + reverseNumber);
        }else {
            System.out.println("Sayınız bir PALİNDROM sayı değildir : " + reverseNumber);
        }
        return true;

    }


    public static void main(String[] args) {
        pali(247);


    }
}