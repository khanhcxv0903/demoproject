package PageFactory;

import java.io.UnsupportedEncodingException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Test.Util;

public class FResult {
WebDriver driver;
@FindBy(className = "LC20lb")
WebElement FResult_Search;

public FResult(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public String getResultSearch() {
	return FResult_Search.getText();
}
	
}
