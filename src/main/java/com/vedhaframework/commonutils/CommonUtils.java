package com.vedhaframework.commonutils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.PropertyConfigurator;

import com.vedhaframework.constants.Constants;

public class CommonUtils {
	
		
		public static String getCurrentDate() {
			// TODO Auto-generated method stub
		SimpleDateFormat dateFormat= new SimpleDateFormat("_ddMMyyyy_HHmmss");
		Date date = new Date();
		return dateFormat.format(date);
		
		}
		

		
		public static void SetLog4j() {
			// TODO Auto-generated method stub
		SimpleDateFormat dateFormat= new SimpleDateFormat("_ddMMyyyy_HHmmss");
		Date date = new Date();
		String currentDate= dateFormat.format(date);
	    System.setProperty("current_date", currentDate);
	    PropertyConfigurator.configure(Constants.LoggersPath);
		}

	}



