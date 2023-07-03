public class ArrayConverter {
    public static int[][] convertTo2D(int[] original, int m, int n) {
        int[][] result = new int[m][n];
        
        if (original.length != m * n) {
            return new int[0][0];
        }
        
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i];
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4}; 
        int m = 2; // Number of rows
        int n = 2; // Number of columns
        
        int[][] result = convertTo2D(original, m, n);
       
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
