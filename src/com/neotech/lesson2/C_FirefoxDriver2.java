package com.neotech.lesson2;

public class C_FirefoxDriver2 implements I_WebDriver {
	
	public C_FirefoxDriver2() {
		System.out.println("Firefox is opening!");
	}

	@Override
	public void get(String url) {
		System.out.println("Firefox navigates to " + url);
	}
	

	@Override
	public void getTitle() {
		System.out.println("Page Title!");
	}
	

	@Override
	public void getCurrentUrl() {
		System.out.println("Current Url");
	}
	

	@Override
	public void close() {
		System.out.println("Firefox is closing!");
	}
	

	@Override
	public void quit() {
		System.out.println("Firefox is quitting!");
	}
	
	
	

}
