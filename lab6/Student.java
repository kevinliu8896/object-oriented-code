public class Student extends Person{
    private String programName, programLevel;
    private int year;

    public Student(String name, String gender, int age, String programName, String programLevel, int year) {
        super(name,gender,age);
        this.programName = programName;
        this.programLevel = programLevel;
        this.year = year;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getProgramLevel() {
        return programLevel;
    }

    public void setProgramLevel(String programLevel) {
        this.programLevel = programLevel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
