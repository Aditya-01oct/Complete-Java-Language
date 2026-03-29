class Solution {
    public void pattern11(int N) {

        for (int i = 0; i < N; i++) {
            int start = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }

            System.out.println();
        }
    }
}

public class Pattern11_BinaryNumberTriangle {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern11(N);
    }
}
