public class Main {
    public static void main(String[] args) {
        // Կիսատ թողնված տնային
        int x = 216;
        System.out.println(x/100);
        System.out.println((x/10)%10);
        System.out.println(x%10);

        // Առաջին մաս
        int aa = 11;
        int bb = 5;
        System.out.println((double)aa/bb == aa/bb);

        // Երկրորդ մաս
        int a = 2;
        int b = 3;
        int c = 5;
        int d = 8;
        int e = 11;
        int f = 24;
        int z = a + b + c;
        int u = d + e + f;
        System.out.println(z/(double)2);
        System.out.println(u/(double)2);
        System.out.println(((z/2) + (u/2))/2);
    }
}