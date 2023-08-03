package task2;

import java.util.Arrays;
import java.util.List;

public class ApplicationService {

    private final List<String> data = Arrays.asList(
            "Aleksandr", "Artem", "Alena", "Ivan",
            "Irina", "Nicholas",  "Dima", "Ilya",
            "Simon", "Victor", "Danik", "Kir",
            "Arseny", "Nastya"
    );

    public void showSource() {
        System.out.println(data);
    }

    public void countStudentsWithSameName() {
        System.out.print("Count students with name \"Aleksandr\": ");
        System.out.println(
                data.stream()
                        .filter(s -> s.equalsIgnoreCase("Aleksandr"))
                        .count()
        );
    }

    public void namesStartWith() {
        System.out.println("Names start with \"a\" or \"A\": ");
        System.out.println(
                data.stream()
                    .filter(s -> s.toLowerCase().startsWith("a"))
                    .toList()
        );
    }

    public void sort() {
        System.out.println(
                data.stream()
                    .sorted()
                    .findFirst()
                    .orElse("Empty")
        );
    }
}
