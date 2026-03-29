class Solution {
    public void pattern12(int N) {

        int space = 2 * (N - 1);

        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            System.out.println();
            space -= 2;
        }
    }
}

public class Pattern12_NumberCrown {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        sol.pattern12(N);
    }
}
