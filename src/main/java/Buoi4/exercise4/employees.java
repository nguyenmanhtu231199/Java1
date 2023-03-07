package Buoi4.exercise4;

public class employees {
    private int id;
    private  String firstName;
    private String lastName;
    private  int salary;
    public employees(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return firstName + " "+ lastName;
    }
    public int getAnnualSalary() {
        return salary * 12;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int raiseSalary(int percent){

        salary = salary +salary*percent/100;
        return salary;
    }
    @Override
    public String toString() {
        return "Employee[" + "id=" + id + ",name='" + firstName + " " + lastName + ",salary=" + salary + ']';
    }
}
