                package com.amazon_assignment;

                import java.time.Duration;
                import java.util.Set;
                import org.openqa.selenium.By;
                import org.openqa.selenium.JavascriptExecutor;
                import org.openqa.selenium.WebDriver;
                import org.openqa.selenium.WebElement;
                import org.openqa.selenium.chrome.ChromeDriver;
                import org.openqa.selenium.support.ui.Select;

                public class Amazon_All {
                public static void main(String[] args) throws InterruptedException {
	
    	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\naveen\\eciplse second\\Amazon_Assignment\\Driver\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_97oujmv431_e&adgrpid=61666692631&hvpone=&hvptwo=&hvadid=486447282128&hvpos=&hvnetw=g&hvrand=12860261141402486589&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061935&hvtargid=kwd-296527734911&hydadcr=14450_2154367&gclid=CjwKCAjwmJeYBhAwEiwAXlg0AUxtFI28z-TyLYZszbxqh94AjlrbiQMdapS3Hl2Ye7ONAc8VEhxhABoC9SYQAvD_BwE");
                driver.manage().window().maximize();
                driver.navigate().refresh();
              
                Thread.sleep(2000);
                                                                                                                                                                      //signin
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
	
       	        Thread.sleep(2000);
       	                                                                                                                                      //searching product                
    		    Select books = new Select(driver.findElement(By.id("searchDropdownBox")));    
    		    books.selectByValue("search-alias=stripbooks");
    	        WebElement  search2 = driver.findElement(By.id("nav-search-submit-button"));
    		    search2.click();
    			
    	    	Thread.sleep(2000);
    	    	                                                                                                                                                      //filter 
    	   	    WebElement english = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li[1]/span/a/div"));   
    	   	    JavascriptExecutor scroll9 = (JavascriptExecutor) driver;
    	 	    scroll9.executeScript("arguments[0].scrollIntoView();", english);
    	 	    scroll9.executeScript("arguments[0].click();", english);
    	    	
    	 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 	 
    	 	    WebElement name = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));  //atomic habits book
    	        JavascriptExecutor scroll10 = (JavascriptExecutor) driver;
    	 	    scroll10.executeScript("arguments[0].scrollIntoView();", name);
    	 	    scroll10.executeScript("arguments[0].click();", name);
    	 	  
    	 	    Set<String> windowHand1 = driver.getWindowHandles();                               //new tab
    	 	    for (String all1 : windowHand1) {
    	 	 	System.out.println(all1);
    	 	 	String title1 = driver.switchTo().window(all1).getCurrentUrl();
    	 	 	System.out.println(title1);
    	 	 	String currentUrl1 = driver.switchTo().window(all1).getCurrentUrl();
    	 	 	System.out.println(currentUrl1);
    	 	    }
    	 	 
    		     JavascriptExecutor scroll6 = (JavascriptExecutor) driver;
    	 	     scroll6.executeScript("window.scrollBy(0,1000)");
    	 	     
    	 	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 	     
    	 	     Select quantity = new Select(driver.findElement(By.id("quantity")));   //selecting quantity
    		     quantity.selectByValue("2");
    		     
    		     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    		                                                                                                                                       //adding to cart
    		     WebElement addtocart2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/div[1]/div[5]/div[2]/div/div/div/div/form/div/div/div/div/div[3]/div/div[41]/div[1]/span/span/span/input"));
    	  	     JavascriptExecutor scroll7 = (JavascriptExecutor) driver;
    		     scroll7.executeScript("arguments[0].scrollIntoView();", addtocart2);
    		     scroll7.executeScript("arguments[0].click();", addtocart2);
    	   
    			  Thread.sleep(3);
    			  
    			  driver.navigate().refresh();	
    		                                                                                                                                    //moving to cart
    			  WebElement cart = driver.findElement(By.xpath("//*[@id=\"nav-cart-count-container\"]"));   
    			  cart.click();
    			 	 
    			  WebElement buy = driver.findElement(By.name("proceedToRetailCheckout"));    //buying
    			  buy.click();
    			                                                                                                                               //filling address details
    		      WebElement fullname = driver.findElement(By.name("address-ui-widgets-enterAddressFullName"));
    			   fullname.sendKeys("naveen kumar");
    				  
    			   WebElement mobilenumber = driver.findElement(By.name("address-ui-widgets-enterAddressPhoneNumber"));
    			   mobilenumber.sendKeys("8939314308");
    				  
    			   WebElement pincode = driver.findElement(By.name("address-ui-widgets-enterAddressPostalCode"));
    			   pincode.clear();
    			   pincode.sendKeys("600049");
    				  
    			   WebElement flatno = driver.findElement(By.name("address-ui-widgets-enterAddressLine1"));
    			   flatno.sendKeys("12");
    				  
    			  WebElement address = driver.findElement(By.name("address-ui-widgets-enterAddressLine2"));
    			  address.sendKeys("Veeraragava nagar, Agraharam, Villivakkam");
    				  
    			  WebElement landmark = driver.findElement(By.name("address-ui-widgets-landmark"));
    			   landmark.sendKeys("Departmental store");
    				  
    			   WebElement city = driver.findElement(By.name("address-ui-widgets-enterAddressCity"));
    		       city.clear();
    			   city.sendKeys("CHENNAI");
    				  
    			   WebElement  defaultaddress= driver.findElement(By.name("address-ui-widgets-use-as-my-default"));
    			   defaultaddress.click();
    				  
    			   JavascriptExecutor scroll11 = (JavascriptExecutor) driver;
    			   scroll11.executeScript("window.scrollBy(0,500)");
    				   
    			   WebElement  use = driver.findElement(By.id("address-ui-widgets-form-submit-button"));
    			   use.click();
    			  
    			   Thread.sleep(3000);
    			                                                                                                                                     //payments page
    			   JavascriptExecutor scroll14 = (JavascriptExecutor) driver;                        //scrolling down
    			   scroll14.executeScript("window.scrollBy(0,500)");
    			   
    			   Thread.sleep(5000);
    			   
    			   JavascriptExecutor scroll15 = (JavascriptExecutor) driver;                             //scrolling up
    			   scroll15.executeScript("window.scrollBy(0,-1000)");
    				    
    			   driver.navigate().back();
    			   driver.navigate().back();                                                                                    //returning back
    			   
    			   Thread.sleep(3000);
    			   
    			   WebElement home = driver.findElement(By.id("nav-logo-sprites"));     //home button
    			   home.click();
    				  
    			   driver.navigate().refresh(); 
    	           driver.close();
    	           driver.quit();                                                                                                       //quitting browser
                 
                   }
	
                   }
