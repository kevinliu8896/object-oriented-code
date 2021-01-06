// ASSIGNMENT 1 Microwave.java
// Kevin Liu
// 105191861

public class Microwave { // created class called Microwave
    private int time; // private int called time
    private String powerLvl; // private int powerLvl to keep track of low,medium,or high power level coming from the microwave

    public Microwave() { // set initial values for time and powerLvl
        time = 0;
        powerLvl = "";
    }
    public void increaseTime() {
        time += 30;
    } //function created to increase the time by 30 seconds each time

    public void powerLvl(String lvl) {



        if (lvl.equals("low") || lvl.equals("medium")|| lvl.equals("high")) { // create if statement for different power levels of the microwave
            switch (lvl) { // create switch statement and different cases to set the power levels when input into the TestMicrowave class
                case "low": powerLvl = "Low";
                    break;
                case "medium":powerLvl = "Medium";
                    break;
                case "high":powerLvl = "High";
                    break; // break
            } // end oif switch
        } // end of if statement
        else { // else
            System.out.println("Invalid Input try again please."); // displays to the user that there is an invalid input

        } // end of else



    }
    // when microwave has started display message to user saying "Cooking has started, the time (in seconds) and the power level(low,medium,or high)"
    public void start() {
        System.out.println("Cooking has started. \nCooking for "+time +" seconds.\nThe current power level is " +powerLvl);

    }

    // this is to stop the microwave to display to the user that the cooking has stopped and set the time back to 0 seconds
    public void stop() {
        System.out.println("Cooking has stopped");
        powerLvl = "";
        time = 0;

    }

    // reset is used to tell user that microwave is turning off and resetting the time to 0 seconds again.
    public void reset() {
        System.out.println("Turning microwave off");
        time = 0;


    }

} // end of class Microwave.




