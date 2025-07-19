package TestTime2;

import org.junit.jupiter.api.Test;
import time2.HourCanNotBeLessThanZero;
import time2.Time2;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class testTime2 {
    Time2 time = new Time2();
    @Test
    public void testthathourlessthatzerothrowsexception(){
        time.setHour(-1);
        assertThrows(HourCanNotBeLessThanZero.class, () -> time.getHour());
    }

}
