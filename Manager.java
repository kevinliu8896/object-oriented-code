import java.util.ArrayList;

public class Manager extends Employee{ //subclass
    double monthlyBonus;
    ArrayList<Employee> employees;

    public Manager(String firstName, String lastName, int month, int day, String phoneNum, int yearOfHiring, int vDays, int uDays, double salary, double monthlyBonus) {
        super(firstName, lastName, month, day, phoneNum, yearOfHiring, vDays, uDays, salary);
        this.monthlyBonus = monthlyBonus;
        this.employees = new ArrayList<>();
    }
    //getters and setters
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }
//override toString method
    @Override
    public String toString() {
        return "Manager{" +
                getFirstName() + ", "+ getLastName() + ", "+
                "Month: " + getMonth()+ ", " + "Day: " +getDay()+ ", " + "Phone number: " +getPhoneNum() +
                ", " +"Year of hiring: " +getYearOfHiring()+ ", "+ "Vacation days: " +getvDays()+ ", " +
                "Unused vacation days: " +getuDays()+ ", "+ "Salary: " +getSalary() + " Monthly bonus salary: " + getMonthlyBonus();

    }

}
