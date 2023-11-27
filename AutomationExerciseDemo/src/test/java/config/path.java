package config;



public class path {

	public static final String LOCALDIR = System.getProperty("user.dir");
	
	
	public static final String RegisterUserCSV  = LOCALDIR +"\\src\\test\\resources\\csv\\RegisterUser.csv";
	public static final String RegisterUserJSON = LOCALDIR +"\\src\\test\\resources\\json\\RegisterUser.json";
	
	public static final String LOGINUSERCSV   = LOCALDIR + "\\src\\test\\resources\\csv\\LoginUser.csv";
	public static final String LOGINUSERJSON  = LOCALDIR + "\\src\\test\\resources\\json\\LoginUser.json";
	
	public static final String CHROMEADBLOCKER = LOCALDIR + "\\src\\test\\resources\\chromeExtensions\\AdBlock.crx";

}