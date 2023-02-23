package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	
	 private static Properties configObject;

	    static {

	        try {

	            String filePath = "/test/src/test/resources/properties/config.properties";

	            // open connection to the file
	            FileInputStream input = new FileInputStream(filePath);

	            configObject = new Properties();

	            configObject.load(input);

	            input.close();

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	    }
	    public static String getProperty(String keyName) {

	    	return configObject.getProperty(keyName);
	    }
}