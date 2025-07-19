package DairyTest;
import Diary.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Diary.EntryIsLocked;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary MyDiary;
    @BeforeEach
    public void setUp() {
        MyDiary = new Diary("john", "12345678");
    }
    @Test
    public void testDiaryCanBeCreated() {
        MyDiary = new Diary("john", "12345678");
        assertNotNull(MyDiary);

        assertEquals("john",MyDiary.getName());
        assertEquals("12345678", MyDiary.getPassword());
    }
    @Test
    public void  testDiaryUnlocksWithCorrectPassword() {
        MyDiary = new Diary("john", "12345678");
        assertTrue(MyDiary.Islocked());
        MyDiary.unlockDiary("12345678");
        assertFalse(MyDiary.Islocked());
    }
    @Test
    public void testDiaryLocksWithCorrectPassword() {
        MyDiary = new Diary("john", "12345678");
        assertTrue(MyDiary.LockDiary());
    }
    @Test
    public void testThatEntryCanNotBeCreatedWhenDiaryIsLockedWillThrowEception() {
        MyDiary = new Diary("john", "12345678");
        MyDiary.LockDiary();
        assertThrows(EntryIsLocked.class, () -> MyDiary.CreateEntry("1","2"));
    }
    @Test
    public void testThatEntryCanBeCreatedWhenDiaryIsUnlocked() {
        MyDiary = new Diary("john", "12345678");
        MyDiary.unlockDiary("12345678");
        MyDiary.CreateEntry("My Day","Today I learned OOP");
        assertEquals(1,MyDiary.getEntries().size());
    }
    @Test
    public void testThatEntryCanBeDeleted(){
        MyDiary = new Diary("john", "12345678");
        MyDiary.unlockDiary("12345678");
        MyDiary.CreateEntry("My Day","Today OOP");
        assertEquals(1,MyDiary.getEntries().size());
        MyDiary.deleteEntry(0);
        assertEquals(0,MyDiary.getEntries().size());
    }
    @Test
    public void testthatentrycanbefoundbyId(){
        MyDiary = new Diary("john", "12345678");
        MyDiary.unlockDiary("12345678");
        MyDiary.CreateEntry("My Day","Today OOP");
        MyDiary.updateEntry(1, "New Title", "New Body");
        Entry updated = MyDiary.findEntryById(1);
        assertEquals("New Title", updated.getTitle());
    }


}

