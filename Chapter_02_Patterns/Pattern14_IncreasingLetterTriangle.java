class Solution {
    public void pattern14(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern14_IncreasingLetterTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern14(N);
    }
}
