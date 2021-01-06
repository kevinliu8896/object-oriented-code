public class Employee extends Person{
    private double salary;
    private String date;

    public Employee(String name, String gender, int age, double salary, String date) {
        super(name, gender, age);
        this.salary = salary;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", date='" + date + '\'' +
                '}';
    }
// getters and setters for salary and date
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
