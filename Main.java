package person;
import java.io.*;

/**
 *
 * @author Alihan Djamankulov, Craig Justin Balibalos
 */
public class Main {
    // Main method
    public static void main(String[] args) {

        // Observations
        // question1();
        
        question2();
    }

    public static void initDepartments(){
        Department computerVision = new Department();
        computerVision.setDescription("computer vision");
        Department preHistory = new Department();
        preHistory.setDescription("pre-history");
        Department topology = new Department();
        topology.setDescription("topology");
        Department microEconomy = new Department();
        microEconomy.setDescription("micro economy");
        Department computerScience = new Department();
        computerScience.setDescription("computer science");
        Department maths = new Department();
        maths.setDescription("mathematic");
        Department physics = new Department();
        physics.setDescription("Physics");
        Department history = new Department();
        history.setDescription("History");
        Department computerVision = new Department();
        computerVision.setDescription("computer vision");
    }

    /**
     * A department has a dean, who should be a teacher of that department,
     * otherwise an exception must be
     * thrown. Check Department class' setDean method
     */
    public static void question1() {
        // Check Department class' setDean method
        Teacher mathTeacher = new Teacher(12, "Aloi", 12, "m", "bobo Science", "PHD");
        Department dep1 = new Department(123, "Computer Science", mathTeacher);
        dep1.setDean(mathTeacher);
    }

    /**
     * Teachers, students, and staffs are added/assigned to a department, first by
     * loading/reading from a text
     * file during the first execution of the application. Moreover, new teachers,
     * students, and staff may be
     * added/assigned using the graphical user interface.
     */
    public static void question2() {
        //Staff loading
        try{
            File staffPath = new File("C:\\Vanier21-22\\Programming\\FinalProject\\Staff.txt");
            BufferedReader staffRead = new BufferedReader(new FileReader(staffPath));
            System.out.println("Found the file");
            while(staffRead.readLine() != null){
                
            }
        }catch(Exception ex){
            System.out.println("Did not found the file");
            ex.printStackTrace();
        }

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
