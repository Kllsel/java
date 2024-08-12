import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int answer;

        while (true) {
            int a = randValue(0, 10);
            int b = randValue(0, 10);

            System.out.println(a + " * " + b);
            answer = cin.nextInt();

            if (answer == a * b) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect!");
            }

            System.out.println("Want to continue? (y/n)");
            String yn = cin.next();

            if (yn.equalsIgnoreCase("y")) {
                continue;
            } else {
                break;
            }
        }


    }

    public static int randValue(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}