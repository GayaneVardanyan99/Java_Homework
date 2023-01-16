public class BiggerThanPrevious {
    public static void main(String[] args) {
        int[] array = {2, 8, 9, 6, 3, 1, 0, 11, 25};
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                System.out.print(array[i] + " ");
            }
        }
    }
}