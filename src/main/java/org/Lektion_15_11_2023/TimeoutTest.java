package org.Lektion_15_11_2023;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

public class TimeoutTest {

    @Test
    public void testTimeout() {
        assertTimeout(Duration.ofMillis(1), () -> {

            for (int i = 0; i < 10000000; i++) {
                int a = 1+10;
            }

        });
    }
}
