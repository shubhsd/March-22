package Lecture_8_Loops_And_Patterns;

//factorial is product of all numbers from 1 to n
//eg: 5! = 1*2*3*4*5
public class findFactorial {
    public static void main(String[] args) {
        int ans = 1;
        int n = 5;
//        Product of 1st n numbers
        for (int i = 1; i <= n; i++) {
            ans = ans * i;
        }
        System.out.println(ans);

//        Sum of first n terms

        ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = ans + i;
        }
        System.out.println(ans);
    }
}
