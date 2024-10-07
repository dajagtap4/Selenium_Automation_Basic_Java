package Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {
	public static Object fetchProperty(String key) throws IOException    {
		FileInputStream file = new FileInputStream("./src/test/resources/configfiles/config.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(key);	
	}
}
