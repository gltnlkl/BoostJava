package com.baa.boost031.Localization.Lesson029;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class GlobalsString {
	
	private static final String BUNDLE_NAME = GlobalsString.class.getPackageName() + ".messages"; //$NON-NLS-1$
	
	private ResourceBundle resourceBundle;
	
	public GlobalsString(String language, String country) {
		
		Locale locale = new Locale(language.toLowerCase(), country.toUpperCase());
		this.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
		
	}
	
	public GlobalsString(String language) {
		Locale locale = new Locale(language.toUpperCase());
		this.resourceBundle = ResourceBundle.getBundle(BUNDLE_NAME, locale);
	}
	
	public GlobalsString() {
		
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
