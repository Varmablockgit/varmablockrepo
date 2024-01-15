package com.vedhaframework.Naukari;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vedhaframework.Basetest.Basetest;
import com.vedhaframework.NaukariReusables.NaukariUtils;
import com.vedhaframework.constants.Constants;
import com.vedhaframework.corecomponents.IDriverFactory.BrowserType;
import com.vedhaframework.corecomponents.SeleniumUtils;




@Listeners(com.vedhaframework.listeners.ExtentReportListeners.class)
public class Naukariscripts extends Basetest {
	
	
		SeleniumUtils seleniumUtils;
		NaukariUtils naukariUtils;
		
		public Naukariscripts() {
			naukariUtils = new NaukariUtils();
		}
		
		@BeforeMethod
		public void Initialization() {
			seleniumUtils = new SeleniumUtils(BrowserType.chrome, Constants.Naukari_Url, Constants.LONG_WAIT);
			//naukariUtils.CloseChildWindows(seleniumUtils);
			//naukariUtils.Popup(seleniumUtils);
		}
		
		@Test(priority=1, enabled=true, description="Verifying Naukari Login & Logout functionality")
		public void VerifyLoginPage() throws InterruptedException, IOException {
			String nameofCurrMethod = new Exception()
	                .getStackTrace()[0]
	                .getMethodName();

			try {

				
				logger.info("Verify Login");
				
				
			    SeleniumUtils.getScreenshot(driver, "Failed_Tc"+ nameofCurrMethod);
			    naukariUtils.NaukariLogin(seleniumUtils);
			    logger.info("login successfull");
			    seleniumUtils.Sleep();
			    naukariUtils.NaukariLogoutFunc(seleniumUtils);
			    logger.info("logout success");
			}
			catch(Exception e) {
				e.printStackTrace();
	        }
		}
		
		@Test(priority=2, enabled=true, description="Verifying Naukari Registration functionality")
		public void VerifyRegPage() {
			try {
				logger.info("reg started");
				naukariUtils.RegFunc(seleniumUtils);
				logger.info("reg success");
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
		@AfterMethod
		public void Dispose() {
			seleniumUtils.CloseAllWindows();
			
		}

	}



