package Sep24;

import java.util.Scanner;
import java.util.Arrays;

public class bubbleSort {
    public static int[] bubbleSortTheIntList(int[] list, boolean direction){
        int[] copy = Arrays.copyOf(list, list.length);
        int length = list.length;
        if(direction){ // low to high
            for (int i = 0; i < length; i++) {
                boolean change = false;
                for(int j = 0; j < length-i-1; j++){
                    if (copy[j] > copy[j + 1]) {
                        int temp = copy[j];
                        copy[j] = copy[j + 1];
                        copy[j + 1] = temp;

                        change = true;
                    }
                }

                if(!change){
                    break;
                }
            }
        }else{ // high to low
            for (int i = 0; i < length; i++) {
                boolean change = false;
                for(int j = 0; j < length-i-1; j++){
                    if (copy[j] < copy[j + 1]) {
                        int temp = copy[j];
                        copy[j] = copy[j + 1];
                        copy[j + 1] = temp;

                        change = true;
                    }
                }

                if(!change){
                    break;
                }
            }
        }

        return copy;
    }

    public static int[] addIntoIntArray(int input, int[] list){
        list = Arrays.copyOf(list, list.length +1); // method to add a value to array
        list[list.length-1] = input;
        return list;
    }

    public static int[] removeFromIntArray(int value, int[] list) {
        // count how many same value need to remove (how many need to remain)
        int count = 0;
        for (int num : list) { // Retrieve each number in the array
            if (num != value) count++;
        }
        // if non then return
        if (count == list.length) return list;

        // copy a new array to do the work
        int[] newArr = new int[count];
        int index = 0;
        for (int num : list) {
            if (num != value) {
                newArr[index++] = num; // add every left value into the new list
            }
        }
        return newArr;
    }

//    public static int changeStringToInt(){
//
//    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many Grade you want to sort? (Initialize)");
        int numberOfGrade = sc.nextInt();

        int[] gradeList = new int[numberOfGrade];
        int[] gradeListSorted = new int[numberOfGrade];

        for(int i = 0; i < numberOfGrade; i++){
            System.out.println("Please input the grade[" + (i+1) + "]: ");
            gradeList[i] = sc.nextInt();
            gradeListSorted[i] = gradeList[i];
        }
        sc.nextLine(); // refresh
        String action;
        while(true){
            System.out.println("Press the number to choose the menu");
            System.out.println("1) Add a Grade into it");
            System.out.println("2) Remove a Grade from it");
            System.out.println("3) Change a Grade into it");
            System.out.println("4) Sort the grade form lowest to highest");
            System.out.println("5) Sort the grade form highest to lowest");
            System.out.println("6) Show the Average Grade");
            System.out.println("7) Show the Array (Original and sorted)");
            System.out.println("8) Input the Grade and show where it is");
            System.out.println("9) Exit");
            action = sc.nextLine();

            switch (action){
                case "1":
                    System.out.println("Please input a new Grade you want to add into it: ");
                    int inputNewGrade = sc.nextInt();
                    gradeList = addIntoIntArray(inputNewGrade, gradeList);
                    gradeListSorted = bubbleSortTheIntList(gradeList, true);
                    sc.nextLine(); // refresh
                    break;
                case "2":
                    System.out.println("Please input the Grade you want to remove: ");
                    int inputRemoveGrade = sc.nextInt();
                    gradeList = removeFromIntArray(inputRemoveGrade, gradeList);
                    gradeListSorted = bubbleSortTheIntList(gradeList, true);
                    sc.nextLine(); // refresh
                    break;
                case "3":
                    System.out.println("Please input the index of the Grade you want to change: ");
                    int changeIndex = sc.nextInt();
                    System.out.println("Please input the Grade you want to replace: ");
                    int replaceGrade = sc.nextInt();
                    gradeList[changeIndex] = replaceGrade;
                    gradeListSorted = bubbleSortTheIntList(gradeList, true);
                    sc.nextLine(); // refresh
                    break;
                case "4":
                    gradeListSorted = bubbleSortTheIntList(gradeList, true);
                    System.out.println("Success!");
                    break;
                case "5":
                    gradeListSorted = bubbleSortTheIntList(gradeList, false);
                    System.out.println("Success!");
                    break;
                case "6":
                    int sum = 0;
                    for(int i = 0; i <= gradeList.length; i++){
                        sum += gradeList[i];
                    }
                    System.out.println("The average of those Grades are: " + sum/gradeList.length);
                    break;
                case "7":
                    System.out.print("Original: ");
                    for(int i = 0; i < gradeList.length; i++){
                        if(i+1 == gradeList.length){
                            System.out.print(gradeList[i] + ". ");
                        }else {
                            System.out.print(gradeList[i] + ", ");
                        }
                    }
                    System.out.println();
                    System.out.print("Sorted: ");
                    for(int i = 0; i < gradeListSorted.length; i++){
                        if(i+1 == gradeListSorted.length){
                            System.out.print(gradeListSorted[i] + ". ");
                        }else {
                            System.out.print(gradeListSorted[i] + ", ");
                        }
                    }
                    System.out.println();
                    break;
                case "8":
                    System.out.println("Please input the Grade you want to search where it is: ");
                    int inputGradeIndex = sc.nextInt();
                    System.out.print("The Grade you input is appear at index ");
                    boolean start = true;
                    for (int i = 0; i < gradeList.length; i++){
                        if(gradeList[i] == inputGradeIndex){
                            if(start){
                                System.out.print((i+1));
                                start = false;
                            }else{
                                System.out.print(", " + (i+1));
                            }
                        }
                    }
                    System.out.print(" in this array.");
                    System.out.println();
                    sc.nextLine(); // refresh
                    break;
                case "9":
                    System.out.println("Your Action: Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input!");
            }
            System.out.println("____________________________________");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
            }
        }

        // selection sort I believe this is called :)
        // for (int i = 0; i < numberOfGrade; i++){
        //     for (int j = i+1; j < numberOfGrade; j++){
        //         if (gradeList[j] > gradeList[i]){
        //             int temp = gradeList[i];
        //             gradeList[i] = gradeList[j];
        //             gradeList[j] = temp;
        //         }
        //     }
        // }
    }
}
