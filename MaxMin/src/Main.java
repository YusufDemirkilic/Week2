import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];
        int smalest=Integer.MIN_VALUE,bigger=Integer.MAX_VALUE;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number=scanner.nextInt();

        for (int i : list) {
            // girilen sayıdan en küçük yakın değer bulma
            if (i<number){
                    // en yakın için en büyük değer alınır
                    if (smalest<i){
                        smalest=i;
                    }
            }
            // girilen sayıdan en yakın büyük değer bulma
            if (i>number){
                    // büyük için küçük değer alınır.
                    if (bigger>i){
                        bigger=i;
                    }
            }

        }
        System.out.println("girilen sayıya büyük en yakın değer: "+bigger);
        System.out.println("girilen sayıdan küçük en yakın değer: "+smalest);




    }
}