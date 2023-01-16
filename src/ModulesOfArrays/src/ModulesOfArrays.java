public class ModulesOfArrays {
    public static void main(String[] args) {
        int[] array = {2, -1, 7, 3, -4, -6, 0, -9, 1};
        int num = 0;

        System.out.print("The changed array is { ");
        for ( int i = 0; i < array.length; ++i) {
            if (array[i] <= 0) {
                array[i] = array[i] * -1;
                num++;
            }
                System.out.print(array[i] + " ");
        }
        System.out.println("}");
        System.out.println("The negative elements quantity is " + num);
        System.out.println("The positive elements quantity is " + (array.length - num));
        }
    }