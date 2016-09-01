
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.Random;

public class hospital {
    
    private static String fileName;
    private static String daysOfWeek[] = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
	private static String patientData[][][];
	private static int day = 0;
	private static int hour = 0;
	private static int numOfPatients = 0;
	
    public static void main(String[] args) throws Exception{
        FileCreator("myTestDoc.txt");
		patientDataCreation(patientData, fileName, day, hour, numOfPatients);
		
		for (int i = 0; i <= day; i++) {
			
		}
    }
	
    public static void FileCreator(String fileName) throws Exception{
		
	PrintWriter newFile = new PrintWriter(fileName);
	Random ranNumGen = new Random();
		
	for(int i = 0; i < 4; i++) {
		for (int j = 0; j < 7; j++ ) {
			newFile.println(daysOfWeek[j]);
			for(int k = 0; k < 24; k++) {
				if (k < 12) {
					newFile.println(k + " " + "AM");
					newFile.println(ranNumGen.nextInt(90));
				}
				else {
					newFile.println(k + " " + "PM");
					newFile.println(ranNumGen.nextInt(90));
				}
			}
		}
		}
		newFile.close();
	}
	
	public static String[][][] patientDataCreation(String patientData[][][], String fileName, int day, int hour, int numOfPatients) throws Exception{

		String curLine = "";
		
		Scanner myFavFile = new Scanner(new File(fileName));
		
		while (myFavFile.hasNextLine()) {
			curLine = myFavFile.next();
			if (curLine == daysOfWeek[day]) {
				patientData[day][hour][numOfPatients] = curLine;
				hour++;

			}
			else {
				curLine = myFavFile.next();
				patientData[day][hour][numOfPatients] = curLine;
				numOfPatients++;
				curLine = myFavFile.next();
				patientData[day][hour][numOfPatients] = curLine;
			}
		}
		return patientData;
	}
}