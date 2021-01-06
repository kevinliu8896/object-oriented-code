import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    private String nameOfCompany;
    private int startingYear;
    private ArrayList<Employee> employees;

    public Company(String nameOfCompany, int startingYear) {
        employees = new ArrayList<>();
        this.nameOfCompany = nameOfCompany;
        this.startingYear = startingYear;
    }
//getters and setters
    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public void setNameOfCompany(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
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

    public void sortByLastName() { // sort by last name using collections.sort
        ArrayList<Employee> employeeArrayListSorted = employees;
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().toLowerCase().compareTo(o2.getLastName().toLowerCase());
            }
        });
        System.out.println(employeeArrayListSorted);
    }

    public void printManager() { //sort by managers employees
        ArrayList<Employee> employeeArrayListSorted = employees;
        employeeArrayListSorted.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        for(Person manager : employeeArrayListSorted) {
            if(manager instanceof Manager) {
                System.out.println(manager);
                System.out.println("\t" + ((Manager) manager).getEmployees());//indentation to distinguish manager and employees
            }
        }

    }


}
