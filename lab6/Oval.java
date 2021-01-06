public class Oval extends Shape{
    private double radiusA, radiusB;

    public Oval(double radiusA, double radiusB) {
        this.setName("Oval");
        this.radiusA = radiusA;
        this.radiusB = radiusB;
    }

    public double getRadiusA() {
        return radiusA;
    }

    public void setRadiusA(int radiusA) {
        this.radiusA = radiusA;
    }

    public double getRadiusB() {
        return radiusB;
    }

    public void setRadiusB(int radiusB) {
        this.radiusB = radiusB;
    }

    @Override
    public double area() {
        return (Math.PI*(radiusA*radiusB))/4;
    } // calculate area  of oval
    @Override
    public String toString() {
        return "Oval{" +
                "radiusA=" + radiusA +
                ", radiusB=" + radiusB +
                '}';
    }

}
