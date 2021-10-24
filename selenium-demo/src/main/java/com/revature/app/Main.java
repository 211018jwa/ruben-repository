package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmich\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        
        //specified location of the webdriver now we can instantiate a webdriver object
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:8080");// navigates to website
        
        WebElement addInput1 = driver.findElement(By.id("addNum1"));
        WebElement addInput2 = driver.findElement(By.id("addNum2"));
        WebElement addButton = driver.findElement(By.id("addBtn"));
        
        addInput1.sendKeys("22");
        addInput2.sendKeys("26");
        addButton.click();
        
        driver.switchTo().frame("addResult");//Switch into the iframe
        
        WebElement addOutput = driver.findElement(By.tagName("pre"));
        System.out.println("The result of adding 22 and 26 is " + addOutput.getText());
        
        driver.switchTo().defaultContent();//get outside of the iframe
        
        WebElement subInput1 = driver.findElement(By.id("subNum1"));
        WebElement subInput2 = driver.findElement(By.id("subNum2"));
        WebElement subButton = driver.findElement(By.id("subBtn"));
       
        subInput1.sendKeys("65");
        subInput2.sendKeys("10");
        subButton.click();
        
        WebElement multInput1 = driver.findElement(By.id("multNum1"));
        WebElement multInput2 = driver.findElement(By.id("multNum2"));
        WebElement multButton = driver.findElement(By.id("multBtn"));
        
        multInput1.sendKeys("22");
        multInput2.sendKeys("38");
        multButton.click();
        
        WebElement divInput1 = driver.findElement(By.id("divNum1"));
        WebElement divInput2 = driver.findElement(By.id("divNum2"));
        WebElement divButton = driver.findElement(By.id("divBtn"));
        
        divInput1.sendKeys("30");
        divInput2.sendKeys("5");
        divButton.click();
        
        
        Thread.sleep(5000);//browser will close after 5 seconds
        
        //quit method
        //when done scripting tasks its important to quit the process
        driver.quit();
	}
	

}
