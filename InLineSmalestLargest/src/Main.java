import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, small = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
        System.out.println("lütfen dizi uzunluğunu giriniz");
        number = scanner.nextInt();
        int[] firstArray = new int[number];
        int[] dubliCateArray = new int[firstArray.length];
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("dizinin [" + (i + 1) + "] değerini giriniz: ");
            int enterValue = scanner.nextInt();
            firstArray[i] = enterValue;
        }
        for (int j = 0; j < dubliCateArray.length; j++) {
            small = Integer.MAX_VALUE;

            for (int k = 0; k < firstArray.length; k++) {
                if (small > firstArray[k] && firstArray[k] != 0) {

                    dubliCateArray[j] = firstArray[k];
                    small = firstArray[k];
                }
            }
            for (int t = 0; t < firstArray.length; t++) {
                if (dubliCateArray[j] == firstArray[t]) {
                    firstArray[t] = 0;
                }
            }
        }
        for (int l : dubliCateArray) {
            System.out.println(l);
        }
    }
}