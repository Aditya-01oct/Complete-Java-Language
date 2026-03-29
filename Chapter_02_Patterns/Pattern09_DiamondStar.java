class Solution {
    public void pattern9(int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) System.out.print(" ");
            for (int j = 0; j < 2 * i + 1; j++) System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int j = 0; j < 2 * N - (2 * i + 1); j++) System.out.print("*");
            System.out.println();
        }
    }
}

public class Pattern09_DiamondStar {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern9(N);
    }
}
