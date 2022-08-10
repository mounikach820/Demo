package com.mystore.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystore.actiondriver.Action;
import com.mystore.base.BaseClass;

public class AddressPage extends BaseClass {
	Action action = new Action();
	
    @FindBy(xpath="//span[text()='Proceed to checkout']")WebElement ProceedToCkeckbt ;
    public AddressPage() {
        PageFactory.initElements(getDriver(), this);
}
    public ShippingPage clickOnCheckOut() throws Throwable {

        
		action.click(getDriver(), ProceedToCkeckbt);

        return new ShippingPage();
    }
	
}