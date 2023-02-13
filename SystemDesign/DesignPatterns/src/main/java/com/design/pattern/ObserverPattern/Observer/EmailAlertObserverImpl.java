package com.design.pattern.ObserverPattern.Observer;

import com.design.pattern.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

	String emailId;
	StocksObservable observable;
	
	public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
		this.emailId=emailId;
		this.observable=observable;
	}
	@Override
	public void update() {
		sendMail(emailId,"product is in stock Hurry Up!");
		
	}
	private void sendMail(String emailId, String msg) {
		System.out.println("Mail sent to : " + emailId);
		
	}

}
