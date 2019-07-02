package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FConfirmLink {
WebDriver driver;
@FindBy(className = "LC20lb")
WebElement FClickLink;

public FConfirmLink(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
	
}

public void ClickLinkSearch() {
	FClickLink.click();
}

public String GetTitle_AfterClick() {
	return driver.getTitle();
}

public void Goto_link() {
	this.ClickLinkSearch();
	this.GetTitle_AfterClick();
}
}
