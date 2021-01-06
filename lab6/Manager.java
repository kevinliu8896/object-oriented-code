public class Manager extends Employee{ // extends to employee
    private double bonus;

    public Manager(String name, String gender, int age, double salary, String date, double bonus) {
        super(name, gender, age, salary, date);
        this.bonus = bonus;
    }
// getter and setter for bonus
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return  getName() +
                ", Manager, " +
                "Salary = " + getSalary() +
                " , Weekly bonus=" + getBonus();
    }

}
