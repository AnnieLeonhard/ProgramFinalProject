package person;

import java.util.ArrayList;

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

    public Department(){}

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
        this.dean = dean;
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

    @Override
    public String toString() {
        return String.format("Department's name:"); // do
    }
}