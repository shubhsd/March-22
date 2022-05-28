package Practice_1_Basics;

public class TypeCastingAndPrecesion {
    public static void main(String[] args) {
        double n = 3.1;
        int sum  = 8;
        System.out.printf("%.3f", n);
        System.out.println();
        System.out.printf("%.4f", n);

        System.out.println();
        System.out.printf("%.2f", (float)sum/5);
        System.out.println();
        System.out.printf("%.2f", (double)sum/5);


    }
}
