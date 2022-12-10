package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesOperations {

	public static String getPropertyValue(String key) {
		FileInputStream fis = null;
		Properties prop = new Properties();
		String path = System.getProperty("user.dir");
		try {
			fis = new FileInputStream(path + "/src/test/resources/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {
		}

		return prop.getProperty(key);

	}
}
