package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иван Иваныч", "Математика");
        Student student = new Student("Сидоров");

        teacher.evaluate(student);

    }
}
