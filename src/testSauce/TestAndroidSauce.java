package testSauce;

import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import testSauce.Strings;



public class TestAndroidSauce {
	
	  public static MobileDriver driver;
	
	  public static final String USERNAME = "kurt.reyes";
	  public static final String ACCESS_KEY = "12fb868d-5cbf-4fed-b1c2-673768608724";
	  public static final String URL = "https://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:443/wd/hub";
	 
	  public static String privacyPolicyURL = "https://www.globe.com.ph/privacy-policy.html";
	  public static String payNowURL = "https://www.globe.com.ph/paybill";
	  public static String helpAndSupportURL = "https://www.globe.com.ph/help/broadband/prepaid-wifi.html";
	  
	  
@BeforeTest
	  public void setUp() throws MalformedURLException {
	 
		  DesiredCapabilities caps = DesiredCapabilities.android();
		  caps.setCapability("appiumVersion", "");
		  caps.setCapability("deviceName","Google Pixel GoogleAPI Emulator");
		  caps.setCapability("deviceOrientation", "portrait");
		  caps.setCapability("browserName", "");
		  caps.setCapability("platformVersion","8.0");
		  caps.setCapability("platformName","Android");
		  caps.setCapability("app","sauce-storage:Globe-At-Home.zip");
		  caps.setCapability("name", "LoginBBApp");
		  
	     driver = new AndroidDriver<>(new URL(URL), caps);
	 

	     	//Login
	     
	  }
	
	  @Test
	     public void Walkthrough() {
		  
		  	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  	driver.findElementById(Strings.walktrough).click();
	  }
	  

	  @Test(priority = 2, dependsOnMethods = "Walkthrough")
	  
	     public void AccountNumber() {
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_9").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_4").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_5").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_1").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_2").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_9").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_9").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_6").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_2").click();
	     		
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_submit").click();
	     	
	  }
	  
	  @Test(priority = 3, dependsOnMethods = "AccountNumber")
	     public void pinCode() {
	     	//Login Setup
	     		
	     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     		
	     	driver.findElementById("ph.com.globe.globeathome:id/iv_modem").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/btn_already_connected").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/tv_skip").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/btn_positive").click();
	     	
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	
	     	driver.findElementById("ph.com.globe.globeathome:id/pbtn_pin_submit").click();
	     	
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	driver.findElementById("ph.com.globe.globeathome:id/spbtn_pin_key_0").click();
	     	
	     	driver.findElementById("ph.com.globe.globeathome:id/pbtn_pin_submit").click();	
	     	
	     	driver.findElementById("ph.com.globe.globeathome:id/skip").click();
	     	
	     	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     	
	     	driver.findElementById("ph.com.globe.globeathome:id/iv_feature_walkthrough").click();
	     	
	     	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	     		
	     	driver.findElementById("ph.com.globe.globeathome:id/display_name").getText().compareTo("Ka-Globe!");
	     	
	     	driver.quit();
	     	
	     }
	     		
	     	}

	    	
	    	
	    
	    


