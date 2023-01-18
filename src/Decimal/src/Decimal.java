public class Decimal {
    public static void main(String[] args) {
        int[] number = {1, 0, 1, 1};
        int firstMember = 1;
        System.out.print("A decimal number is ");
        for (int i = number.length - 1; i >= number[0]; i--) {
            if (number[i] != 0) {
                number[i] += firstMember * 2;
                System.out.print(firstMember);
            }
        }

    }
}