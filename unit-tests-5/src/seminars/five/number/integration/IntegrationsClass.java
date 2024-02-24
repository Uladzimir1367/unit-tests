package seminars.five.number.integration;

import org.junit.jupiter.api.Test;
import seminars.five.number.MaxNumberModule;
import seminars.five.number.RandomNumberModule;

import java.util.ArrayList;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationsClass {
    private RandomNumberModule randomNumberModuleTest;
    private MaxNumberModule maxNumberModuleTest;

    @Test
    void mytest(){
        MaxNumberModule maxNumberModule = new MaxNumberModule();
        RandomNumberModule randomNumberModule = new RandomNumberModule();

        ArrayList<Integer> numbers = randomNumberModuleTest.numbers(10);
        Integer value = maxNumberModuleTest.maxValue(numbers);

        assertThat(value).isEqualTo(Collections.max(numbers));
    }
}
