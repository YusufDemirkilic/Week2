import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println(number);
        Scanner scanner = new Scanner(System.in);
        int right = 0;

        while (right < 5) {
            System.out.println("1 ile 100 arasında tahmininizi giriniz: ");
            int numberGuest = scanner.nextInt();
            if (numberGuest <= 100 && numberGuest > 0) {
                if (numberGuest == number) {
                    System.out.println("tebrikler doğru bildiniz ");
                    break;
                } else {
                    System.out.println("Yanlış tahminde bulundunuz: ");
                    if (numberGuest > number) {
                        System.out.println("sayıdan büyük bir sayı seçtiniz.");
                    } else {
                        System.out.println("sayıdan küçük bir sayı girdiniz");
                    }
                }

            }
        }
    }
}