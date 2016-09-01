
import java.io.*;
import java.util.Random;

public class hospitalMaker {
    
    private static String fileName;
	
	

    public static void fileCreator(String s) throws FileNotFoundException {
		
		PrintWriter newFile = new PrintWriter(s);
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
	
	public static void main(String[] args) {
		fileName = "hospital.txt";
		try {
			fileCreator(fileName);
		} catch(FileNotFoundException e) {System.out.println("wellcrap");}
	}
	
}