package person;

/**
 *
 * @author Alihan
 */
public class Main {
    // Main method
    public static void main(String[] args) {
        Staff staff1 = new Staff();
        staff1.setWorkload(37);
        System.out.println(staff1.computePayRoll(1));

        Teacher mathTeacher = new Teacher();
        mathTeacher.setDegree("PhD");
        System.out.println(mathTeacher.computePayRoll(100));

        // Observations

    }

    /**
     * A department has a dean, who should be a teacher of that department,
     * otherwise an exception must be
     * thrown.
     */
    public static void question1() {
        /*
         * 1) The teacher
         * Everytime we add a teacher, he should be added to a appropriate department,
         * and that department will
         * have a list of teachers. The list may be checked in loop if there is any
         * teacher who is not from that department,
         * so we can catch the wrong teacher and not put him in the department.
         * We can compare department id in two classes or the specialty and the
         * description of dep.
         * skipppp
         * for loop does not stop, should it be together with the javafx implementation?
         */
        Department maths = new Department();
        // the logic for finding not right teacher
        // if (maths.getDescription() != mathTeacher.getSpeciality()) {
        // throw new ArithmeticException("The teacher is not from this department!");
        // }
    }

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
