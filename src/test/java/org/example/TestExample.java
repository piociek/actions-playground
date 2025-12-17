package org.example;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestExample {
    @Test
    public void test() {
        assertThat(2).isGreaterThan(1);
    }

    @Test
    @Disabled
    public void checkEnvVariable() {
        assertThat(System.getenv("ENV_NAME")).isEqualTo("ENV_VALUE");
    }
}
