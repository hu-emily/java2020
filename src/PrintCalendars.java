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

        for(int rows = 1; rows <= 5; rows++) {
            for(int columns = 1; columns <= 7; columns++){
                System.out.print("|");
                //print dates
                int day = (7*(rows-1))+columns;
                if(day <= totalDays){
                    System.out.print(padded(day,4));
                    System.out.print("  ");
                }

                else{
                    day = 0;
                    String date = Integer.toString(day);
                    date = " ";
                    System.out.print(padded2(date,4));
                    System.out.print("  ");
                }
            }
            System.out.println("|");
        }
    }

    public static String padded(int n,int width){
        String s = " " + n;
        for(int i = s.length(); i < width; i++){
            s = " " + s;
        }
        return s;
    }

    public static String padded2(String n,int width) {
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