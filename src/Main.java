import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Range> ranges = new ArrayList<>();
        ranges.add(new Range(10, 15));
        ranges.add(new Range(11, 16));
        ranges.add(new Range(5, 6));
        ranges.add(new Range(16, 20));
        ranges.add(new Range(15, 20));
        ranges.add(new Range(2, 18));
        ranges.add(new Range(5, 50));
        ranges.add(new Range(55, 150));
        ranges.add(new Range(-77, 3));

        List<Range> validRanges = validate(ranges);
        System.out.println(" Valid Ranges : " + "\n" + ranges.get(0) + validRanges);
    }

    private static List<Range> validate(List<Range> ranges) {

        List<Range> result = new ArrayList<>(ranges.size());
        List<Range> sub = ranges.subList(1, ranges.size());

        for (Range rng : ranges.subList(0, 1)) {
            for (Range res : sub) {
                if (res.getFrom() > rng.getTo() || res.getTo() < rng.getFrom()) {
                    result.add(res);
                }
            }
        }
        return result;
    }
}