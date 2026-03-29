class Solution {
    public void pattern22(int N) {

        for (int i = 0; i < 2 * N - 1; i++) {

            for (int j = 0; j < 2 * N - 1; j++) {

                int top = i;
                int left = j;
                int right = (2 * N - 2) - j;
                int bottom = (2 * N - 2) - i;

                int min = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((N - min) + " ");
            }

            System.out.println();
        }
    }
}

public class Pattern22_NumberPattern {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern22(N);
    }
}
