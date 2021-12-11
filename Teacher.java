package person.ProgramProject;

public class Teacher extends Person implements Payroll {
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
