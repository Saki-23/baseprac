package org.automation;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoPage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.edge.driver", "C:\\Users\\ELCOT\\.m2\\Project05\\driver\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();
		//JavascriptExecutor j = (JavascriptExecutor) driver;
		//j.executeScript("window.scrollBy(0,-300")
		Page01 a1 = new Page01(driver);
		Page02 a2 = new Page02(driver);
		page03 a3 = new page03(driver);
		a1.getview().click();
		Thread.sleep(8000);
		a1.getQty().clear();
		a1.getQty().sendKeys("2");
		a1.getAdd().click();
		Thread.sleep(1000);
		a1.getContinueshop().click();
		Thread.sleep(500);
		a1.getViewcart().click();  
		a1.getCheck().click();
		Thread.sleep(700);
		a2.getIcon().click();
		a2.getEmail().sendKeys("sneha23@gmail.com");
		a2.getPassword().sendKeys("jin@23");
		a2.getLogin().click();
		Thread.sleep(1000);
		a2.getIcon().click();
		a3.getOut().click();
		
	}

}
