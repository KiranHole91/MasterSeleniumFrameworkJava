package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties props;

    public ConfigReader() 
    {
        props = new Properties();
        try (BufferedReader reader = new BufferedReader(new FileReader(""+"src/main/resources/config.properties"))) 
          {
            props.load(reader);
          } 
        catch (IOException e) 
          {
            throw new RuntimeException("Failed to load config.properties", e);
          }
    }

    
    public String getBrowser()     {
        return props.getProperty("browser");
    }

    
    public long getImplicitWait()  {
        return Long.parseLong(props.getProperty("implicitWait"));
    }

    public long getExplicitWait() {
        return Long.parseLong(props.getProperty("explicitWait"));
    }
    
    public String getbaseUrl()     { return props.getProperty("baseUrl"); }
    
    public String getUsername()    { return props.getProperty("username"); }
    
    public String getPassword()    { return props.getProperty("password"); }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
