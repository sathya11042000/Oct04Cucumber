package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	public static Actions a;

	public static WebDriver driver;
	
	public static void browserLaunch() {
		 driver=new ChromeDriver();

	}

	
	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void maxWin() {
		driver.manage().window().maximize();
	}

	
	
	public static void fillText(WebElement webRef,String value) {
		webRef.sendKeys(value);

	}
	
	public static void btnClick(WebElement webRef) {
		webRef.click();
	}
	
	
	public static String prtTittle() {
		String title = driver.getTitle();
//		System.out.println();
		return title;
	}
	
	public static String prtUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;

	}
	
	public static void getDateAndTime() {
		Date d=new Date();
		System.out.println(d);

	}
	
	
	
	public static void browserClose() {
		driver.quit();
	}
	

	public static  void refreshPage() {
		 driver.navigate().refresh();

	}
	public static void dragDrop(WebElement dragRef, WebElement dropRef) {
		a = new Actions(driver);
		a.dragAndDrop(dragRef, dropRef).perform();

	}

	public static void moveElement(WebElement moveEleRef) {
		a.moveToElement(moveEleRef).perform();

	}

	public static void snap(String fileName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temFile = ts.getScreenshotAs(OutputType.FILE);
		File perFile = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenConfigrationNew\\target\\"+fileName +".png");
		FileUtils.copyFile(temFile, perFile);

	}
	
	public static String dataDrivenRead(String workBookName,String shName,int rowNum,int cellNum) throws IOException {
		
		File f = new File("C:\\Users\\ADMIN\\eclipse-workspace\\MavenConfigrationNew\\EX\\"+workBookName+".xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook book = new XSSFWorkbook(fin);
		//Login
		Sheet sheet = book.getSheet(shName);	

		Row row = sheet.getRow(rowNum);
		
		Cell c = row.getCell(cellNum);
				
				int type = c.getCellType();// 0 or 1
				
				String value = "";	
				
				if (type == 1) {
              value = c.getStringCellValue(); 
//                  System.out.println(value);
				}
				
				
				else if (DateUtil.isCellDateFormatted(c)) {
					Date dat = c.getDateCellValue();
					SimpleDateFormat sim =new SimpleDateFormat("dd, MMMM, yyyy zzzz");
					  value = sim.format(dat);
//					System.out.println(value);	
					
				}
				
				else {
					double dole = c.getNumericCellValue();
					long l=(long)dole;				
						value = String.valueOf(l);
//					System.out.println(value);
				}
				
           return value;
	

	
	
}}
