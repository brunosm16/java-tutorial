package com.baeldung.packages;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VarargsUnitTest {
    @Test
    public void whenCallingFirstOfFirst_thenClassCastException() {
        String one = firstOfFirst(Arrays.asList("one", "two"), Collections.emptyList());
        assertEquals("one", one);
    }

    static String firstOfFirst(List<String>... strings) {
        List<Integer> ints = Collections.singletonList(42);
        Object[] objects = strings;
        objects[0] = ints; // Heap pollution
        return strings[0].get(0); // ClassCastException
    }
}
