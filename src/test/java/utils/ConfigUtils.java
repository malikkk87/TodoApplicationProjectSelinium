package utils;

import java.util.Properties;

import javax.management.RuntimeErrorException;

public class ConfigUtils {
  private  Properties properties;
  private static ConfigUtils configUtils;
  
 private ConfigUtils() {
      String env= System.getProperty("env", "production");
      switch(env) {
        case "PRODUCTION":
        	 properties=PropertiesUtils.loadProperties("C:\\Users\\ME\\eclipse-workspace\\TodoApplicationProjct\\src\\test\\java\\config\\production.properties");
        	 break;
        case "LOCAL":
        	 properties=PropertiesUtils.loadProperties("C:\\Users\\ME\\eclipse-workspace\\TodoApplicationProjct\\src\\test\\java\\config\\local.properties");
        	 break;
        	 default:
        		 throw new RuntimeException("Environement is not supported");
        	
      
      }
      
    
  }
 
 public static  ConfigUtils getInstance() {
	 if(configUtils==null) {
		 configUtils=new ConfigUtils();
		 
	 }
	 return configUtils;
 }
 
 
  public  String getBaseUrl() {
String prop=  properties.getProperty("baseurl");
if(prop!=null)return prop;
throw new  RuntimeException("could not find base urlin the property file");

  }
  public  String getEmail() {
String prop=  properties.getProperty("email");
if(prop!=null)return prop;
throw new  RuntimeException("could not find email in the property file");

  }
  public  String getPassword() {
	  String prop=  properties.getProperty("password");
	  if(prop!=null)return prop;
	  throw new  RuntimeException("could not find password in the property file");

	    }

}
