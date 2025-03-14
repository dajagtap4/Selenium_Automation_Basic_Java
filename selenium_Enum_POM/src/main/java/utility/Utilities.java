package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utilities {

	public static Object fetchConfigProperties(String keys) throws IOException {
		FileInputStream file = new FileInputStream("./src/main/resources/configFiles/config.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(keys);

	}

	public static String fetchLocatorProperties(String keys) throws IOException {
		FileInputStream file = new FileInputStream("./src/main/resources/configFiles/locator.properties");
		Properties prop = new Properties();
		prop.load(file);
		return prop.get(keys).toString();
	}
}
