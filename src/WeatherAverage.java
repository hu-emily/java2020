//10-27-20
import java.util.*;
public class WeatherAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many days' temperatures? ");
        int days = input.nextInt();

        int temp[] = new int[days];
        int sum = 0;
        for(int i = 0; i < temp.length; i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temp[i] = input.nextInt();
//            System.out.print(" "+temp[i]+" ,");
            sum += temp[i];
        }
        System.out.println();
        double average = (double)sum/temp.length;
        System.out.print("Average temp = ");
        System.out.printf("%.2f",average);

        int count = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] > average){
                count++;
            }
        }
        System.out.println();
        System.out.println(count+" days were above average.");
    }
}
