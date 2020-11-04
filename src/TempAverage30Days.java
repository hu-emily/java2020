//10-27-20 hw

//11-2-20 class
/*create a menu
   *************************************
   *   Temp Average Menu
   *
   *   1. input 30 days temps
   *   2. calculate average
   *   3. how many days above average
   *   4. how many days below average
   *   5. input a new date
   *   6. exit
   * ***********************************

method for the menu
method to input temps
method to calculate average
method to find above average
method to find below average
method to input new temp
 */

import java.util.Scanner;
public class TempAverage30Days {
    public static Scanner input = new Scanner(System.in);
    public static int days;
    public static int temp[] = new int[30];
    public static double average = 0;

    public static void main(String[] args) {
        System.out.print("Please enter the amount of days you'd like to input: ");
        days = input.nextInt();
        menu();
    }
    public static void menu(){
        System.out.println("****************************************");
        System.out.println("*           Temp Average Menu          *");
        System.out.println("*    1. input 30 days of temps         *");
        System.out.println("*    2. calculate average              *");
        System.out.println("*    3. amount of days above average   *");
        System.out.println("*    4. amount of days below average   *");
        System.out.println("*    5. input a new day                *");
        System.out.println("*    6. exit                           *");
        System.out.println("****************************************");
        int answer = input.nextInt();
        switch(answer){
            case 1:
                inputTemps(input);
                break;
            case 2:
                calculateAverage();
                System.out.print("The average temp is approximately ");
                System.out.printf("%.2f",average);
                System.out.println();
                menu();
                break;
            case 3:
                aboveAverage();
                break;
            case 4:
                belowAverage();
                break;
            case 5:
                newInput(input);
                break;
            case 6:
                thankYou();
        }
//        do{
//        }
//        while(answer < 6);
    }
    public static void inputTemps(Scanner input){
        int sum = 0;
        for(int i = 0; i < days; i++){
            System.out.print("Day "+(i+1)+"'s high temp: ");
            temp[i] = input.nextInt();
        }
        System.out.println();
        menu();
    }
    public static void calculateAverage(){
        int sum = 0;
        for(int i = 0; i < days; i++){
            sum += temp[i];
        }
        average = (double)sum/days;
    }
    public static void aboveAverage(){
        calculateAverage();
        int count = 0;
        for(int i = 0; i < days; i++){
            if(temp[i] > average){
                count++;
            }
        }
        System.out.println(count+" days were above average");
        menu();
    }
    public static void belowAverage(){
        calculateAverage();
        int count = 0;
        for(int i = 0; i < days; i++){
            if(temp[i] < average){
                count++;
            }
        }
        System.out.println(count+" days were below average");
        menu();
    }
    public static void newInput(Scanner input){
        for(int i = 0; i<temp.length-1; i++){
            temp[i] = temp[i+1];
        }
        System.out.print("Day "+(days)+"'s high temp: ");
        temp[temp.length-1] = input.nextInt();
        menu();
    }
    public static void thankYou(){
        System.out.println("Thank you for participating!");
    }
}