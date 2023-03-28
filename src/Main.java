import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Denis", "Fedorov", 14));
        persons.add(new Person("Natalia", "Bocharova", 63));
        persons.add(new Person("Vadim", "Momot", 45));
        persons.add(new Person("Dima", "Mohkov", 47));
        persons.add(new Person("Oksana", "Fedorenko", 17));
        System.out.println(persons);

        persons.removeIf(person -> person.getAge() < 18);
        persons.forEach(System.out::println);
    }
}