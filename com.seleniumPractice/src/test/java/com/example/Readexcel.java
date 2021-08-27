package com.example;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Readexcel {
	
	@Test
	  public void excelnum() throws InterruptedException, IOException {
		  System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  
		  WebDriver driver=new ChromeDriver();
		  
		  
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
		  FileInputStream file = new FileInputStream(new File("C:\\Users\\nikhil.m\\Documents\\TestData.xlsx"));
		  
		XSSFWorkbook w1 = new XSSFWorkbook(file);
		
		XSSFSheet s1 = w1.getSheet("Sheet1");
		
		for (int i=1;i <s1.getLastRowNum();i++) {
	        String value1=s1.getRow(i).getCell(0).getStringCellValue();                              //getCell(0,i).getContents();
	        String value2=s1.getRow(i).getCell(1).getStringCellValue();
	        driver.get("http://leafground.com/pages/Edit.html");
	        driver.findElement(By.id("email")).sendKeys(value1);
	        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input")).sendKeys(value2);
	        driver.navigate().refresh();
		}
		

	
	
	
	
	
	
	}
}
