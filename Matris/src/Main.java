import java.util.Scanner;

public class Main {
    // matrisin transpozunu alan metod
    static int[][] dublicate(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // ilk matirisminiz değerini transpoz olacak şekilde clon matrise atıyoruz
                transpose[j][i] = arr[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        int number = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("dizinin [" + number + "] elemanını girin = ");
                matrix[i][j] = scanner.nextInt();
                number++;

            }
        }
        int[][] transpose = dublicate(matrix);

        // Matrisi yazdır
        System.out.println("matris: ");
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
