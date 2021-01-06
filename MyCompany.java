import java.util.ArrayList;

public class MyCompany {
    public static void main(String[] args) {
        Company company = new Company("Mercedes-Benz", 1926);

        Manager clara = new Manager("Clara", "Mouawad", 3, 23, "(226)-202 2504", 2017, 14, 4, 300000, 1500);
        Manager kevin = new Manager("Kevin", "Liu", 9, 27, "(519)-980 8896", 2015, 12, 5, 200000, 2000);
        Employee rachelle = new Employee("Rachelle", "Tiessen", 8, 21, "(519)-227 5424", 2020, 10, 2, 70000);
        Employee chris = new Employee("Chris", "Coman", 1, 14, "(519)-143 2224", 2006, 12, 6, 50000);
        Employee mohammad = new Employee("Mohammad", "Abbas", 9, 28, "(519)-294 1245", 2019, 16, 3, 80000);
        System.out.println("Company Name: " + company.getNameOfCompany());
        System.out.println("Starting year: " + company.getStartingYear());
        kevin.addEmployee(rachelle);
        kevin.addEmployee(mohammad);
        clara.addEmployee(chris);
        company.addEmployee(rachelle);
        company.addEmployee(chris);
        company.addEmployee(mohammad);
        company.addEmployee(kevin);
        company.addEmployee(clara);
        company.printManager();
        System.out.println("Employees sorted by last name: ");
        company.sortByLastName();



    }
}
