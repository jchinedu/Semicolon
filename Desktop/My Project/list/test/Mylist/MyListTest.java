package Mylist;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    private MyList alist;

    @BeforeEach
    void setUp() {
        alist = new MyList();
    }

    @Test
    public void newList_isEmptyTest() {
        assertTrue(alist.isEmpty());
    }
    @Test
    public void addElement_increasesSize() {
        alist.add("Apple");
        assertEquals(1, alist.size());
        assertFalse(alist.isEmpty());
    }
    @Test
    public void getElement_returnsCorrectValue() {
        alist.add("Apple");
        alist.add("Banana");
        assertEquals("Banana", alist.get(1));
    }
    @Test
    public void accessingInvalidIndex_throwsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            alist.get(0);
        });
    }
    @Test
    public void removeElement_removesElement() {
        alist.add("Apple");
        alist.add("Banana");
        alist.add("guava");

        alist.remove(1);
        assertEquals(2, alist.size());
        assertEquals("guava", alist.get(1));
        assertEquals("Apple", alist.get(0));
    }
    @Test
    public void clear_removesAllElements() {
        alist.add("A");
        alist.add("B");
        alist.add("C");

        alist.clear();

        assertTrue(alist.isEmpty());
        assertEquals(0, alist.size());
        assertThrows(IndexOutOfBoundsException.class, () -> {alist.get(0);
        });
    }
}
