package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @Test
    public void shouldSetMaxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(30);
        assertEquals(30, conditioner.getMaxTemperature());
    }

    @Test
    public void shouldSetMinTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(15);
        assertEquals(15, conditioner.getMinTemperature());
    }

    @Test
    public void shouldCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setCurrentTemperature(20);
        assertEquals(20, conditioner.getCurrentTemperature());
    }


    @Test
    public void shouldDecreaseTemperatureToMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.decreaseCurrentTemperature(); // 20~19
        conditioner.decreaseCurrentTemperature(); // 19~18
        conditioner.decreaseCurrentTemperature(); // 18~17
        conditioner.decreaseCurrentTemperature(); // 17~16
        conditioner.decreaseCurrentTemperature(); // 16~15

    int actual = conditioner.getCurrentTemperature();
    assertEquals(15, actual);
}
    @Test
    public void shouldIncreaseTemperatureToMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.increaseCurrentTemperature(); // 20~21
        conditioner.increaseCurrentTemperature(); // 21~22
        conditioner.increaseCurrentTemperature(); // 22~23
        conditioner.increaseCurrentTemperature(); // 23~24
        conditioner.increaseCurrentTemperature(); // 24~25
        conditioner.increaseCurrentTemperature(); // 25~26
        conditioner.increaseCurrentTemperature(); // 26~27
        conditioner.increaseCurrentTemperature(); // 27~28
        conditioner.increaseCurrentTemperature(); // 28~29
        conditioner.increaseCurrentTemperature(); // 29~30


        int actual = conditioner.getCurrentTemperature();
        assertEquals(30, actual);
    }
}






