package com.vedhaframework.Naukari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scripts {
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://hiring.monster.com/signin.aspx?redirect=https%3a%2f%2fhiring.monster.com%2fdefault.aspx%3fHasUserAccount%3d2&reloadCA=0");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_ContentPlaceHolderBase_cphBody_NewCreateAccount_UserInformation_txtEmail']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_ContentPlaceHolderBase_cphBody_NewCreateAccount_accountInformation_txtCompanyPhone']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_ContentPlaceHolderBase_cphBody_NewCreateAccount_accountInformation_txtCompanyName']")).sendKeys("ABC");
		driver.findElement(By.xpath("//input[@id='ctl00_ctl00_ContentPlaceHolderBase_cphBody_NewCreateAccount_accountInformation_txtZipCode']")).sendKeys("501510");
		driver.findElement(By.xpath("//button[@id='ctl00_ctl00_ContentPlaceHolderBase_cphBody_NewCreateAccount_btnContinue']")).click();
	}

}
