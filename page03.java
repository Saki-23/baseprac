package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class page03 {
	public static WebDriver driver2;
	@FindBy (xpath = "href=\"/view_cart\"")
	private WebElement cart1;
	@FindBy (xpath = "//a[@class='btn btn-default check_out']")
	private WebElement out;
	public page03(WebDriver driver) {
this.driver2 = driver;
PageFactory.initElements(driver, this);
}
	public WebElement getCart1() {
		return cart1;
	}
	public WebElement getOut() {
		return out;
	}	

}
