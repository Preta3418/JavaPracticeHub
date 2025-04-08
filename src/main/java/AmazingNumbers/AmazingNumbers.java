package AmazingNumbers;

import java.util.Scanner;

public class AmazingNumbers {
    public static void run() {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.printf("Supported requests:%n" +
                "- enter a natural number to know its properties;%n" +
                "- enter two natural numbers to obtain the properties of the list:%n" +
                "  * the first parameter represents a starting number;%n" +
                "  * the second parameter shows how many consecutive numbers are to be processed;%n" +
                "- separate the parameters with one space;%n" +
                "- enter 0 to exit.%n");

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("Enter a request: ");

            String[] num = sc.nextLine().split(" ");

            if(num.length == 1) { //when one number is inputted
                Long natNum = Long.valueOf(num[0]);

                if (natNum == 0) {
                    System.out.println("Goodbye!");
                    break;
                } else if (natNum < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                } else {
                    calculator.printDetailedProperties(natNum);
                }

            } else if(num.length == 2) { //when two number is inputted
                Long firstParseNum = Long.parseLong(num[0]);
                int secondParseNum = Integer.parseInt(num[1]);

                if (firstParseNum < 0) {
                    System.out.println("The first parameter should be a natural number or zero.");
                }
                else if (secondParseNum <= 0) {
                    System.out.println("The second parameter should be a natural number.");
                } else {
                    for (int i = 0; i < secondParseNum; i++) {
                        calculator.printInlineProperties(firstParseNum + i);
                    }

                }
            }

        }
    }

}




