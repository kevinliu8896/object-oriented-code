public class Car {
    String make, model;
    int year, seats, wheels;
    String type;
    String transmission;
    double maxSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", seats=" + seats +
                ", wheels=" + wheels +
                ", type='" + type + '\'' +
                ", transmission='" + transmission + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public Car(String make, String model, int year) {
        this(make, model, year, 0, 0, "", 0, "");
    }

    public Car(String make, String model, int year, int seats, int wheels, String type, double maxSpeed, String transmission) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.seats = seats;
        this.wheels = wheels;
        this.type = type;
        this.maxSpeed = maxSpeed;
        this.transmission = transmission;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSeats() {
        return seats;
    }

    public int getWheels() {
        return wheels;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getType() {
        return type;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}
