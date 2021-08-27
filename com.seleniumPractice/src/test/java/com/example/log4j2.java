package com.example;

import org.apache.log4j.PropertyConfigurator;
import org.testng.log4testng.Logger;

public class log4j2 {
	static final Logger logger1=Logger.getLogger(log4j2.class);

    public static void main(String[] args) throws InterruptedException {

              PropertyConfigurator.configure("src//test//java//com//example//log4jnew.properties");
             logger1.debug("Example for debug msg");
             logger1.info("Example for info msg");
             logger1.warn("Example for warn msg");
             logger1.error("Example for error msg");
             logger1.fatal("Example for fatal msg");  
}
}
