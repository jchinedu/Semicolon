package DairyTest;

import Diary.Diaries;
import org.junit.jupiter.api.Test;

public class testDiaries {
    @Test
    public void testThatDiaresCanAdd(){
        Diaries diaries = new Diaries();
        diaries.Add("john", "1234");
    }
}
