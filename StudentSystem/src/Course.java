public class Course {
    // clasın nitelikleri tanımlandı
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;
        //Consturctor
    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;

    }
        // öğretmen eklme metodu
    void addTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }
        //Öğretmen bilgisi yazdıma metodu
    void teacherPrint() {
        courseTeacher.print();
    }

}


