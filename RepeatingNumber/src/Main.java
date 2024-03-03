public class Main {
    static boolean isFind(int[] arr,int value){
        for (int i:arr){
            //tekrar eden değer bir değer varsa doğru değer döndür
          if (value==i) {
              return true;
          }

        }
        // tekrar eden değer yok ise yanlış değer döndür
        return false;


    }
    public static void main(String[] args) {
        // dizi oluştur ve değer ver, tekrar edilip edilmediğini kontolr et, tekrar edenleri çıkarıp ekrana yaz
        int[] list={3,4,4,5,42,14,42,9,1,3,8,5,4,21,6,8,7,3};
        int[] dublicate=new int[list.length];
        int dublicate_value=0;
        // dizinin her bir elemanı ile diğer elemanları kıyaslama
        for (int i = 0; i <list.length ; i++) {
            for (int j = 0; j < list.length ; j++) {
                // kendisi hariç, çift tekrar eden değerler
                if (i != j && list[i] == list[j]&& list[i]%2==0) {
                    // tekrar eden değer bir daha bulunursa koşula girmeyecek atama yapılmayacak
                    if (!isFind(dublicate,list[i])){
                        dublicate[dublicate_value++]=list[i];
                    }

                    break;
                }
            }
        }// 0 hariç diğer değerleri yazdırma
        for (int value:dublicate){
            if (value!=0){
            System.out.println(value);}}

    }
}