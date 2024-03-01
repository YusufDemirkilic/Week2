import java.sql.SQLOutput;

public class Employee {
    String Name_surname;
    double salary;
    int weekylWorkHourse;
    int hireYear;

    public Employee(String name_surname, double salary, int weekylWorkHourse, int hireYear) {
        Name_surname = name_surname;
        this.salary = salary;
        this.weekylWorkHourse = weekylWorkHourse;
        this.hireYear = hireYear;
    }
    public void tax(){

        if (salary<1000){
            System.out.println("Salary: "+salary);
        }
        if (1000<=salary){
            System.out.println("Salary: "+(salary+(salary*0.03)));
        }
    }
    public void bonus(int weekylWorkHourse){
        boolean control=true;
        while(control){
            if (weekylWorkHourse==40){
                control=false;

            }
            else {
                salary+=salary+30;
                weekylWorkHourse--;
            }
        }

    }
}
