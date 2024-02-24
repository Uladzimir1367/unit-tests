package seminars.five.number;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumberModule {
    public ArrayList<Integer> numbers(int count) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            list.add(random.nextInt(10));
        }
        return list;
    }
}
