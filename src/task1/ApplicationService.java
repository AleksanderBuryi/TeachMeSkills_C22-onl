package task1;

import java.util.*;
import java.util.stream.Stream;

public class ApplicationService {
    private final List<Integer> data = createRandomNumsList();

    public void showSource() {
        System.out.println(data);
    }

    public void deleteDuplicates() {
        System.out.println(data.stream()
                        .distinct()
                        .toList()
        );
    }

    public void getEvenNumbers() {
        List<Integer> result = data.stream()
                .filter(i -> i >= 7  && i <= 17)
                .filter(i -> i % 2 == 0)
                .toList();
        System.out.println(result);
    }

    public void multiply() {
        System.out.println(data.stream()
                .map(i -> i * 2)
                .toList()
        );
    }

    public void sortAndShow4Elements() {
        System.out.println(
                    data.stream()
                        .sorted()
                        .limit(4)
                        .toList()
        );
    }

    public void getAmountOfElements() {
        System.out.println(data.stream().count());
    }

    public void getAverage() {
        System.out.println(
                data.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .getAsDouble()
        );
    }

    private List<Integer> createRandomNumsList() {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 50; i++) {
            nums.add(random.nextInt(100));
        }

        return nums;
    }
}
