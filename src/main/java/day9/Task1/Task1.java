package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("John", "Biology");
        Teacher teacher = new Teacher("Black Bob", "Anatomy");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

    }
}
