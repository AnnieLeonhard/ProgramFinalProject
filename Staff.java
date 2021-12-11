package person.ProgramProject;

public class Staff extends Person implements Payroll {
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
