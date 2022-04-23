package day6;

import java.util.Random;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){

        Random rand = new Random();

        int score = rand.nextInt(4)+2;
        String textScore = "";

        switch (score){
            case 5: textScore = "отлично";
                break;
            case 4: textScore = "хорошо";
                break;
            case 3: textScore = "удовлетворительно";
                break;
            case 2: textScore = "неудовлетворительно";
                break;
        }

        System.out.println("Преподаватель " + this.name
                + " оценил студента с именем " + student.getName()
                + " по предмету " + this.subject + " на оценку " + textScore + ".");

    }

}
