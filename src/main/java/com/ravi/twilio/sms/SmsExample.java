package com.ravi.twilio.sms;

import com.ravi.twilio.sms.properties.TwilioProperties;
import com.twilio.sdk.Twilio;
import com.twilio.sdk.resource.api.v2010.account.Message;
import com.twilio.sdk.creator.api.v2010.account.MessageCreator;
import com.twilio.sdk.type.PhoneNumber;

public class SmsExample {

	public Message sendMessageFromTwilioNumber(String toPhoneNumber) {
		Twilio.init(TwilioProperties.getAccountSID(), TwilioProperties.getAuthToken());
		
		Message message = new MessageCreator(
			      TwilioProperties.getAccountSID(),
			      new PhoneNumber(toPhoneNumber),
			      new PhoneNumber(TwilioProperties.getTwilioNumber()),
			      "Hello from Java"
			    ).execute();
		return message;
	}

}
