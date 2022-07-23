import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

@SuppressWarnings("deprecation")
public class ProgramOperaMiniDemo
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.opera.driver","C:\\Users\\hp\\eclipse-workspace\\Utkarshaa Classes March 2022\\Binary\\msedgedriver.exe");
		
        WebDriver driver = new OperaDriver();
        
        driver.get("https://www.Amazon.in");
        
        driver.close();
        
	}

}
