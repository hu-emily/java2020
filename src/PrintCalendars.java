//10-23-20 class and hw
/*
MAIN METHOD
do{
1. Scanner - ask user
   ask user for number of days in the month (int totalDays)
   ask user for the date of the first Sunday of month (int firstSunday)
2. print headings
3. call DOTLINE method
4. call printCalendar method
5. call DOTLINE method
} while

METHOD-DOTLINE
1. print the dotted line

METHOD-PRINTCALENDAR (int totalDays, int firstSunday)

 */

import java.util.*;
public class PrintCalendars {
    public static void main(String[] args) {
        //ask user for inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number of days in the month: ");
        int totalDays = input.nextInt();
        System.out.print("Please enter the date of the first Sunday of the month: ");
        int firstSunday = input.nextInt();

        //print headings
        System.out.println("  Sun    Mon    Tue    Wed    Thu    Fri    Sat");
        dottedLine();

        printCalendar(totalDays,firstSunday);
        dottedLine();
    }
    //print d
    public static void dottedLine(){
        for(int i = 1; i <= 7; i++){
            System.out.print("+------");
        }
        System.out.println("+");
    }

    public static void printCalendar(int totalDays,int firstSunday) {
        //find number of blank days
        int blank = 0;
        if (firstSunday == 0) {
            blank = 0;
        } else {
            blank = 8 - firstSunday;
        }
        //print first row
        for(int i = 1; i <= 7; i++){
            System.out.print("|");
            //blank spaces
            if(i<=blank){
                String space = " ";
                System.out.print(padded(space,4));
                System.out.print("  ");
            }
            //numbers before first Sunday
            else{
                int space = i - blank;
                System.out.print(padded(space,4));
                System.out.print("  ");
            }
        }
        System.out.println("|");
        //print first Sunday to the end
        for(int i = firstSunday; i <= totalDays; i++){
            System.out.print("|");
            System.out.print(padded(i,4));
            System.out.print("  ");
            if(i%7 == firstSunday-1){
                System.out.println("|");
            }
        }
        //print blank spaces on last row
        for(int i = totalDays; i < totalDays+blank-1; i++){
            System.out.print("|");
            String space = " ";
            System.out.print(padded(space,4));
            System.out.print("  ");
        }
        System.out.println("|");
    }

    //formatting
    public static String padded(int n,int width){
        String s = " " + n;
        for(int i = s.length(); i < width; i++){
            s = " " + s;
        }
        return s;
    }

    //same formatting again but with String as parameter
    public static String padded(String n,int width) {
        String s = " " + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;
    }
}
/*
Write a program that produces calendars as output. Your program should have a method that outputs a single
month's calendar like the one below, given parameters to specify how many days are in the month and what the date
of the first Sunday is in that month. In the month shown below, these values are 31 and 6, respectively.
 */