package person.ProgramProject;

public class Student extends Person {
    private String course;
    private int semester;

    Student(int id, String name, int age, String gender, String course, int semester) {
        super(id, name, age, gender);
        this.course = course;
        this.semester = semester;
    }

    // getters
    public String getCourse() {
        return this.course;
    };

    public int getSemester() {
        return this.semester;
    }

    // setters
    public void setCourse(String course) {
        this.course = course;
    };

    public void setSemester(int semester) {
        this.semester = semester;
    };

    @Override
    public String toString() {
        return String
                .format("The Student's details: \nStudentId: %d\n"
                        + "StudentName: %s\n"
                        + "StudentAge: %d\n"
                        + "StudentCourse: %s\n"
                        + "StudentSemester: %d", getId(), getName(), getAge(), getCourse(), getSemester()); // do
    }
}
