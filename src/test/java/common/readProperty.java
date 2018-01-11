package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class readProperty {

	String sValue=null;
	String getPropValue = null;
	


public String datapass(String getPropValue) {
	Properties prop = new Properties();
	InputStream input = null;
	
	
	try {

		input = new FileInputStream("./config.properties");
		prop.load(input);	
		sValue=prop.getProperty(getPropValue);

	    

	}
	catch (IOException io) 
	{
		io.printStackTrace();
	

	}
	
	return sValue;
	
}






 

}
