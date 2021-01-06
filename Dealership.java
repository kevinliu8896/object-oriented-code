import java.util.ArrayList;

public class Dealership {
    private int employee;
//    private Array manager;
    private String name;
    private String location;
    private int cars;
    ArrayList<Car> c = new ArrayList<Car>();
    ArrayList<String> managers = new ArrayList<>();
    ArrayList<String> employees = new ArrayList<>();

    public Dealership(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void createCar(String make, String model, int year, int seats, int wheels, String type, double maxSpeed, String transmission) {
        c.add(new Car(make, model, year, seats, wheels, type, maxSpeed, transmission));

    }

    public void createCar(String make, String model, int year) {
        c.add(new Car(make, model, year));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public ArrayList<Car> getC() {
        return c;
    }

    public int getEmployee() {
        return employee;
    }

    public ArrayList<String> getManager() {
        return managers;
    }

    public int getCars() {
        return cars;
    }

    public void setEmployee(int employee) {
        this.employee = employee;
    }

    public void setManager(String manager) {
        this.managers = managers;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }
}
