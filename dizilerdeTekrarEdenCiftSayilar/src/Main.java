import java.util.Arrays;

public class Main {
    static boolean returnArr(int[] arr, int value){
        for(int i : arr){
            if(i == value || value % 3 ==0 ){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] array={2,2,9,2,10,9,10,8,33,8,33};
        int [] duplicate =new int[array.length];
        int startIndex=0;

        for(int i=0; i< array.length; i++){
            for (int j=0;j< array.length; j++){
                if((i != j) && (array[i] == array[j])){
                    if((!returnArr(duplicate,array[i]))) {
                        duplicate[startIndex++] = array[i];
                    }
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(duplicate));

    }

}