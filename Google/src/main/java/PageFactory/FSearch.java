package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FSearch {
	WebDriver driver;
	@FindBy(name = "q")
	WebElement FTextInputSearch;
	@FindBy(name = "btnK")
	WebElement FButtonSearch;
	
	@FindBy(className = "ctr-p")
	WebElement FClickOutSide;
//	@FindBy(className = "LC20lb")
//	WebElement FGettitle;
	
	
	
	public FSearch(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.getTitle();
	}
	public void InputSearch(String strKeySearch) {
		FTextInputSearch.sendKeys(strKeySearch);
	}
	
	public void ClickOutSide() {
		FClickOutSide.click();
	}
	
	public void ClickSearch() {
		FButtonSearch.click();
		
	}
	
	
	public String getTitleGoogle() {
		return driver.getTitle();
	}
	
	public void SearchToPage(String strInputKey) {
		this.InputSearch(strInputKey);
		this.ClickOutSide();
		this.ClickSearch();
	}
	
	
}
