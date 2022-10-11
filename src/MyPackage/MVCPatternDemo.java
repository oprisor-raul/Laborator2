package MyPackage;
import java.util.Scanner;

public class MVCPatternDemo {
    public static void main(String[] args) {

        //fetch student record based on his roll no from the database

        System.out.println("Enter the number of courses:");
        Scanner keyboard = new Scanner(System.in);
        int numberOfCourse = keyboard.nextInt();
        Course[] models = new Course[numberOfCourse];

        for (int i=0; i<numberOfCourse; i++) {
            models[i] = retriveCourseFromUser();
        }

        //Create a view : to write course details on console

        for (int i=0; i<numberOfCourse; i++) {
            CourseView view = new CourseView();
            CourseController controller = new CourseController(models[i], view);
            controller.updateView();
            System.out.println();
        }

        //update model data
        for (int i=0; i<numberOfCourse; i++) {
            CourseView view = new CourseView();
            CourseController controller = new CourseController(models[i], view);
            controller.setCourseDifficulty("Easy");
            System.out.println ("\nAfter updating, Course Details are as follows");
            controller.updateView();
        }
    }

    private static Course retriveCourseFromUser(){
        Scanner keyboard = new Scanner(System.in);
        Course course = new Course();
        System.out.println("Input name:");
        String name = keyboard.next();
        course.setName(name);
        System.out.println("Input ID:");
        String iD = keyboard.next();
        course.setId(iD);
        System.out.println("Input Course Difficulty:");
        String difficulty = keyboard.next();
        course.setDifficulty(difficulty);
        System.out.println("\n");
        return course;

    }
}