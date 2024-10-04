package org.helper;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//parent
public class LibGlobal {

	public static WebDriver driver;
	public static Actions a;

	public static void browserLaunch(String url) {

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void prntTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void prntUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

	}

	public static void browserClose() {
		driver.quit();

	}

	public static void passData(WebElement webRef, String sendData) {
		webRef.sendKeys(sendData);

	}

	public static void btnClk(WebElement btnRef) {
		btnRef.click();

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

}
