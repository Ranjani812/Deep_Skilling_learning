public class MVCTest {
    public static void main(String[] args) {
        Student student = new Student("Ranjani", "22CS101", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();
        controller.setStudentGrade("A+");
        controller.setStudentName("Ranjani CT");
        controller.updateView();
    }
}

