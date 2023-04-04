package ss3_array.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};
        int newArray=array1.length+ array2.length;
        int[]result= new int[newArray];
        int count = 0 ;
        for(int element : array1){
            result[count]= element;
            count++;
        }
        for(int element : array2){
            result[count]= element;
            count++;
        }
        System.out.println(Arrays.toString(result));
    }
}
