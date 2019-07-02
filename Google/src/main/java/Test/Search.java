package Test;

import org.testng.annotations.Test;

import PageFactory.FConfirmLink;
import PageFactory.FResult;
import PageFactory.FSearch;

import java.io.UnsupportedEncodingException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import Test.Util;
public class Search {
	WebDriver driver;
	FSearch objSearch;
	FResult objResult;
	FConfirmLink objConfirm;
  @Test(priority=0)
  public void test_Search_Key_Correct()  {
	  objSearch=new FSearch(driver);
	  String getResult=objSearch.getTitleGoogle();
	  Assert.assertTrue(getResult.toLowerCase().contains("google"));
	  objSearch.SearchToPage("vnexpress");
	  
	  objResult=new FResult(driver);
	  String textout=objResult.getResultSearch();
	  System.out.println("Result is:"+textout);
	  
	  Assert.assertTrue(textout.contains("VnExpress - Báo tiếng Việt nhiều người xem nhất"));
  }
  @Test(priority=1)
  public void test_Click_Link_After_Search()
  {
	  objConfirm=new FConfirmLink(driver);
	  objConfirm.Goto_link();
	  String text_confirm=objConfirm.GetTitle_AfterClick();
	  System.out.println(text_confirm);
	  Assert.assertTrue(text_confirm.contains("VnExpress - Báo tiếng Việt nhiều người xem nhất"));
  }
  @BeforeTest
  public void setup() {
	  System.setProperty("webdriver.gecko.driver", "F:\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.google.com/");
  }

}
