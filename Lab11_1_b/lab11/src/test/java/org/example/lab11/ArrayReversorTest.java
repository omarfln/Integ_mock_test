package org.example.lab11;

import model.ArrayReversor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import service.ArrayFlattenerService;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayReversorTest {

    @Mock
    private ArrayFlattenerService flattenerService;

    private ArrayReversor reversor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        reversor = new ArrayReversor(flattenerService);
    }

    @Test
    public void testReverseArray_NonEmptyArray() {
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expectedFlatten = {1, 3, 0, 4, 5, 9};
        Integer[] expectedReverse = {9, 5, 4, 0, 3, 1};

        when(flattenerService.flattenArray(input)).thenReturn(expectedFlatten);

        assertArrayEquals(expectedReverse, reversor.reverseArray(input), "The arrays should be reversed");
        verify(flattenerService).flattenArray(input);
    }

    @Test
    public void testReverseArray_NullInput() {
        when(flattenerService.flattenArray(null)).thenReturn(null);

        assertNull(reversor.reverseArray(null), "The output should be null for null input");
        verify(flattenerService).flattenArray(null);
    }

    @Test
    public void testReverseArray_NonEmptyArrayNegative() {
        Integer[][] input = {{1, 3}, {0}, {4, 5, 9}};
        Integer[] expectedFlatten = {1, 3, 0, 4, 5, 9};
        Integer[] expectedReverse = {9, 5, 4, 0, 1, 3};

        when(flattenerService.flattenArray(input)).thenReturn(expectedFlatten);

        assertArrayEquals(expectedReverse, reversor.reverseArray(input), "The arrays should be reversed");
        verify(flattenerService).flattenArray(input);
    }
}
