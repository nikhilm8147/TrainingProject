package com.example;


import org.apache.log4j.PropertyConfigurator;

//import org.apache.log4j.BasicConfigurator;

//import org.apache.log4j.xml.DOMConfigurator;
import org.testng.log4testng.Logger;

public class Log4j {
	static final Logger logger1=Logger.getLogger(Log4j.class);



	public static void main(String[] args) {

	PropertyConfigurator.configure("src\\test\\java\\com\\example\\log4j.properties");
	//DOMConfigurator.configure("src//test//java//com//example//log4jx.xml");
	logger1.debug("Example for debug msg");
	logger1.info("Example for info msg");
	logger1.warn("Example for warn msg");
	logger1.error("Example for error msg");
	logger1.fatal("Example for fatal msg");

	}
}
