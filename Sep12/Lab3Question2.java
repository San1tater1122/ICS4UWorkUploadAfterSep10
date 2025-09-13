package Sep12;

import java.util.Scanner;

public class Lab3Question2 {
    public static void main(String[] args){
        // Write a program that asks the user to enter a year,
        // month, and day. Validate whether this date is correct
        // (consider leap years for February).
        Scanner sc = new Scanner(System.in);
        System.out.print("Please in put a year: ");
        short year = sc.nextShort();
        System.out.print("Please in put a month(in number format): ");
        short month = sc.nextShort();
        System.out.print("Please in put a day: ");
        short day = sc.nextShort();

        // AC是公元前, BC是公元后
        boolean AC = false;
        boolean leapYear = false;
        boolean monthIsCorrect = false;
        boolean dayIsCorrect = false;

        if (year % 400 == 0 || (year % 4 == 0 && !(year % 100 == 0))){
            leapYear = true;
        }
        if (year < 0){
            AC = true;
        }
        if(month > 0 && month < 13){
            monthIsCorrect = true;
        }

        byte[] monthL = {1,3,5,7,8,10,12};
        byte[] monthS = {4,6,9,11};
        for(byte m : monthL){
            if(month == m){
                if(day >= 1 && day <= 31){
                    dayIsCorrect = true;
                    break;
                }
            }
        }
        for(byte m : monthS){
            if(month == m){
                if(day >= 1 && day <= 30){
                    dayIsCorrect = true;
                    break;
                }
            }
        }
        if(month == 2){
            if(leapYear){
                if(day >= 1 && day <= 29){
                    dayIsCorrect = true;
                }
            }else{
                if(day >= 1 && day <= 28){
                    dayIsCorrect = true;
                }
            }
        }

        if(monthIsCorrect && dayIsCorrect){
            if(AC){
                System.out.println("The Date is AC" + year + "/" + month + "/" + day + ", it is correct");
            }else{
                System.out.println("The Date is BC" + year + "/" + month + "/" + day + ", it is correct");
            }
        }else{
            if(!monthIsCorrect && !dayIsCorrect){
                System.out.println("Your month and day are not valid");
            } else if (!monthIsCorrect) {
                System.out.println("Your month is not valid");
            }else{
                System.out.println("Your day is not valid");
            }
        }
    }
}
