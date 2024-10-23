package More;

import java.util.Scanner;

public class ArrayManipulator {


    public static void manipulateArray(){
        Scanner scanner = new Scanner(System.in);

        while (true){
            String [] command = scanner.nextLine().split(" ");

            if (command.toString().contains("exchange")){
               String firstPart = command[0];
               int index= Integer.parseInt(command[1]);
               String [] newArray = new String[command.length];
                for (int i = 0; i <command.length ; i++) {

                }
            }
        }


    }

    //•	exchange {index} – splits the array after the given index and exchanges the places of the two resulting subarrays. E.g. [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
    //o	If the index is outside the boundaries of the array, print "Invalid index".
    //•	max even/odd – returns the INDEX of the max even/odd element -> [1, 4, 8, 2, 3] -> max odd -> print 4
    //•	min even/odd – returns the INDEX of the min even/odd element -> [1, 4, 8, 2, 3] -> min even > print 3
    //o	If there are two or more equal min/max elements, return the index of the rightmost one.
    //o	If a min/max even/odd element cannot be found, print "No matches".
    //•	first {count} even/odd – returns the first {count} elements -> [1, 8, 2, 3] -> first 2 even -> print [8, 2]
    //•	last {count} even/odd – returns the last {count} elements -> [1, 8, 2, 3] -> last 2 odd -> print [1, 3]
    //o	If the count is greater than the array length, print "Invalid count".
    //o	If there are not enough elements to satisfy the count, print as many as you can. If there are zero even/odd elements, print an empty array "[]".
    //•	end – stop taking input and print the final state of the array.
}
