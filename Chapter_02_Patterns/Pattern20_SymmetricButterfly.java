class Solution {
    public void pattern20(int N) {

        int space = 2 * N - 2;

        for (int i = 1; i <= 2 * N - 1; i++) {

            int stars = i;
            if (i > N) stars = 2 * N - i;

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();

            if (i < N) space -= 2;
            else space += 2;
        }
    }
}

public class Pattern20_SymmetricButterfly {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern20(N);
    }
}
