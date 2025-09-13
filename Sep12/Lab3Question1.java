package Sep12;

import java.util.Scanner;

public class Lab3Question1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a+b<=c || a+c<=b || b+c<=a){
            System.out.println("The three side you input can not form a triangle");
        }else{
            if (a==b && a==c){
                System.out.println("It is an equilateral triangle");
            }else if(a==b || a==c || b==c){
                System.out.println("It is an isosceles triangle");
            }else{
                System.out.println("It is an scalene triangle");
            }
        }
    }
}
