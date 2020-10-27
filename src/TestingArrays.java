//10-27-20
import java.util.*;
public class TestingArrays {
    public static void main(String[] args) {
        //type: int, float, double, long, char, etc.
        //   is the type of data you are putting in your array
        int num = 20;
        int[] numbers = new int[num/2];
        int sum = 0;
        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*2;
            System.out.print(" "+numbers[i]+" ,");
            sum += numbers[i]; //sum = sum + numbers[i]
        }
        System.out.println();
        double average = sum/numbers.length;
        System.out.println(numbers[numbers.length-1]);
        int count = 0;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i] > average){
                count++;
            }
        }
        System.out.println(count);
    }
}
