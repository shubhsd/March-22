package Practice_1_Basics;

public class factorial {
    public static void main(String[] args) {
        int ans = 1;
        int n = 5;

        for(int i = 1; i<=n; i++) {
            ans = ans*i;
        }

        System.out.println(ans);
    }
}
