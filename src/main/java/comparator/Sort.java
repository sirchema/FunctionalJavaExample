package comparator;

import model.Person;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Chema", "Sara", "Pablo", "Vega");

        System.out.println("List before sorting: " + names);

        Collections.sort(names);

        System.out.println("List after sorting: " + names);

        List<Person> listPeople = new ArrayList<>();
        listPeople.add(new Person(1, "Chema"));
        listPeople.add(new Person(3,"Vega"));
        listPeople.add(new Person(4, "Sara"));
        listPeople.add(new Person(2, "Pablo"));

        System.out.println("People list without sorting: " + listPeople);

        Collections.sort(listPeople);

        System.out.println("People list sorting by name: " + listPeople);

        /*
        Collections.sort(listPeople, new SortingPersonById());
        Collections.sort(listPeople, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getId() - o2.getId();
            }
        });

         */
        Collections.sort(listPeople, (p1, p2) -> p1.getId() - p2.getId());

        System.out.println("People list sorting by id: " + listPeople);
    }
}
