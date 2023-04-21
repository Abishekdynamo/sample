package com.webhandler;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Amazonsite {
	
	
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		
		
		

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
  
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement elec = driver.findElement(By.xpath("//a[text()=' Electronics ']"));
		
		Actions ac = new Actions(driver);
		ac.contextClick(elec).build().perform();
		
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_PAGE_DOWN);
		ro.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		WebElement book = driver.findElement(By.xpath("//a[text()='Books']"));
		ac.contextClick(book).build().perform();
		
		ro.keyPress(KeyEvent.VK_PAGE_DOWN);
		ro.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		
		Thread.sleep(2000);
		
		WebElement homeki = driver.findElement(By.xpath("//a[text()='Home & Kitchen']"));
		ac.contextClick(homeki).build().perform();
		
		ro.keyPress(KeyEvent.VK_PAGE_DOWN);
		ro.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement comp = driver.findElement(By.xpath("//a[text()='Computers']"));
		ac.contextClick(comp).build().perform();
		
		ro.keyPress(KeyEvent.VK_PAGE_DOWN);
		ro.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		ro.keyPress(KeyEvent.VK_ENTER);
		ro.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<windows size>>>>>>>>>>>>>>>>>>>");
		
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<windows handling id>>>>>>>>>>>>>>>");
		
		String w1 = driver.getWindowHandle();
		System.out.println(w1);
		
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<    Title  >>>>>>>>>>>>>>>>>>>>>>>");
		Set<String> ww1 = driver.getWindowHandles();
		for (String ch : ww1) {
			
		String title = 	driver.switchTo().window(ch).getTitle();
		System.out.println(title);
			
		}
	    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
	    String bok="Book Store Online : Buy Books Online at Best Prices in India | Books Shopping @ Amazon.in";
	    
	    
	    for (String ch : ww1) {
	    	if (driver.switchTo().window(ch).getTitle().equals(bok)) {
	    		break;
				
			}
	    	
		}
		
	    WebElement sp = driver.findElement(By.xpath("//li[@id='sobe_d_b_18_1']"));
	    
		ac.click(sp).build().perform();
		
		
//		  WebElement edit = driver.findElement(By.xpath("//a[@id='a-button-text']"));
//		
//		ac.click(edit).build().perform();
//		
		WebElement add = driver.findElement(By.xpath("//input[@id=\"add-to-cart-button\"]"));
		ac.click(add).build().perform();
		
		String com="Computers & Accessories: Buy Computers & Accessories Online at Low Prices in India - Amazon.in";
		
		for (String ele : ww1) {
			if (driver.switchTo().window(ele).getTitle().equals(com)) {
				break;
				
				
				
			}
			
			
		}
		
		JavascriptExecutor je =(JavascriptExecutor) driver;
	
		je.executeScript("window.scroll(0,document.body.scrollHeight)","");
		
		Thread.sleep(1000);
		
		TakesScreenshot tt =(TakesScreenshot)driver;
		File src = tt.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\mailt\\eclipse-workspace\\Selenium\\Evidence\\webhandling.png");
		FileHandler.copy(src, des);
		
		Thread.sleep(2000);
		for (String ch : ww1) {
			if (ch.equals(ww1)) {
				driver.switchTo().window(ch).close();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
