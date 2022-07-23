import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.AccessException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class Read
{
 public static void main(String[] args) throws IOException
 {
	 FileInputStream filesrc = FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Utkarshaa1 Classes March 2022\\Binary\\chromedriver.exe");
     
	 Properties prop = new Properties();
	 
	 prop.load(filesrc);
	 
	 System.setProperty(prop.getProperty("key"),prop.getProperty("driverpath"));
	 
	 WebDriver driver = new ChromeDriver();
	 driver.get(prop.getProperty("url"));
      }

private static FileInputStream FileInputStream(String string) {
	// TODO Auto-generated method stub
	return null;
}
   }




           
     
 
 
 
 



