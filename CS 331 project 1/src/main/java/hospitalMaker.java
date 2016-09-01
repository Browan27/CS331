import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class hospitalMaker {
    
    private String fileName;
	private String daysOfWeek[] = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}
	
    public static void main(String[] args) {
        
    }
	
	public void FileCreator(String fileName) {
		
		PrintWriter newFile = new PrintWriter(fileName);
		Random ranNumGen = new Random();
		
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++ ) {
				newFile.println(daysOfWeek[j]);
				for(int k = 0; k < 24; k++) {
					if k < 12 {
						newFile.println(k + "AM" + " " + ranNumGen.nextInt(90));
					}
				}
			}
		}
		newFile.close();
	}
}