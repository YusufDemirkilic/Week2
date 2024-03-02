
public class Employee {
    String name_surname;
    double salary;
    int weekylWorkHourse;
    int hireYear;
    double totoal = salary;

    public Employee(String name_surname, double salary, int weekylWorkHourse, int hireYear) {
        this.name_surname = name_surname;
        this.salary = salary;
        this.weekylWorkHourse = weekylWorkHourse;
        this.hireYear = hireYear;
        System.out.println(toString());
        tax();
        bonus();
        raiseSalary();

    }

    // vergi hesaplama
    public void tax() {
        if (1000 <= this.salary) {
            System.out.println("tax: " + salary * 0.03);
            this.totoal = salary - (salary * 0.03);

        }
    }
// fazla mesai
    public void bonus() {
        int bonus = 0;

        if (this.weekylWorkHourse == 40) {
            System.out.println("salary bonus: " + bonus);

        } else {
            bonus = (this.weekylWorkHourse - 40) * 30;
            this.totoal += bonus;
            System.out.println("salary bonus: " + bonus);
        }

    }

//kıdem zammı
    public void raiseSalary() {
        int thisyear = 2021 - this.hireYear;
        double salary = this.salary;

        if (thisyear < 10) {
            this.salary = salary + (salary * 0.05);
            System.out.println("Salary increase: " + salary * 0.05);
            this.totoal += salary * 0.05;
        }
        if (10 < thisyear && thisyear < 20) {
            this.salary = salary + (salary * 0.10);
            System.out.println("Salary increase: " + salary * 0.10);
            this.totoal += salary * 0.10;
        }
        if (19 < thisyear) {
            this.salary = salary + (salary * 0.15);
            System.out.println("Salary increase: " + salary * 0.15);
            this.totoal += salary * 0.15;
        }


    }

    @Override
    public String toString() {
        return "Name surname: " + name_surname + "\nSalary: " + salary + "\nWork hours: " + weekylWorkHourse + "\nHire year: " + hireYear;

    }
}
