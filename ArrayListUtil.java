import java.util.ArrayList;

public class ArrayListUtil {

    public static <E> void reverseWithModify(ArrayList<E> arrayList) {
        for(int i = 0; i < arrayList.size() / 2; i++) {
            E temp = arrayList.get(i); // store current value of array list at index i into temp
            arrayList.set(i, arrayList.get(arrayList.size() - (i + 1))); // set opposite value to the value at i
            arrayList.set(arrayList.size() - (i + 1), temp); // set opposite position to value of temp
        }
    }

    public static <E> ArrayList<E> reverseWithoutModify(ArrayList<E> arrayList) { // reversing an array list
        ArrayList<E> reversedArrayList = new ArrayList<>(); // create array list for reversing
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedArrayList.add(arrayList.get(i)); // add last element as the first element into the newly created reversedArrayList ex: last element of arrayList will become first element of reversedArrayList etc.
        }
        return reversedArrayList; // return reversedArrayList
    }
}
