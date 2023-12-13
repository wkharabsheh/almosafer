package AlmosaferWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MyTestcasses {
	private static final WebElement ExpectedContactNumber = null;
	String TheWebSite="https://global.almosafer.com/en";
	ChromeDriver driver= new ChromeDriver();
	 SoftAssert softassert=new SoftAssert();
	@BeforeTest
	public  void Setup() {
		driver.manage().window().maximize();
		driver.get(TheWebSite);
		WebElement WelcomeScreen =driver.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
		WelcomeScreen.click();		
	}
	
	
	
	
	
	
	@Test
	public  void checkTheLanguage() {
		String ActualLang=driver.findElement(By.tagName("html")).getAttribute("lang");
		String ExpectedLang="en";
		softassert.assertEquals(ActualLang, ExpectedLang, "this is to check the language");
	
	}
	@Test
	public  void checkTheCurrency() {
		String Expectedcurrency="SAR";
		WebElement CurrencyElement = driver.findElement(By.cssSelector(".sc-dRFtgE.fPnvOO"));
		String ActualCurrency= CurrencyElement.getText();
		softassert.assertNotEquals(ActualCurrency, Expectedcurrency);
		
		
		
		@Test
	public void ContactNumber() {
			String ExpectedContactNumber="+966554400000";
			WebElement ContactNumberelement=driver.findElement(By.xpath("//strong[normalize-space()='+966554400000''"));
			String ActualContactNumber= ExpectedContactNumber.getText();
	softassert.assertEquals(ActualContactNumber, ExpectedContactNumber);
		
	}
	

	


	@Test()
	public void CheckLogo() {
	WebElement QitafLogo= driver.findElement(Byxpath("//div[@class='sc-dznXNo iZejAw'"));
boolean QitafLogoisDisplayed= QitafLogo.isDisplayed();
boolean QitafLogoisDisplayed  = True;






	@AfterTest
	public  void AftermyTest () {
		softassert.assertAll();
		}
	

}
