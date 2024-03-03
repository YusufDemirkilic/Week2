public class Main {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];
        // değerlerimiz atıyoruz
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                // 0 3 ve 6 . satır da "B" nin satır çizgilerini düzenliyoruz
                if (i == 0 || i == 3|| i==6) {
                    letter[i][j] = " * ";
                    // 0 ve 3 sütunda "B" nin sütün değerlerini atıyroruz
                } else if (j == 0 || j == 3) {
                    letter[i][j] = " * ";
                    // harici kısımlara boşluk atıyoruz
                } else {
                    letter[i][j] = "   ";
                }
            }
        }

        for (String[] row : letter){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
