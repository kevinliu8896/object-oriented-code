// ASSIGNMENT 1 TestPerson.java
// Kevin Liu
// 105191861

public class TestPerson {

    public static void main(String[] args) {
        Person me = new Person("Kevin Liu", 19);
        Person friend = new Person("Pierre Tawfik", 1);

        System.out.println(me.getName() + " is " + me.getAge() + " years old.");
        me.needFood();
        me.isHungry();
        me.eat();
        me.walk(6);
        me.walk(2);
        me.isTired();
        me.sleep();
        me.walk(2);
        me.awake();
        me.talk("Hello Pierre");

        for (int i = 0; i < 47; i++) {
            me.grow();
        }
        System.out.println(me.getName() + " is now " + me.getAge() + " years old.");
        System.out.println(me.getName() + " walking distance capability is now " + me.getWalkingDistanceCapability() +"km");

        me.changeFriend(new Person("Pierre Tawfik", 1));
        System.out.println("\nINFORMATION ON FRIEND: \n\n");
        friend.eat();
        friend.isHungry();
        friend.needFood();
        friend.eat();
        friend.sleep();
        System.out.println(friend.getName() + " is " + friend.getAge() + " years old.");
        friend.talk("Bye Kevin.");
    }
}










