public class Student {
    // data member
    private String name;
    private String rollNo;

    // normal constructor
    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // accessor / getter
    public String getName() {
        return this.name;
    }
    public String getRollNo() {
        return this.rollNo;
    }

    // mutator / setter
    public void setName(String name) {
        this.name = name;
    }
    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }
}
