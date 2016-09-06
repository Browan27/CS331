import java.util.*;

public class hospital {
    private int[][][] storage;
    private int hourCount;
    private int dayCount;
    private int weekCount;
    private static String daysOfWeek[] = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    
    public hospital() {
        hourCount = 0;
        dayCount = 0;
        weekCount = 0;
        storage = new int[4][7][24];
    }
    
    public void fileReader() {
        
    }
    
    public void addToStorage(int x) {
        storage[weekCount][dayCount][hourCount] = x;
        hourCount++;
        if(hourCount == 24) { hourCount = 0; dayCount++; }
        if(dayCount == 7) { dayCount = 0; weekCount++; }
    }
    
    public int calculateAverageBasic(int[] array) {
        int average = 0;
        for(int i = 0; i < array.length; i++) {
            average += array[i];
        }
        average = average/array.length;
        return average;
    }
    
    public int returnStorageLast() {
        if(hourCount == 0) {
            if(dayCount == 0) {
                if(weekCount == 0) { return storage[0][0][0]; }
                else { return storage[weekCount-1][6][23]; }
            }
            else {
                return storage[weekCount][dayCount-1][23];
            }
        }
        else { return storage[weekCount][dayCount][hourCount-1]; }
    }
    public int returnStorageSpecific(int week, int day, int hour) {
        return storage[week][day][hour];
    }
    public int returnHourCount() { return hourCount; }
    public int returnDayCount() { return dayCount; }
    public int returnWeekCount() { return weekCount; }
    
    public static void main(String[] args) {
        
    }
}