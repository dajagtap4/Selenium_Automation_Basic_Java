package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utility {
	public static Object fetchConfigProperty(String key) throws IOException    {
		FileInputStream file = new FileInputStream("./src/main/resources/configfiles/config.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(key);	
	}
	
	public static String fetchLocatorProperty(String key) throws IOException    {
		FileInputStream file = new FileInputStream("./src/main/resources/configfiles/locator.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(key).toString();	
	}
}
