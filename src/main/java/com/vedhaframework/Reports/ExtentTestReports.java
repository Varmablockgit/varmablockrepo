package com.vedhaframework.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vedhaframework.constants.Constants;

public class ExtentTestReports {

	public static ExtentReports extent;
	public static ExtentTest extenttest;
	public static ExtentSparkReporter sparkReporter;


	public static ExtentReports  extentReportsSetup() {

		sparkReporter= new ExtentSparkReporter(Constants.TestReportsPath) ;
		extent= new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Host Name", "Vedha");
		extent.setSystemInfo("Environment", System.getenv("USERNAME"));
		extent.setSystemInfo("User Name", "Priya SM");

		sparkReporter.config().setTimeStampFormat("MM/dd/yyyy");

		sparkReporter.config().setTheme(Theme.STANDARD);
		sparkReporter.config().setDocumentTitle("regression");
		sparkReporter.config().setReportName("TestAutomationreport");

		return extent;
	}


}
