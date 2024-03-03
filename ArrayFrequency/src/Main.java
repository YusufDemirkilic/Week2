public class Main {
    public static void main(String[] args) {
        int number;
        int[] numberArray = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] dubliCateArray = new int[numberArray.length];
        for (int num = 0; num < numberArray.length; num++) {
            number = 0;
            for (int clonenum = 0; clonenum < dubliCateArray.length; clonenum++) {
                if (numberArray[num] == numberArray[clonenum]) {
                    dubliCateArray[num] = numberArray[clonenum];

                    number++;
                }
            }
            for (int i = 0; i < numberArray.length; i++) {
                if (numberArray[num] == numberArray[i] && num != i) {
                    numberArray[i] = 0;
                }
            }
            if (dubliCateArray[num] != 0) {
                System.out.println(dubliCateArray[num] + " Sayısı " + number + " kere tekrar etti.");
            }


        }
    }
}