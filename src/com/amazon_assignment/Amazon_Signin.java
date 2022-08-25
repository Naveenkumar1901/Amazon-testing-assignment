       package com.amazon_assignment;

        import java.time.Duration;

       import org.openqa.selenium.By;
       import org.openqa.selenium.WebDriver;
       import org.openqa.selenium.WebElement;
       import org.openqa.selenium.chrome.ChromeDriver;

       public class Amazon_Signin {
       public static void main(String[] args) {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\naveen\\eciplse second\\Amazon_Assignment\\Driver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_97oujmv431_e&adgrpid=61666692631&hvpone=&hvptwo=&hvadid=486447282128&hvpos=&hvnetw=g&hvrand=12860261141402486589&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061935&hvtargid=kwd-296527734911&hydadcr=14450_2154367&gclid=CjwKCAjwmJeYBhAwEiwAXlg0AUxtFI28z-TyLYZszbxqh94AjlrbiQMdapS3Hl2Ye7ONAc8VEhxhABoC9SYQAvD_BwE");
      driver.manage().window().maximize();
      driver.navigate().refresh();	
     
      WebElement signin= driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
	  signin.click();
	 	
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  WebElement mailid = driver.findElement(By.name("email"));
	  mailid.sendKeys("naveenkumar1911998@gmail.com");
	  
	  WebElement continuebtn1= driver.findElement(By.id("continue"));
	  continuebtn1.click();
	 
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("amazon@12345");
	  
	  WebElement signin2= driver.findElement(By.id("signInSubmit"));
	  signin2.click();
	 
	  driver.navigate().refresh();
	  
      }
      }
