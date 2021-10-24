public class MVCPattern {
    public static void main(String [] args) {
        // fetch student record based on his roll no
        Student model = MVCPattern.retrieveStudentFromDatabase();

        // create a view: to write student details on console
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        // update model data
        controller.setStudentName("John");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        // return dummy data
        return new Student("Robert", "10");
    }
}
