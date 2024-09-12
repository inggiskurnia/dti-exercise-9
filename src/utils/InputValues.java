package utils;

import exeptions.EmptyInputException;

import java.util.Scanner;

public class InputValues {
    public static String check(){
        Scanner scanner = new Scanner(System.in);

        String inputtedValues = scanner.nextLine();
        if (inputtedValues.isEmpty()) {
            throw new EmptyInputException();
        }
        return inputtedValues;
    }
}
