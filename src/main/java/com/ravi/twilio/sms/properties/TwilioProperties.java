package com.ravi.twilio.sms.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TwilioProperties {

	public static final Properties CONFIG_PROPERTIES;
	static {
		CONFIG_PROPERTIES = loadConfigProperties();
	}

	public static String getAccountSID() {
		return CONFIG_PROPERTIES.getProperty("accountSid");
	}

	public static String getAuthToken() {
		return CONFIG_PROPERTIES.getProperty("authToken");
	}

	private static Properties loadConfigProperties() {
		Properties prop = new Properties();
		InputStream input = null;
		try {
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return prop;
	}

	public static String getTwilioNumber() {
		return CONFIG_PROPERTIES.getProperty("twilioNumber");
	}

}
