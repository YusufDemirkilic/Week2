public class Student {
  //  Objemizin niteliklerini tanımlıyouruz
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    //consturactor
    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }
    // örenci sınav ve sözlü notlarının değer aralığı sınırları
    void addBulkExamNote(int kimya, int fizik, int mat, int sozluMat, int sozluFizik, int sozluKimye) {
        if (0 <= kimya && kimya <= 100) this.kimya.note = kimya;
        if (0 <= fizik && fizik <= 100) this.fizik.note = fizik;
        if (0 <= mat && mat <= 100) this.mat.note = mat;
        if (0 <= sozluMat && sozluMat <= 100) this.mat.quiz = sozluMat;
        if (0 <= sozluFizik && sozluFizik <= 100) this.fizik.quiz = sozluFizik;
        if (0 <= sozluKimye && sozluKimye <= 100) this.kimya.quiz = sozluKimye;


    }
    // Ders noltları ekrana yazdırma metodu
    void printNote() {
        System.out.println(kimya.name + " Notu\t: " + kimya.name);
        System.out.println(fizik.name + " Notu\t: " + fizik.name);
        System.out.println(mat.name + " Notu\t: " + mat.name);
        System.out.println("Ortalamanız: " + avarage);
    }
    // Ders ortalaması hesaplama ve geçme durumu kontrolü
    void isPass() {
        this.avarage = (((this.mat.note * 0.8) + (this.mat.quiz * 0.2)) + ((this.fizik.note * 0.8) + (this.fizik.quiz * 0.2)) + ((this.kimya.note * 0.8) + (this.fizik.quiz * 0.2))) / 3.0;
        if (this.avarage >= 55) {
            System.out.println("Sınıfı başarılı şekilde geçtiniz.");

        } else {
            System.out.println("Sınıfı geçemediniz. ");
        }
        printNote();
    }

}
