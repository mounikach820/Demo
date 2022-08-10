package com.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class IndexPage extends BaseClass 
{
	Action action = new Action();
	
	@FindBy(xpath = "//a[@class='login']") WebElement signInBtn;

	@FindBy(xpath = "//img[@class='logo img-responsive']")	WebElement mystoreLogo;
	
	@FindBy(xpath="//input[@id='search_query_top']")WebElement searchProductBox;
	
	@FindBy(name="submit_search") WebElement searchButton;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
		
		
	}
	public LoginPage clickOnsignIn() 
	{
		
		action.click(getDriver(), signInBtn);
		return new LoginPage();
	
	}
	public  boolean validateLogo()
	{
		return action.isDisplayed(getDriver(), mystoreLogo);
		
	}
	public String getMyStoreTitle() {
		String myStoreTitle=getDriver().getTitle();
		return myStoreTitle;
		 
		
	}
	public SearchResultPage searchProduct(String productName) {
		
		action.type(searchProductBox, productName);
		action.scrollByVisibilityOfElement(getDriver(),searchButton);
		action.click(getDriver(), searchButton);
		return new SearchResultPage();
	
	
	}
	
	
}
