import java.util.Scanner;

public class Main {
    static int[][] dublicate(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
        }
    }
        return transpose;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int[][] transpose = dublicate(matrix);

        // Matrisi yazdır
        System.out.println("Orijinal Matris:");
        printMatrix(matrix);

        // Transpoz matrisi yazdır
        System.out.println("\nTranspoz Matris:");
        printMatrix(transpose);



    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
