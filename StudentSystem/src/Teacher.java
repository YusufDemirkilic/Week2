public class Teacher {
    // öğretmen kullanıcısından isim, telefon ve bölüm bilgisi alıyoruz
    String name;
    String mobilPhonenumber;
    String branch;

    //consturactor tanımı
    public Teacher(String name, String mobilPhonenumber, String branch) {
        this.name = name;
        this.mobilPhonenumber = mobilPhonenumber;
        this.branch = branch;
    }

    // öğretmen bilgisi ekran yazdırmak için
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Mobil phone number: " + mobilPhonenumber);
        System.out.println("Branch: " + branch);
    }
}
