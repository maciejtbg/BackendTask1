package io.lsn;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortElementsTest {

    @Test
    void shouldReturnNumberOfDistinctElements() {
        List<Integer> sortedList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        int distinctCount = SortingApp.getDistinctElements(sortedList);

        assertEquals(5, distinctCount);
    }

    @Test
    void shouldReturnNoneOfDistinctElements() {
        List<Integer> emptyList = new ArrayList<>();
        int distinctCount = SortingApp.getDistinctElements(emptyList);

        assertEquals(0, distinctCount);
    }

    @Test
    void shouldReturnSortedList() {
        List<Integer> inputList = Arrays.asList(5, 2, -1, 4, 7);
        List<Integer> expectedList = Arrays.asList(-1, 2, 4, 5, 7);
        List<Integer> sortedList = SortingApp.sortListAscending(inputList);

        assertEquals(expectedList, sortedList);
    }

    @Test
    void shouldReturnEmptyList() {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> sortedList = SortingApp.sortListAscending(emptyList);

        assertTrue(sortedList.isEmpty());
    }

    @Test
    void shouldReturnSingleElementList() {
        List<Integer> singleElementList = Collections.singletonList(1);
        List<Integer> sortedList = SortingApp.sortListAscending(singleElementList);

        assertEquals(singleElementList, sortedList);
    }
}