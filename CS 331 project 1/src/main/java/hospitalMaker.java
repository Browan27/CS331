
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;

public class hospital {
    
    private static String fileName;

    public void FileCreator(String fileName) throws Exception{
		
		PrintWriter newFile = new PrintWriter(fileName);
		Random ranNumGen = new Random();
			
		for(int i = 0; i < 4; i++) {
			for (int j = 0; j < 7; j++ ) {
				for(int k = 0; k < 24; k++) {
						newFile.println(ranNumGen.nextInt(10));
				}
			}
		}
		newFile.close();
	}
	
}