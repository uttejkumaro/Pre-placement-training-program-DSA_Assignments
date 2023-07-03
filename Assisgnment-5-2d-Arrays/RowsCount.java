public class RowsCount {
    public static int arrangeCoins(int n) {
        int i;
        for (i = 1; i <= n; i++) {
            n = n - i;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int n = 5;

        int result = arrangeCoins(n);

        System.out.println("Number of complete rows of coins: " + result);
    }
}
