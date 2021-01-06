import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person firstPerson, lastPerson;
        ArrayList<Person> personArrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 names (first name)");
        for(int i = 0; i < 10; i++) {
            Person person = new Person(in.next());
            personArrayList.add(person);
        }
        firstPerson = personArrayList.get(0); // set both first and last person to get value at index 0
        lastPerson = personArrayList.get(0);
        for(Person p : personArrayList) { // enhanced for loop to iterate through the list
            if(firstPerson.compareTo(p) > 0) { // if first persons value is greater than 0 first person is set to the value of p in the list
                firstPerson = p;
            }
            if(lastPerson.compareTo(p) < 0) { // if the last persons value is less than 0 last person is set to the value of p in the list
                lastPerson = p;
            }
        }
        in.close();//close scanner
        System.out.println("First persons is: " + firstPerson + " Last persons is: " + lastPerson); // display first and last person inn arraylist
    }
}
