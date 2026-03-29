class Solution {
    public void pattern19(int N) {
        int space = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < N - i; j++) {
                System.out.print("*");
            }

            System.out.println();
            space += 2;
        }

        space = 2 * N - 2;

        for (int i = 1; i <= N; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
            space -= 2;
        }
    }
}

public class Pattern19_SymmetricVoid {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern19(N);
    }
}
