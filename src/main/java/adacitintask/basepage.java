package adacitintask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basepage {
	public static WebDriver driver;
	public void getdriver(){
		System.setProperty("webdriver.chrome.driver", "F:\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	public static void geturl(String url){
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public static void enterdetails(WebElement det, String data){
		det.sendKeys(data);
	}
	
	public static void button(WebElement el){
		el.click();
		
	}

	public static void SelectByValue(WebElement ele, String option) {
		Select obj = new Select(ele);
		obj.selectByValue(option);
		}

	public static void SelectByVisibleText(WebElement ele, String Text) {
		Select obj = new Select(ele);
		obj.selectByVisibleText(Text);
		}
	
	public static void SelectByIndex(WebElement ele, int i) {
		Select obj = new Select(ele);
		obj.selectByIndex(i);
		}
	
	public static String getTxtAttribute(WebElement element) {
		String a=element.getAttribute("value");
		return a;
		}

	public static boolean isElementVisible(String element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id(element)));
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
}
