import java.util.Scanner;
public class DaysOfMonths {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month number from 1 to 12 to see how many days include this month");
        int m = s.nextInt();
        switch (m) {
            case 1:
                System.out.println("1st month has 31 days.");
                break;
            case 2:
                System.out.println("2nd month has 28 days.");
                break;
            case 3:
                System.out.println("3rd month has 31 days.");
                break;
            case 4:
                System.out.println("4th month has 30 days.");
                break;
            case 5:
                System.out.println("5th month has 31 days.");
                break;
            case 6:
                System.out.println("6th month has 30 days.");
                break;
            case 7:
                System.out.println("7th month has 31 days.");
                break;
            case 8:
                System.out.println("8th month has 31 days.");
                break;
            case 9:
                System.out.println("9th month has 30 days.");
                break;
            case 10:
                System.out.println("10th month has 31 days.");
                break;
            case 11:
                System.out.println("11th month has 30 days.");
                break;
            case 12:
                System.out.println("12th month has 31 days.");
                break;
            default:
                System.out.println("There is no month with this number.");
        }
    }
}