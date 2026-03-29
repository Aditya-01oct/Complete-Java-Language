class Solution {
    public void pattern13(int N) {
        int num = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern13_IncreasingNumberTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern13(N);
    }
}
