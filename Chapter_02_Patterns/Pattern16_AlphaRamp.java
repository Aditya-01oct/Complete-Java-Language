class Solution {
    public void pattern16(int N) {
        for (int i = 0; i < N; i++) {
            char ch = (char)('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}

public class Pattern16_AlphaRamp {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern16(N);
    }
}
