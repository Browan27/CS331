import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class hospitalTest {
    private hospital h = new hospital();
    
    @Test
    public void calculateAverageTest() {
    int[] array = {1, 2, 3};
        assertEquals(2, h.calculateAverageBasic(array));
    }
    
    @Test
    public void calculateAverageDeepTest() {
    int[] array = {1, 7, 0, 9, 4, 2, 2, 4, 6, 3, 6, 9};
        assertEquals(4, h.calculateAverageBasic(array));
    }
    
    @Test
    public void returnCountTest() {
        assertEquals(0, h.returnHourCount());
        assertEquals(0, h.returnDayCount());
        assertEquals(0, h.returnWeekCount());
    }
    
    @Test
    public void returnCountAfterAddAndTheAddTest() {
        assertEquals(0, h.returnHourCount());
        h.addToStorage(4);
        assertEquals(1, h.returnHourCount());
        assertEquals(4, h.returnStorageLast());
    }
    
    @Test
    public void calculateArrayAverage() {
        for(int i = 0; i < 24; i++) {
            h.addToStorage(i+1);
        }
        assertEquals(1, h.returnDayCount());
        assertEquals(0, h.returnHourCount());
    }
}