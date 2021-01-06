import java.util.Objects;

public class Pair <T , S> {
    private T first;
    private S second;

    // constructors

    public Pair() {

    }

    public Pair(T first, S second) {
        setFirst(first);
        setSecond(second);
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    // override toString and equals method
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass()!=obj.getClass()){
            return false;
        }
        Pair<?,?> pair = (Pair<?,?>) obj;
        return Objects.equals(first, pair.first) && Objects.equals(second, pair.second);
    }

    @Override
    public String toString() {
        return "Word: " + first + ", Synonyms: " + second;
    }
}
