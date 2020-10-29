//10-27-20 hw
import sun.awt.windows.WPrinterJob;

import java.util.Scanner;
public class TempAverage30Days {
    public static void main(String[] args) {
        //create scanner and array
        Scanner input = new Scanner(System.in);
        int days = 5;
        int temp[] = new int[days];

        //getting inputs of temps and adding them onto variable 'sum'
        int sum = 0;
        for(int i = 0; i < temp.length; i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temp[i] = input.nextInt();
            sum += temp[i];
        }
        System.out.println();

        //calculating average
        double average = (double)sum/temp.length;
        System.out.print("The average temp is approximately ");
        System.out.printf("%.2f",average);

        //how many days below the average
        int count = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] < average){
                count++;
            }
        }
        System.out.println();
        System.out.println(count+" days were below average");

        //ask user if they want to add new temp
        System.out.println();
        System.out.print("Would you like to add a new temp? ");
        String repeatResponse = input.next();
        repeatResponse = repeatResponse.toLowerCase();
        if(repeatResponse.contains("y")){
            //transfer values into smaller array without first element
            int size = temp.length-1;
            int smallerTemp[] = new int[size];
            System.arraycopy(temp,1,smallerTemp,0,size);

            //new array to add new temp
            int newTemp[] = new int[days];
            for(int i = 0; i < days-1; i++){
                newTemp[i] = smallerTemp[i];
            }
            System.out.print("Day "+(days)+"'s high temp: ");
            newTemp[days-1] = input.nextInt();

            newCalculations(temp,newTemp,days,sum,input);
        }
    }
    public static void newCalculations(int temp[],int newTemp[],int days,int sum,Scanner input){
        //adding new temp onto sum
        sum -= temp[0];
        sum += newTemp[days-1];

        //calculating average
        double average = (double)sum/newTemp.length;
        System.out.print("The new average temp is approximately ");
        System.out.printf("%.2f",average);

        //how many days below the average
        int count = 0;
        for(int i = 0; i < newTemp.length; i++){
            if(newTemp[i] < average){
                count++;
            }
        }
        System.out.println();
        System.out.println(count+" days were below average");
    }
}