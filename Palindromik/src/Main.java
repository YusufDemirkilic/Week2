import java.util.Scanner;

public class Main {
    static boolean isPalindrom(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen bir kelime girin");
        String word = scanner.nextLine();
        if (isPalindrom(word)) {
            System.out.println("palindrom bir kelimedir: " + word);
        } else {
            System.out.println("palindrom bir sayı değildir");
        }

    }
}