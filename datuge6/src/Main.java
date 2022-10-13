import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();

        ArrayList<String> canTeach = new ArrayList<>();
        canTeach.add("Software");
        canTeach.add("Python");

        persons.add(new Teacher("Bob", new ArrayList<>()));
        persons.add(new Teacher("Torben", canTeach));

        ArrayList<String> passedCourses = new ArrayList<>();
        passedCourses.add("English");
        passedCourses.add("History");

        persons.add(new Student("Bobby", passedCourses));
        persons.add(new Student("Sille", passedCourses));
        persons.add(new Student("Bjørn", new ArrayList<>()));

        for (Person p : persons) {
            if (!p.addCourse("Java 1.0")) {
                if (p instanceof Student) {
                    System.out.println(p.getName() + " er bestået.");
                } else {
                    System.out.println(p.getName() + " er ikke kvalificeret til at underviser dette");
                }
            }
        }
    }
}