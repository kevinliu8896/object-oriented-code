import java.util.ArrayList;

public class carDealershipTester {
    public static void main(String[] args) {
        Dealership deal = new Dealership("Windsor Chrysler", "Windsor, ON");
        Car car = new Car("Lexus", "RC350", 5, 2021, 4, "Sedan", 240.0, "6 speed automatic");
        Car car2 = new Car("Mercedes-Benz", "GLS", 2016, 5, 4, "SUV", 270.0, "9 speed automatic");
        System.out.println("Dealership: " + deal.getName() + " and is located in " + deal.getLocation());
        ArrayList<String> manager = new ArrayList<String>();
        manager.add("Kevin");
        manager.add("Pierre");
        manager.add("Chris");
        ArrayList<String> employee = new ArrayList<String>();
        employee.add("Josh");
        employee.add("Matthew");
        employee.add("Hadi");
        employee.add("Adrian");
        employee.add("Kyrel");
        employee.add("Moe");

        ArrayList<Car> c = new ArrayList<Car>();
        c.add(car);
        c.add(car);


        System.out.print("Managers: ");
        System.out.println(manager);

        System.out.print("Employees: ");
        System.out.println(employee);

        System.out.print("Cars Available: ");
        System.out.println(c);

        System.out.println("Thanks for stopping by the dealership :)");

    }
}
