package com.baeldung.packages;

import com.baeldung.domain.TodoItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimitivesUnitTest {
    @Test
    public void whenModifyingPrimitives_thenOriginalValuesNotModified() {
        int x = 1;
        int y = 2;
        
        assertEquals(x, 1);
        assertEquals(y, 2);
        modify(x, y);

        assertEquals(x, 1);
        assertEquals(y, 2);
    }
    public static void modify(int x1, int y1) {
        x1 = 5;
        y1 = 10;
    }
}
