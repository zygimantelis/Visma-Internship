import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberProcessor {
    private final List<Integer> numbers = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public int calculateSum() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public float calculateSumDividedByWeekday() {
        int dayOfWeek = LocalDate.now().getDayOfWeek().getValue();

        return (float) calculateSum() / dayOfWeek;
    }
}
