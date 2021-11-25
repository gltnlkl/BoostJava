package com.baa.boost031.Localization.ReLearnIf;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class GlobalStrings {
	
	private static final String BUNDLE_NAME = GlobalStrings.class.getPackageName() + ".text";
	
	private ResourceBundle resourceBundle;
	
	public GlobalStrings(String language, String country) {
		
		Locale locale = new Locale(language.toLowerCase(), country.toUpperCase());
		
		this.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
		
	}
	
	public GlobalStrings(String language) {
		
		Locale locale = new Locale(language.toLowerCase());
		
		this.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
		
	}
	
	public GlobalStrings() {
		
		this.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME);
		
	}
	
	public String getString(String key) {
		
		try {
			return this.resourceBundle.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
