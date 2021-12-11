package person;

/**
 *
 * @author Alihan Djamankulov, Craig Justin Balibalos
 */
public class Main {
    // Main method
    public static void main(String[] args) {
        // Staff staff1 = new Staff();
        // staff1.setWorkload(37);
        // System.out.println(staff1.computePayRoll(1));

        Teacher mathTeacher = new Teacher(12, "Aloi", 12, "m", "bobo Science", "PHD");
        // System.out.println(mathTeacher.computePayRoll(100));

        Department dep1 = new Department(123, "Computer Science", mathTeacher);
        dep1.setDean(mathTeacher);
        // Observations

    }

    /**
     * A department has a dean, who should be a teacher of that department,
     * otherwise an exception must be
     * thrown. Check Department class' setDean method
     */
    public static void question1() {
        // Check Department class' setDean method
        // throw new ArithmeticException("The teacher is not from this department!");
    }

    // So when adding a teacher as dean, we should check if he is even from that
    // department
    // public boolean assignDean(ArrayList<depart>arr, Teacher t){
    // for(Depart d: Arr){
    // if(d.Teacher.contains(t)){
    // d.setDean(t);
    // }
    // else
    // {
    // Label.setText("Teacher not in department");
    // }
    // }

    /**
     * Teachers, students, and staffs are added/assigned to a department, first by
     * loading/reading from a text
     * file during the first execution of the application. Moreover, new teachers,
     * students, and staff may be
     * added/assigned using the graphical user interface.
     */
    public static void question2() {
        // idk - check solution in stackoverflow(Scanner)
    }

    /**
     * - Trying to add a teacher, a student, or a staff member to an inexistent
     * department (based on department
     * id) should rise/throw an exception.
     */
    public static void question3() {
        // how we should check that in real time?
    }

    /**
     * - Trying to add a teacher, a student, or a staff member that already exists/
     * added (based on the id) to
     * department should throw an exception.
     */
    public static void question4() {

    }

    /**
     * - Each new teacher, student, and staff added to a department should be stored
     * to the text file before
     * exiting the application, generating a new version of the text file. So, if
     * the text file does exist (which is the
     * case), new teachers, students, or staffs should be appended. There are files
     * of teachers, students, and
     * staffs.
     */
    public static void question5() {

    }

    /**
     * - The customized exceptions handling for the cases above must be implemented.
     */
    public static void question6() {

    }

    /**
     * - Test sets should be generated for testing the effectiveness of each method.
     */
    public static void question7() {

    }

    /**
     * - Samples of teachers, staffs, and students are provided along with the
     * present document.
     */
    public static void question8() {

    }

}
