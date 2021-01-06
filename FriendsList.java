import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class FriendsList {
    private ArrayList<Person> friends;

    public FriendsList() {
        friends = new ArrayList<>();
    }

    public void addFriend(Person p) {
        friends.add(p);
    }

    public void deleteFriend(Person p) {
        friends.remove(p);
    }

    public void deleteByFirstName(String firstName) {
        friends.removeIf(p -> p.getFirstName().equals(firstName));
    }

    public ArrayList<Person> sortByLastName() { // sort by last name using Collections.sort
        Collections.sort(friends, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().toLowerCase().compareTo(o2.getLastName().toLowerCase());
            }
        });
        return friends;
    }

    public ArrayList<Person> sortBySameDayOfBirth(int day) { // sort by same date of birth
        ArrayList<Person> bornSameDay = new ArrayList<>();
        for (Person person : friends) {
            if (person.getDay() == day) { // if person has same day add to array list
                bornSameDay.add(person);
            }
        }
        Collections.sort(bornSameDay, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });
        return bornSameDay;
    }

    public ArrayList<Person> sortBySameBirthMonth(int month) { // sort by birth month
        ArrayList<Person> bornSameMonth = new ArrayList<>();
        for (Person person : friends) {
            if (person.getMonth() == month) { // if person has same month add to array list
                bornSameMonth.add(person);
            }
        }
        Collections.sort(bornSameMonth, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getDay() - o2.getMonth();
            }
        });
        return bornSameMonth;

    }

    public void modifyFriend(Person p, String firstName, String lastName, int month, int day, String phoneNum) {
        for (Person person : friends) {
            if (person == p) { // modifies person info
                person.setFirstName(firstName);
                person.setLastName(lastName);
                person.setMonth(month);
                person.setDay(day);
                person.setPhoneNum(phoneNum);
            }
        }
        System.out.println("Friends List has been modified.");
        System.out.println("------------------------------------------------------------------------------------------");
        System.out.println(friends);
    }

    public int totalFriends() {
        return friends.size();
    }

    public ArrayList<Person> getFriends() {
        return friends;
    }

    public void printFriends() { // function to print friends in tester
        for (Person person : friends) {
            System.out.println(person);
        }
    }

    public void phoneNum(String firstName, String lastName) {
        for (Person person : friends) {
            if (person.getFirstName().equalsIgnoreCase(firstName) && person.getLastName().equalsIgnoreCase(lastName)) {
                System.out.println(person.getPhoneNum());
            }
        }
    }
}
