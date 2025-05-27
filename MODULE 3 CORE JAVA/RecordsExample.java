import java.util.List;
import java.util.stream.Collectors;
public class RecordsExample {
    record Person(String name, int age) {}
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 25),
                new Person("Bob", 35),
                new Person("Charlie", 30)
        );
        System.out.println("All people: " + people);

        // Filtering people based on age
        List<Person> filteredPeople = people.stream()
                .filter(person -> person.age > 30)
                .collect(Collectors.toList());
        System.out.println("People older than 30: " + filteredPeople);
    }
}

