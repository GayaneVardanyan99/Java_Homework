public class ArrayFromOddAndEvenNumbers {
    public static void main(String[] args) {
        int[] firstArray = {4, -5, 0, 9, 11, -8, -1};
        int[] secondArray = {13, 0, 7, 6, 1, -2, 1};
        int[] thirdArray = new int[firstArray.length];
        int i;
        int j;

        for (i = 0, j = 0; i < firstArray.length && j < secondArray.length; ++i, ++j) {
            if (firstArray[i] % 2 != 0) {
                thirdArray[i] = firstArray[i];
            } else if (secondArray[j] % 2 == 0) {
                thirdArray[j] = secondArray[j];
            }
        }
        System.out.print("New Array is { ");
        for (i = 0; i < thirdArray.length; ++i) {
            System.out.print(thirdArray[i] + " ");
        }
        System.out.print("}");
    }
}