public class StudentView {
    public void printStudentDetails(String name, String rollNo) {
        var $ = System.out;

        $.println("Student:-");
        $.println("\tName: " + name);
        $.println("\tRoll No: " + rollNo);
    }
}
