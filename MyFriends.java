import java.util.ArrayList;
public class MyFriends {
    public static void main(String[] args) {
        FriendsList fList = new FriendsList();

        Person kevin = new Person("Kevin", "Liu", 9,27, "(519)-980 8896");
        Person rachelle = new Person("Rachelle", "Tiessen", 8,27, "(519)-980 8896");
        Person chris = new Person("Chris", "Coman", 1,21, "(519)-982 0840");
        Person clara = new Person("Clara", "Mouawad", 3,2, "(226)-202 2504");
        Person shane = new Person("Shane", "Bob", 3, 25, "(226)-234 9348");
        Person shane2 = new Person("Shane", "Abbas", 3, 25, "(226)-234 9111");
        fList.addFriend(kevin);
        fList.addFriend(rachelle);
        fList.addFriend(chris);
        fList.addFriend(clara);
        fList.addFriend(shane);
        fList.addFriend(shane2);
        System.out.println("Current Friends List: ");
        fList.printFriends();
        System.out.println("You have " + fList.totalFriends() + " friends currently.");
        System.out.println("Friends List sorted by last name: ");
        System.out.println(fList.sortByLastName());
        System.out.println("Friends List sorted by day");
        System.out.println(fList.sortBySameDayOfBirth(27));
        System.out.println("Friends List sorted by month: ");
        System.out.println(fList.sortBySameBirthMonth(3));
        fList.modifyFriend(shane,"Shane", "Bob", 4, 2,"(226)-123 1234");
        fList.deleteFriend(kevin);
        System.out.println("Friend has been deleted!");
        System.out.println("Phone number is: ");
        fList.phoneNum("Chris", "Coman");
        System.out.println(fList.getFriends());
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("COPY OF FRIEND LIST:");
        FriendsList copyOfFList = fList;
        System.out.println(copyOfFList.getFriends());
        fList.deleteByFirstName("Shane"); // deleted all friends starting with Shane as first name
        System.out.println("Updated friends list: ");
        System.out.println(copyOfFList.getFriends());
    }
}


