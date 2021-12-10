package ua.com;

import java.util.Scanner;

public class Controller {

    private final Scanner scanner = new Scanner(System.in);
    private final Stars stars = new Stars();

    public void run(){
        System.out.println("Hello! Choose your figure! From 1-9 and 0 for exit");
        boolean start = true;
        while (start) {
            String choose = scanner.next();
            switch (choose) {
                case "1":
                    System.out.println("Your figure: ");
                    showArray(stars.firstFigure());
                    break;
                case "2":
                    System.out.println("Your figure: ");
                    showArray(stars.secondFigure());
                    break;
                case "3":
                    System.out.println("Your figure: ");
                    showArray(stars.thirdFigure());
                    break;
                case "4":
                    System.out.println("Your figure: ");
                    showArray(stars.fourthFigure());
                    break;
                case "5":
                    System.out.println("Your figure: ");
                    showArray(stars.fifthFigure());
                    break;
                case "6":
                    System.out.println("Your figure: ");
                    showArray(stars.sixthFigure());
                    break;
                case "7":
                    System.out.println("Your figure: ");
                    showArray(stars.seventhFigure());
                    break;
                case "8":
                    System.out.println("Your figure: ");
                    showArray(stars.eighthFigure());
                    break;
                case "9":
                    System.out.println("Your figure: ");
                    showArray(stars.ninthFigure());
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Incorrect input");
            }
        }
    }

    private void showArray(String[][] array){
        for (String[] strings : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
