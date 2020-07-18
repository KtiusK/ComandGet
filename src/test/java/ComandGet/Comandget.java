package ComandGet;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comandget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Katiusca\\MiscelaneosSelenium\\ComandGet\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php");
	System.out.println(driver.getTitle());//Obtiene el título de la página web
	System.out.println(driver.getCurrentUrl());//obtiene la url de la página web
	
	//Definimos variables para validar el título de la página
	String actualTitle = driver.getTitle();
	String expectedTitle = "My Store";
	
	//Valida el título de la pagína
	if (actualTitle.contentEquals(expectedTitle)){
	      System.out.println("Test Passed!");
	    }else {
	      System.out.println("Test Failed!");
	    }
		
	//String handle = driver.getWindowHandle();
	System.out.println(driver.getWindowHandle());//obtiene identificador de la ventana actual
	System.out.println(driver.getWindowHandles());//obtiene indentificadores de las ventanas actuales
}
}
