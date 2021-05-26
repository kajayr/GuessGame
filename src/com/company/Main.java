package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void isString(Object e) throws isString {
        if(e instanceof String){
            throw new isString();
        }
    }

    public static void main(String[] args) throws Exception {
        InputMismatch inputMismatch = new InputMismatch();
         Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) Math.round(Math.random() * 20 + 1);
        int count = inputMismatch.getCount();
        System.out.println("The computer will \"think\" of a secret number from 1 to 20 and ask the user to guess it.\n After each guess, the computer will tell the user whether the number is too high or too low.\n The user wins if they can guess the number within six tries.");
while(count < 6){
    int input;

    try{
        input = scanner.nextInt();
        isString((Object) input);
        if(input > 20 || input < 0){
            System.out.println("The number is out of boundary. Please select a number between 1 and 20");
            continue;
        }
        if(randomNumber < input){
            System.out.println("The number is too high");
            count++;
        }else if(randomNumber > input){
            System.out.println("The number is too low");
            count++;
        }else if(input == randomNumber){
            System.out.println("YOU WON!");
            break;
        }

    }catch(isString e){
        System.out.println(e.getMessage());
    }

    catch(Exception e){
        System.out.println("Your input should be a number");
        scanner.nextLine();
    }

}
if(count == 6){
    System.out.println("\nYou guessed wrong for 6 times! Game over");
}

    }
}
