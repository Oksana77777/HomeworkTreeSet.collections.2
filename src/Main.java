import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Denis", "Fedorov", 14));
        persons.add(new Person("Natalia", "Bocharova", 63));
        persons.add(new Person("Vadim", "Momot", 45));
        persons.add(new Person("Dima", "Mohkov", 17));
        System.out.println(persons);

        Collections.sort(persons, (o1, o2) -> {
            int length1 = o1.getSurname().split("-").length;
            int length2 = o2.getSurname().split("-").length;
            if (length1 < length2) {
                return -1;
            }
            if (length1 > length2) {
                return 1;
            }
            return o1.getAge() - o2.getAge();
        });

        persons.forEach(System.out::println);
    }
}