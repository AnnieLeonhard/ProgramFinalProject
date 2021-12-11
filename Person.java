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

interface Payroll {
    public double computePayRoll(double salary);
}