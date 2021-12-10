import java.util.Scanner;

public class InputRandom {

    private final Scanner scanner = new Scanner(System.in);
    private final Randomizer randomizer = new Randomizer();
    private int[] array;

    public void run() {
        System.out.println("Hello! Welcome to random input");
        System.out.println("if you want to display a random number, enter 1\n"+
                        "if you want to display a 10 random number, enter 2\n" +
                "if you want to display a random number in the range from 0 to 10, enter 3\n" +
                "if you want to display a random number in the range from 20 to 50, enter 4\n" +
                "if you want to display a random number in the range from -10 to 10, enter 5\n" +
                "Print to the console a random number (in the range from 3 to 15) random numbers, " +
                        "each in the range from -10 to 35 enter 6\n" +
                "for exit enter 0");

                        int from = 0;
                        int to = 500;

                    boolean start = true;
                    while (start){
                        String choose = scanner.next();
                        switch (choose){
                            case "1":
                                System.out.println("Your random number: " + randomizer.getYourRandomNumber(from, to));
                                break;
                            case "2":
                                 array = new int[10];
                                for (int i = 0; i < array.length; i++) {
                                    array[i] = randomizer.getYourRandomNumber(from, to);
                                }
                                showArray(array);
                                break;
                            case "3":
                                to = 10;
                                array = new int[10];
                                for (int i = 0; i < array.length; i++) {
                                    array[i] = randomizer.getYourRandomNumber(from, to);
                                }
                                showArray(array);
                                break;
                            case "4":
                                from = 20;
                                to = 50;
                                array = new int[10];
                                for (int i = 0; i < array.length; i++) {
                                    array[i] = randomizer.getYourRandomNumber(from, to);
                                }
                                showArray(array);
                                break;
                            case "5":
                                from = -10;
                                to = 10;
                                array = new int[10];
                                for (int i = 0; i < array.length; i++) {
                                    array[i] = randomizer.getYourRandomNumber(from, to);
                                }
                                showArray(array);
                                break;
                            case "6":
                                from = -10;
                                to = 35;
                                array = new int[randomizer.getYourRandomNumber(3, 15)];
                                for (int i = 0; i < array.length; i++) {
                                    array[i] = randomizer.getYourRandomNumber(from, to);
                                }
                                showArray(array);
                                break;
                            case "0":
                                System.out.println("Goodbye!");
                                System.exit(404);
                        }
                    }
    }

    private void showArray(int[] array){
        System.out.println("Your random array: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }

    }

}
