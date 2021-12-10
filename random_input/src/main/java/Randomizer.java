public class Randomizer {

    private final java.util.Random random = new java.util.Random();

    public int getYourRandomNumber(int firstNumber, int lastNumber) {
        if (lastNumber > 500 || firstNumber < -10) {
            System.out.println("Incorrect input.");
            return 0;
        }
        if (firstNumber > lastNumber) {
            int i = lastNumber;
            lastNumber = firstNumber;
            firstNumber = i;
        }
        int diff = lastNumber - firstNumber;
        int randomNumber = random.nextInt(diff + 1);
        return randomNumber + firstNumber;
    }
}
