package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page01 {
	public static WebDriver driver;
	@FindBy (xpath = "(//i[@class='fa fa-plus-square'])[4]")
	private WebElement view;	
	@FindBy (xpath = "//input[@type='number']")
	private WebElement qty;
	@FindBy (xpath = "(//i[@class='fa fa-shopping-cart'])[2]")
	private WebElement add;
	@FindBy (xpath = "//a[text()='Proceed To Checkout']")
	private WebElement check;
	@FindBy (xpath = "//a[@href='/view_cart']//child::i")
	private WebElement viewcart;
	@FindBy (xpath = "//div[@class='modal-body']//following-sibling::div//child::button")
	private WebElement continueshop;
	public WebElement getContinueshop() {
		return continueshop;
	}
	public WebElement getViewcart() {
		return viewcart;
	}
	public WebElement getView() {
		return view;
	}
	public WebElement getCheck() {
		return check;
	}
	public Page01(WebDriver driver2) {
    this.driver = driver;
    PageFactory.initElements(driver2, this);
	}
		public WebElement getQty() {
		return qty;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getview() {
		return view;
	}
	

}
