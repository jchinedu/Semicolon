package DairyTest;

import Diary.Diaries;
import Diary.Diary;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class testDiaries {
    @Test
    public void testThatDiaresCanAdd(){
        Diaries diaries = new Diaries();
        diaries.Add("john", "1234");
        assertEquals(1,diaries.size());
        diaries.Add("daniel", "2483");
        assertEquals(2,diaries.size());
    }
    @Test
    public void testThatDiariesCanSearchandfind(){
        Diaries diaries = new Diaries();
        diaries.Add("john", "1234");
        Diary result = diaries.findByUsername("john");
        assertNotNull(result);
        assertEquals("john", result.getName());
        }
    @Test
    public void testThatDiariesCanDelete(){
        Diaries diaries = new Diaries();
        diaries.Add("john", "1234");
        diaries.delete("john","1234");
        assertNull(diaries.findByUsername("john"));
    }


    }
