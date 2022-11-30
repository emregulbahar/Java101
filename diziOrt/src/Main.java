public class Main {
    public static void main(String[] args) {
        double harmResult=0;
        int [] arry={1,2,3,4,5};
        double result=0;


        for(double i=1; i<= arry.length;i++){
            harmResult += (1/i);
        }

        result= arry.length /harmResult;

        System.out.println("Dizinin harmonik Ortalaması :" + result);






    }
}