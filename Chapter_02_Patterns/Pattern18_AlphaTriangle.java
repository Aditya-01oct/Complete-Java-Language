class Solution {
    public void pattern18(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = (char)('A' + N - i - 1); ch <= 'A' + N - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern18_AlphaTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern18(N);
    }
}
