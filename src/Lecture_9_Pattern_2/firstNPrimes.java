package Lecture_9_Pattern_2;

public class firstNPrimes {
    public static void main(String[] args) {
        int limit = 7; //Means find first 7 prime numbers
        for (int cnt = 0, n = 2; cnt < limit; n++) {
//            Increment the count when you find the prime number
            int i = 2;
            boolean divisorFound = false;
            while (i < n) {
                if (n % i == 0) {
                    divisorFound = true;
                    break;
                }
                i = i + 1;
            }
            if (!divisorFound) {
                System.out.println(n);
                cnt++;
            }
        }
    }
}
