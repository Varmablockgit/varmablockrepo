package com.vedhaframework.ObjRepository;

public class NaukariLogoutPage {
	private static String myNaukari = "//div[contains(text(),'My Naukri')]";
	private static String logout = "//a[contains(text(),'Logout')]";
	
	public static String getMyNaukari() {
		return myNaukari;
	}
	public static String getLogout() {
		return logout;
	}

}
