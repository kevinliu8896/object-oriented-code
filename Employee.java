public class Employee extends Person{ // subclass
    private int yearOfHiring, vDays, uDays;
    private double salary;

    public Employee(String firstName, String lastName, int month, int day, String phoneNum, int yearOfHiring, int vDays, int uDays, double salary) {
        super(firstName, lastName, month, day, phoneNum);
        this.yearOfHiring = yearOfHiring;
        this.vDays = vDays;
        this.uDays = uDays;
        this.salary = salary;
    }
// getters and setters
    public int getYearOfHiring() {
        return yearOfHiring;
    }

    public void setYearOfHiring(int yearOfHiring) {
        this.yearOfHiring = yearOfHiring;
    }

    public int getvDays() {
        return vDays;
    }

    public void setvDays(int vDays) {
        this.vDays = vDays;
    }

    public int getuDays() {
        return uDays;
    }

    public void setuDays(int uDays) {
        this.uDays = uDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    //override toString method
    @Override
    public String toString() {
        return "Employee{" +
                getFirstName() + ", "+ getLastName() + ", "+
                "Month: " + getMonth()+ ", " + "Day: " +getDay()+ ", " + "Phone number: " +getPhoneNum() +
                ", " +"Year of hiring: " +getYearOfHiring()+ ", "+ "Vacation days: " +getvDays()+ ", " +
                "Unused vacation days: " +getuDays()+ ", "+ "Salary: " +getSalary();

    }
}
