
package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class utilities {
	public static Object fetchConfigProperty(String key) throws IOException    {
		FileInputStream file = new FileInputStream("./src/test/resources/configfiles/config.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(key);	
	}
	
	public static String fetchLocatorProperty(String key) throws IOException    {
		FileInputStream file = new FileInputStream("./src/test/resources/configfiles/locator.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(key).toString();	
	}
}