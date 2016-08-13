package com.ravi.twilio.sms.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.ravi.twilio.sms.SmsExample;
import com.twilio.sdk.resource.api.v2010.account.Message;

public class SmsExampleTest {
	
	SmsExample smsExample = new SmsExample();

	@Test
	public void testSampleSms() {
	    Message message = smsExample.sendMessageFromTwilioNumber("replaceWithTheNumberYouWantToText");
	    assertNotNull(message);
	    
	}

}
