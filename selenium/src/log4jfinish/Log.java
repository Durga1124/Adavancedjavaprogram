package log4jfinish;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

	public static Logger log = Logger.getLogger("Log");
	public static void info(String messege){
		
		PropertyConfigurator.configure("./Log4jpropertyfile/Log4j.properties");
		log.info(messege);
  }
	
}