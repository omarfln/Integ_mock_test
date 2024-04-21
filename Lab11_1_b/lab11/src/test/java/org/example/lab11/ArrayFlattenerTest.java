package org.example.lab11;

import model.ArrayFlattener;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ArrayFlattenerTest {

    @Test
    public void testFlattenArray_NonEmptyArray() {
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expected = {1, 3, 0, 4, 5, 9};
        assertArrayEquals(expected, ArrayFlattener.flattenArray(input), "The arrays should be equal");
    }

    @Test
    public void testFlattenArray_NullInput() {
        assertNull(ArrayFlattener.flattenArray(null), "The output should be null for null input");
    }

    @Test
    public void testFlattenArray_NonEmptyArrayFail() {
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expected = {1, 3, 0, 4, 3, 9};
        assertArrayEquals(expected, ArrayFlattener.flattenArray(input), "The arrays should be equal");
    }
}