public class Matrix {

    public static void main(String[] args) {
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        int[][] b = {
            {5, 6},
            {7, 8}
        };

        int[][] result = new int[2][2];

        // enhanced for doesn't have an index so i count it myself
        int i = 0;
        for (int[] row : a) {
            for (int j = 0; j < 2; j++) {
                int k = 0;
                for (int num : row) {
                    result[i][j] += num * b[k][j];
                    k++;
                }
            }
            i++;
        }

        System.out.println("Result:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
