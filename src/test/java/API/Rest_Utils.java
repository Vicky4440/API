package API;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class Rest_Utils {
	
	
	public static String randomservicename() {
		
		String gnratedString=RandomStringUtils.randomAlphabetic(1);
		return ("Eks" +gnratedString);
		
	}
	
	public static String randaomname() {
		String gnratedString=RandomStringUtils.randomAlphabetic(1);
		return ("Eks" +gnratedString);
	}
	public static String age() {
		String gnratedString=RandomStringUtils.randomNumeric(1);
		return (gnratedString);
	}
	
   public static String salary() {
		String gnratedString=RandomStringUtils.randomNumeric(5);
 
	   
	return (gnratedString);
	   
   }
}
