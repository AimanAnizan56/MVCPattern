public class StudentController {
    // data member
    private Student model;
    private StudentView view;

    // copy constructor
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    // accessor / getter
    public String getStudentName() {
        return model.getName();
    }
    public String getStudentRollNo() {
        return model.getRollNo();
    }

    // mutator / setter
    public void setStudentName(String name) {
        model.setName(name);
    }
    public void setStudentRollNo(String rollNo) {
        model.setRollNo(rollNo);
    }

    // Update view
    public void updateView() {
        view.printStudentDetails(model.getName(), model.getRollNo());
    }
}
