package Demo;

import java.io.File;
import java.nio.file.Files;

import org.testng.annotations.Test;

public class Fileexist {

	@Test
	public void files(){
	
		File file = new File("C:\\Users\\parthiban\\Desktop\\sprint3.xlsx");
		if(file.exists()){
			System.out.println("File exist in the current location");
		}
		else{
			System.out.println("File not exist in the current location");
		}
			
		}
		
	}

