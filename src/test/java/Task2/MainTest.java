package Task2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MainTest {
    @Test
    public void checkSortArray() {
        int[] expected = {5, 6, 3, 2, 5, 1, 4, 9};
        int[] actual = {1, 2, 3, 4, 5, 5, 6, 9};
        Main.sortArray(expected);

        int[] expected1 = {1, 1, -1, 0, 2, 3};
        int[] actual1 = {-1, 1, 1, 2, 0, 3};
        Main.sortArray(expected1);
        Arrays.sort(actual1);

        assertArrayEquals(expected, actual);
        assertArrayEquals(expected1, actual1);
    }

}