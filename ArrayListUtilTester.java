import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUtilTester{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)); // create tester array list
        System.out.println("Reversed ArrayList without being modified: " + ArrayListUtil.reverseWithoutModify(arrayList)); // prints our reversed array list without modifying original list
        System.out.println("Original arrayList: " + arrayList);
        System.out.println("----------------------------------------------------");
        ArrayListUtil.reverseWithModify(arrayList); // modifies array list to reverse elements
        System.out.println("Reversed ArrayList with modifying: " + arrayList);
    }
}