public class StudentSystem {

    public static void main(String[] args) {
        //öğretmen bilgileri oluşturuldu
        Teacher teacher = new Teacher("Ahmet", "555 555 55 55", "Kmy");
        Teacher teacher1 = new Teacher("Mehmet", "555 666 66 66", "Fzk");
        Teacher teacher2 = new Teacher("Kudret", "556 765 78 89", "Mt");
        //ders bilgileri oluturuldu ve öğretmen ataması yapıldı
        Course fizik = new Course("Fizik", "101", "Fzk");
        fizik.addTeacher(teacher1);
        Course kimya = new Course("Kimya", "101", "Kmy");
        kimya.addTeacher(teacher);
        Course mat = new Course("Mat", "101", "Mt");
        mat.addTeacher(teacher2);
        // öğrenci eklemesi yapıldı ve ders notarlı girildi
        Student student = new Student("Yusuf", 11, "460118", mat, fizik, kimya);
        student.addBulkExamNote(70, 65, 57, 85, 75, 90);
        student.isPass();
        System.out.println("=====================================================");
        Student student1 = new Student("Koray", 12, "430110", mat, fizik, kimya);
        student.addBulkExamNote(32, 62, 75, 42, 30, 50);
        student.isPass();
        System.out.println("=====================================================");
        Student student2 = new Student("Demir", 9, "480142", mat, fizik, kimya);
        student.addBulkExamNote(75, 45, 77, 85, 80, 82);
        student.isPass();


    }


}
