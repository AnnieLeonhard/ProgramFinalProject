package person;

/* Questions for teacher
- Do we have departmentId or semester attribute in Student?
- Is there departmentId in teacher class?
- Do all the override methods
- Do all the relations(I think its done since it has arrays of all those types)
*/

/**
 *
 * @author Alihan and Justin.
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
                .format("The Student's details: \n" + "Course: " + this.course + "\n" + "Semester: " + this.semester); // do
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
        return String.format("The Teacher's details: \n");// do
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
        return String.format("The Staff's details: \n");// do
    }
}

interface Payroll {
    public double computePayRoll(double salary);
}