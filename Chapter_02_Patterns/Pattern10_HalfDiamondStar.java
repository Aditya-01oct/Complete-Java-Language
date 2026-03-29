class Solution {
    public void pattern10(int N) {

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i < N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class Pattern10_HalfDiamondStar {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern10(N);
    }
}
