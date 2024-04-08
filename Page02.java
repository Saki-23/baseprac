package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page02 {
public static WebDriver driver1;
@FindBy (xpath ="(//input[@type='email'])[1]")
private WebElement email;
@FindBy (xpath ="(//input[@type='password'])[1]")
private WebElement password;
@FindBy (xpath ="//button[text()='Login']")
private WebElement login;
@FindBy (xpath = "//a[text()='Proceed To Checkout']")
private WebElement proceed;
@FindBy (xpath = "//a[@href='/login']//child::u")
private WebElement icon;
public WebElement getIcon() {
	return icon;
}
public Page02(WebDriver driver) {
this.driver1 = driver;
PageFactory.initElements(driver, this);}
public WebElement getProceed() {
	return proceed;
}
public WebElement getEmail() {
	return email;
}
public WebElement getPassword() {
	return password;
}
public WebElement getLogin() {
	return login;
}





}
