class Solution {
    public void pattern15(int N) {
        for (int i = 0; i < N; i++) {
            for (char ch = 'A'; ch <= 'A' + (N - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern15_ReverseLetterTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern15(N);
    }
}
