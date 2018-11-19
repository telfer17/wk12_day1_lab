package staff;

import static java.lang.Math.abs;

public abstract class Employee {

    private String name;
    private String niNumber;
    protected int salary;

    public Employee(String name, String niNumber, int salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name != "") {
            this.name = name;
        }
    }

    public String getNINumber() {
        return niNumber;
    }

    public int getSalary() {
        return salary;
    }

    public Double raiseSalary(double value){
        return salary + abs(value);
    }

    public Double calculateBonus(){
        return salary * 0.01;
    }

}
