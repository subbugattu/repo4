
package selenium_examples;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Readpropfile {

	public static void main(String[] args) throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream  ip=new FileInputStream("C:\\Users\\Admin\\git\\repository\\selenium\\src\\selenium_examples\\config.properties");
		
		prop.load(ip);
		
		System.out.println(prop.getProperty("name"));
		
		System.out.println(prop.getProperty("age"));
		
		String url=prop.getProperty("url");
		
		System.out.println(url);
		
		String browser=prop.getProperty("browser");
		
		System.out.println(browser);

	}

}
