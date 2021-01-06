import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Polynomial {
    Map<Integer, Integer> poly;
    private int coefficient;
    private int pow;
    private int degree;

    public Polynomial() { // deafault constructor
        poly = new TreeMap<>(Collections.reverseOrder());
    }

    public Polynomial(int coefficient, int pow) { // second constructor
        this.coefficient = coefficient;
        this.pow = pow;
        poly.put(coefficient, pow);
    }

    public void add(Polynomial p) {
        int temp_coefficient;
        try { // try catch claus to throw exception
            for (Integer key : poly.keySet()) {
                if (key == p.pow) {
                    temp_coefficient = poly.get(key);
                    poly.put(p.degree, p.coefficient + temp_coefficient);
                } else {
                    poly.put(p.degree, p.coefficient);
                }

                if (key < 0) {
                    throw new IllegalArgumentException();
                }
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void subtract(Polynomial p) {
        for(Map.Entry<Integer, Integer> entry : p.getPoly().entrySet()) {
            p.getPoly().put(entry.getKey(), entry.getValue() * -1);
        }
        add(p);
    }


    public Map<Integer, Integer> getPoly() {
        return poly;
    }

    public void setPoly(Map<Integer, Integer> poly) {
        this.poly = poly;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(int coefficient) {
        this.coefficient = coefficient;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }

    public int getPow() {
        return pow;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }
}
