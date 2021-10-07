package init;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	
	public static String getProperty(String key) throws IOException {
		
		
		FileReader fr = new FileReader(new File("/Users/e10/Documents/Vmetry_Online/Batch_B173/PageObjectModel/src/test/resources/config/env.property"));
		
		Properties prop = new Properties();
		prop.load(fr);
		
		return prop.getProperty(key);
		
	}

}
