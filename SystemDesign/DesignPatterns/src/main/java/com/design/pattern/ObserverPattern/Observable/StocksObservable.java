package com.design.pattern.ObserverPattern.Observable;

import com.design.pattern.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {
	
	public void add(NotificationAlertObserver observer);
	
	public void remove(NotificationAlertObserver observer);
	
	public void notifySubscribers();
	
	public void setStockCount(int newStockAdded); 
	
	public int getStockCount();

}
