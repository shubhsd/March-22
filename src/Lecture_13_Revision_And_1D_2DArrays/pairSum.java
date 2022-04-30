package Lecture_13_Revision_And_1D_2DArrays;

public class pairSum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 10, 6, 8, 5, 9, 7};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[i] + arr[j] == 15) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }
}
