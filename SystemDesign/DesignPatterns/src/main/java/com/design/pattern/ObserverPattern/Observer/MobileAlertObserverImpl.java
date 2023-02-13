package com.design.pattern.ObserverPattern.Observer;

import com.design.pattern.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

	String userName;
	StocksObservable observable; 
	
	public MobileAlertObserverImpl(String emailId, StocksObservable observable) {
		this.userName=emailId;
		this.observable=observable;
	}
	
	@Override
	public void update() {
		sendMsgOnMobile(userName,"product is in stock Hurry Up!");	
	}

	private void sendMsgOnMobile(String userName, String msg) {
		System.out.println("Msg sent to : " + userName);
		
	}

}
