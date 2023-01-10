import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.println("Enter 3 values for checking the possibility of creating a triangle");
        int a = t.nextInt();
        int b = t.nextInt();
        int c = t.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("It  us possible to create a triangle with these values");
        } else {
            System.out.println("It is impossible  to create a triangle with these values");
        }
    }
}
