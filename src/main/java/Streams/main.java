package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        List<Person> peoples = getPeople();

        // normal looping vs Java stream features

        List<Person> females = new ArrayList<>();

        // check female or not
        for (Person person: peoples
             ) {
            if(person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        // Declarative approch

        // Filter
        List<Person> female = peoples.stream().filter(p->p.getGender().equals(Gender.FEMALE)).
                collect(Collectors.toList());

        females.forEach(System.out::println);

        // groupBy
        Map<Gender, List<Person>> genderListMap = peoples.stream().collect(Collectors.groupingBy(Person::getGender));


    }

    private static List<Person> getPeople() {
        return List.of(
                new Person("Antonio", 20, Gender.MALE),
                new Person("Alina Smith", 33, Gender.FEMALE),
                new Person("Helen White", 57, Gender.FEMALE),
                new Person("Alex Boz", 14, Gender.MALE),
                new Person("Jamie Goa", 99, Gender.MALE),
                new Person("Anna Cook", 7, Gender.FEMALE),
                new Person("Zelda Brown", 120, Gender.FEMALE)
        );
    }
}
