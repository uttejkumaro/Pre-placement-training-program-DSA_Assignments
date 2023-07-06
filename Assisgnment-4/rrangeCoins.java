class ArrangeCoins {
    public static int arrangeCoins(int n) {
        long i;
        for (i = 1; i * (i + 1) / 2 <= n; i++);
        return (int) i - 1;
    }
    
    public static void main(String[] args) {
        int n = 5;
        
        int result = arrangeCoins(n);
        
        System.out.println("Output: " + result);
    }
}
