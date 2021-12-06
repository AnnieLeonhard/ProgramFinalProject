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

    public static void question1() {
        /*
         * 1) Teacher speciality = Department if not exception thrown
         * how it should be checked?
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
                        
    public static void question2() {

    }
}
