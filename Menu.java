package person.ProgramProject;

import java.util.Scanner;

public class Menu {

    public static void addTeacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the teacher's id");
        int id = sc.nextInt();
        System.out.println("Put the teacher's name");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Put the teacher's age");
        int age = sc.nextInt();
        System.out.println("Put the teacher's gender");
        sc.nextLine();
        String gender = sc.nextLine();
        System.out.println("Put the teacher's speciality");
        sc.nextLine();
        String speciality = sc.nextLine();
        System.out.println("Put the teacher's degree");
        String degree = sc.nextLine();
        System.out.println("Put the teacher's department's id");
        int depId = sc.nextInt();
        Teacher teacher = new Teacher(id, name, age, gender, speciality, degree);
        try {
            for (Department d : Main.getDeptList()) {
                if (d.getId() == depId) {
                    d.getTeacherList().add(teacher);
                } else {
                    throw new Exception();
                }
            }
        } catch (Exception ex) {
            System.out.println("Did not find teacher with such department");
            ex.printStackTrace();
        }
    }
}
