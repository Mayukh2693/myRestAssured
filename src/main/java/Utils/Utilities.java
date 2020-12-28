package Utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;

public class Utilities {
	protected static Properties properties;
	
	/**
	 * Returns a random string of length 5
	 * @return
	 */
	public static String randomString() {
		String str = "Random " + RandomStringUtils.randomAlphabetic(5);
		return str;
	}
	
	/**
	 * Reads config files from the given path
	 * @param key
	 * @return
	 */
	public static String readConfigurationFile(String key) {
		try{
			properties = new Properties();
			properties.load(new FileInputStream("./src/main/java/config/config.properties"));
			
		} catch (Exception e){
			System.out.println("Cannot find key: "+key+" in Config file due to exception : "+e);
		}
		return properties.getProperty(key).trim();	
	}
	

}
