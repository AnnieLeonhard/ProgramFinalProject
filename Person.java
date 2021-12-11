package person;

/* Questions for teacher
- Do we have departmentId in Student? We have to add the depIds when adding a student to a department
- Is there departmentId in teacher class? There is, same thing as student
*/

/**
 *
 * @author Alihan Djamankulov, Craig Justin Balibalos
 *         The person class
 */
public abstract class Person {
    private int id;
    private String name;
    private int age;
    private String gender;

    Person() {
    }

    Person(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String toString() {
        return String.format("I am a person");
    }
}

class Student extends Person {
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

class Teacher extends Person implements Payroll {

    private String speciality;
    private String degree;

    Teacher() {
    }

    Teacher(int id, String name, int age, String gender, String speciality, String degree) {
        super(id, name, age, gender);
        this.speciality = speciality;
        this.degree = degree;
    }

    // getters

    public String getDegree() {
        return this.degree;
    }

    public String getSpeciality() {
        return speciality;
    }

    // setters

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double computePayRoll(double salary) {
        double saldegree = 0;
        if (degree == "PhD")
            saldegree = 112;
        else if (degree == "Master")
            saldegree = 82;
        else
            saldegree = 42;
        salary = (36 * saldegree * 2) * 0.76;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("The Teacher's details: \n"
                + "TeacherId: %d\n"
                + "TeacherName: %s\n"
                + "TeacherAge: %d\n"
                + "TeacherSpeciality: %s\n"
                + "TeacherDegree: %s", getId(), getName(), getAge(), getSpeciality(), getDegree());// do
    }

}

class Staff extends Person implements Payroll {
    private String duty;
    private int workload;

    public Staff(int id, String name, int age, String gender, String duty, int workload) {
        super(id, name, age, gender);
    }

    public Staff() {
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    public double computePayRoll(double salary) {
        if (workload > 36) {
            System.out.println("The working hours are exceeded");
            return 0;
        }
        salary = (workload * 32 * 2) * 0.85;
        return salary;
    }

    @Override
    public String toString() {
        return String.format("The Staff's details: \n"
                + "StaffId: %d\n"
                + "StaffName: %s\n"
                + "StaffAge: %d\n"
                + "StaffDuty: %s\n"
                + "StaffWorkload: %d", getId(), getName(), getAge(), getDuty(), getWorkload());
    }
}

interface Payroll {
    public double computePayRoll(double salary);
}

// You have to firstly create department and then people like teachers, students
// If there are no people, ask user to load department first by message

// question with department_id in student: adding a student from the file given
// to a appropriate department
// we split the info from a file to 4 different objects and put them in
// arraylist
// String s = line.split(;);
// s[0] = id
// s[1] = name
// s[2] = age
// s[3] = department.id

// 1 method for adding a student to department
// finding a student in the deptList -> studentList of specific department,
// which is found by id
// loop creating a student
// for(depart d: deptList){ d is the department name
// if(d.getId()==s[3]){ if we find department with the same id as student depId
// -> s[3],then we add the student to the student list of the department.
// d.stdList.add(new Student(s[0], s[1], s[2]);
// }
// }

// this method is more general than the last one. use either this either the
// other one
// assigning student with department id, what is Arrd?
// public boolean assignStudent(ArrayList<Depart>Arrd, Student s , int id
// (values from s[3])){
// for( Department d: Arrd){
// if(d.getId() == id){
// d.StudentList.add(s);
// return true;
// }
// return false;
// }
// }

// javafx message
// if(assign Student){
// Label.setText("Student successfully added"); Label from javafx
// }
// else {label.setText("Student not added");
// }