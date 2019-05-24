package utils;

import java.util.Scanner;

public class UIUtils {
    public static String readInput(String message){
        System.out.println(message);

        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static int readNum(String message){
        int result = 0;
        boolean isValid = false;

        do{
            try{
                result = Integer.parseInt(readInput(message));
                isValid = true;
            }catch (NumberFormatException e){
                System.out.println("Invalid number!");
            }
        }while(!isValid);
        return result;
    }
    public static void output(String message){
        System.out.println(message);
    }
}
