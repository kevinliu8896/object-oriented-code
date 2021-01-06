// ASSIGNMENT 1 Person.java
// Kevin Liu
// 105191861


public class Person { // class called Person
    private String name;
    private int age;
    private int walkingDistance;
    private int walkingDistanceCapability;
    private boolean isHungry;
    private boolean isAwake;
    private boolean isTired;
    private Person friend;


    public Person(String name, int age) { // create constructor for Person and initialize variables
        this.name = name;
        this.age = age;
        walkingDistance = 0;
        walkingDistanceCapability = 4;
        isHungry = false;
        isAwake = true;
        isTired = false;
    }

    public String getName() { // getter to getName
        return name;
    }

    public int getAge() { //getter to getAge
        return age;
    }

    public int getWalkingDistance() { // getter for walking distance
        return walkingDistance;
    }

    public int getWalkingDistanceCapability() { // getter for walkingDistanceCapability
        return walkingDistanceCapability;
    }

    public boolean isHungry() { //return status of isHungry
        return isHungry;
    }

    public boolean isAwake() { // return status of isAwake
        return isAwake;
    }

    public boolean isTired() { // return status of isTired
        return isTired;
    }


    public Person getFriend() { // getter to getFriend from Person
        return this.friend;
    }

    public void talk(String talk) { // function to check if person can talk
        if (age >= 2)
            System.out.println(name + " says: " + talk);
        else
            System.out.println(name + " must be older than 2 to talk.");
    }

    public void eat() { // function to check if person can eat
        if (isHungry) {
            isHungry = false;
            System.out.println(name + " is now full.");

        } else {
            System.out.println(name + " is full they do not need to eat.");
        }
    }

    public void needFood() { // function to check if person needs to eat
        isHungry = true;
        System.out.println(name + " is hungry go eat some food.");


    }

    public void awake() { // function to check if person is awake
        if (!isAwake) {
            isAwake = true;
            System.out.println(name+" is waking up.");
        }
        else {

            System.out.println(name+" is already awake.");

        }
    }

    public void sleep() { // function to check if person is asleep
        if (isAwake) {
            isTired = false;
            isAwake = false;
            walkingDistance = 0; // set walkingDistance to 0 km
            System.out.println(name +" is going to sleep");
        }
        else {
            System.out.println(name + " is asleep.");
        }
    }

    public void grow(){ // function to grow the person and reduce their walkingDistanceCapability/2 every 5 years past 55
        age += 1;
        if (age > 55 && age % 5 == 0){
            walkingDistanceCapability/=2;

        }
    }

    public void changeFriend(Person newPerson){ // function to change friend
        friend = newPerson;
        System.out.println(name + " has a friend and their name is " + friend.getName());
    }

    public void walk(double kmWalked){ // function to show if person can walk during their sleep, or after their walk

        if(walkingDistanceCapability > 0){
            if(!isAwake){
                System.out.println(name + " is asleep they can't walk");
            }
            else if(!isTired){
                walkingDistance += kmWalked;
                if(walkingDistance < walkingDistanceCapability){

                    System.out.println(name + " has walked " + kmWalked + "km");
                }
                else {
                    isTired = true;
                    System.out.println(name + " has walked " + kmWalked + "km they are now tired");

                }
            }
            else {
                System.out.println(name + " is too tired they can't walk");
            }
        }
        else {
            System.out.println(name + " is too tired they can't walk");
        }
    }

    public int calculateDistanceCapability(int age) { //calculates the distance the person can walk depending on their age
        int tempMaxDist = 4; // create temp var and store 4 km in it
        if (age > 55) { // if the age surpasses 55 execute the code
            for (int x = 60; x <= age; x++) {
                if (x % 5 == 0) {
                    tempMaxDist = tempMaxDist / 2; // divide tempMaxDist by 2

                }
            }
        }
        return tempMaxDist; // return temp variable
    }



}