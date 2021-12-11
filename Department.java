package person;

import java.util.ArrayList;

/**
 * @author Alihan Djamankulov, Craig Justin Balibalos
 */
public class Department {
    private int id;
    private String description;
    private Teacher dean;

    // Fake database
    private static ArrayList<Teacher> TeacherList = new ArrayList<Teacher>();
    private static ArrayList<Student> StudentList = new ArrayList<Student>();
    private static ArrayList<Staff> StaffList = new ArrayList<Staff>();

    public Department(int id, String description, Teacher dean) {
        this.id = id;
        this.description = description;
        this.dean = dean;
    }

    public Department() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Teacher getDean() {
        return dean;
    }

    public void setDean(Teacher dean) {
        try{
            if(dean.getSpeciality() != this.getDescription()){
                throw new Exception();
            }else{
                this.dean = dean;
                System.out.println("Successfully added a dean\n" 
                + this.dean);
            }
        } catch(Exception ex){
            System.out.println("The teacher to be assigned as a dean is not from this department.\n"
            + "Please find a teacher that is from this department");
        }
    }

    public static ArrayList<Teacher> getTeacherList() {
        return TeacherList;
    }

    public static void setTeacherList(ArrayList<Teacher> teacherList) {
        TeacherList = teacherList;
    }

    public static ArrayList<Student> getStudentList() {
        return StudentList;
    }

    public static void setStudentList(ArrayList<Student> studentList) {
        StudentList = studentList;
    }

    public static ArrayList<Staff> getStaffList() {
        return StaffList;
    }

    public static void setStaffList(ArrayList<Staff> staffList) {
        StaffList = staffList;
    }

    /**
     * I dont know how to print the dean for the department
     */
    @Override
    public String toString() {
        // String s = getDean().toString();
        return String.format("Department's id: " + "%d\n"
                + "Department's description: %s\n", getId(), getDescription());
        // return String.format(s);
    }
}