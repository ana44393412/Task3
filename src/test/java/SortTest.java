import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {
    @Test
    public void simpleSortTest() {
        int[] i = {1, 4, 3, 15};
        int[] expectedArray = {1, 3, 4, 15};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void minusSortTest() {
        int[] i = {98, 14, -20, 18};
        int[] expectedArray = {-20, 14, 18, 98};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void sortedSortTest() {
        int[] i = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void reversedSortTest() {
        int[] i = {5, 4, 3, 2, 1};
        int[] expectedArray = {1, 2, 3, 4, 5};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void doubleSortTest() {
        int[] i = {10, 10, 1, 2, 1};
        int[] expectedArray = {1, 1, 2, 10, 10};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }

    @Test
    public void sameSortTest() {
        int[] i = {5, 5, 5, 5, 5};
        int[] expectedArray = {5, 5, 5, 5, 5};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }
    @Test
    public void partiallySortTest() {
        int[] i = {1, 2, 4, 3, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        i = Main.sort(i);
        Assertions.assertArrayEquals(expectedArray, i);
    }
}
