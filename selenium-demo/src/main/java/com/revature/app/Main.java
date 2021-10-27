package com.revature.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rmich\\Downloads\\chromedriver_win32\\chromedriver.exe");
        
        
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("http://localhost:8080");
        
        WebElement addInput1 = driver.findElement(By.id("addNum1"));
        WebElement addInput2 = driver.findElement(By.id("addNum2"));
        WebElement addButton = driver.findElement(By.id("addBtn"));
        
        addInput1.sendKeys("22");
        addInput2.sendKeys("26");
        addButton.click();
        
        driver.switchTo().frame("addResult");
        WebElement addOutput = driver.findElement(By.tagName("pre"));
        System.out.println("The result of adding 22 and 26 is " + addOutput.getText());
        
        driver.switchTo().defaultContent();
        
        WebElement subInput1 = driver.findElement(By.id("subNum1"));
        WebElement subInput2 = driver.findElement(By.id("subNum2"));
        WebElement subButton = driver.findElement(By.id("subBtn"));
       
        subInput1.sendKeys("65");
        subInput2.sendKeys("10");
        subButton.click();
        
        driver.switchTo().frame("subResult");
        WebElement subOutput = driver.findElement(By.tagName("pre"));
        System.out.println("The result of subtracting 65 and 10 is " + subOutput.getText());
        
        driver.switchTo().defaultContent();
        
        WebElement multInput1 = driver.findElement(By.id("multNum1"));
        WebElement multInput2 = driver.findElement(By.id("multNum2"));
        WebElement multButton = driver.findElement(By.id("multBtn"));
        
        multInput1.sendKeys("22");
        multInput2.sendKeys("38");
        multButton.click();
        
        driver.switchTo().frame("multResult");
        WebElement multOutput = driver.findElement(By.tagName("pre"));
        System.out.println("The result of multiplying 22 and 38 is " + multOutput.getText());
        
        driver.switchTo().defaultContent();
        
        WebElement divInput1 = driver.findElement(By.id("divNum1"));
        WebElement divInput2 = driver.findElement(By.id("divNum2"));
        WebElement divButton = driver.findElement(By.id("divBtn"));
        
        divInput1.sendKeys("30");
        divInput2.sendKeys("5");
        divButton.click();
        
        driver.switchTo().frame("divResult");
        WebElement divOutput = driver.findElement(By.tagName("pre"));
        System.out.println("The result of dividing 30 and 5 is " + divOutput.getText());
        
        driver.switchTo().defaultContent();
        
        
        Thread.sleep(5000);
        
        driver.quit();
	}
	

}
