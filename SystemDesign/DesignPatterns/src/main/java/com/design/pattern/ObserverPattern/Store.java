package com.design.pattern.ObserverPattern;

import com.design.pattern.ObserverPattern.Observable.IphoneObeservableImpl;
import com.design.pattern.ObserverPattern.Observable.StocksObservable;
import com.design.pattern.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.design.pattern.ObserverPattern.Observer.MobileAlertObserverImpl;
import com.design.pattern.ObserverPattern.Observer.NotificationAlertObserver;

public class Store {
	
	public static void main( String[] args ) {
		StocksObservable iphoneStocksObservable=new IphoneObeservableImpl();
		
		NotificationAlertObserver observer1=new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer2=new EmailAlertObserverImpl("abc@gmail.com", iphoneStocksObservable);
		NotificationAlertObserver observer3=new MobileAlertObserverImpl("abc_username", iphoneStocksObservable);
		
		iphoneStocksObservable.add(observer1);
		iphoneStocksObservable.add(observer2);
		iphoneStocksObservable.add(observer3);
		
		iphoneStocksObservable.setStockCount(10);
		iphoneStocksObservable.setStockCount(0);
		iphoneStocksObservable.setStockCount(10);
	}

}
