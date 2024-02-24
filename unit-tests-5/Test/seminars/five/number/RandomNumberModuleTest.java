package seminars.five.number;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomNumberModuleTest {

    @Test
    void mytest() {
        MaxNumberModule maxNumberModuleTest = new MaxNumberModule();
        RandomNumberModule randomNumberModuleTest = new RandomNumberModule();

        ArrayList<Integer> numbers = randomNumberModuleTest.numbers(10);
        Integer value = maxNumberModuleTest.maxValue(numbers);

        assertThat(value).isEqualTo(Collections.max(numbers));
    }
}