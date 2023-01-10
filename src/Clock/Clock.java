import java.util.Scanner;
public class Clock {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value to see how many minutes pasted");
        int a = s.nextInt();
        if (a <= 12) {
            System.out.println(a * 5);
        } else System.out.println("Incorrect data. Please enter the number from 1 to 12.");
    }
}