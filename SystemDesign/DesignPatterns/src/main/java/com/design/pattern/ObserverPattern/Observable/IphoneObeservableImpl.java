package com.design.pattern.ObserverPattern.Observable;

import java.util.List;
import java.util.ArrayList;

import com.design.pattern.ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObeservableImpl implements StocksObservable{

	public List<NotificationAlertObserver> observerList=new ArrayList<>();
	
	public int stockCount=0;
	
	@Override
	public void add(NotificationAlertObserver observer) {
		observerList.add(observer);
		
	}

	@Override
	public void remove(NotificationAlertObserver observer) {
		observerList.remove(observer);
		
	}

	@Override
	public void notifySubscribers() {
		for(NotificationAlertObserver observer:observerList) {
			observer.update();
		}
		
	}

	@Override
	public void setStockCount(int newStockAdded) {
		if(stockCount==0) {
			notifySubscribers();
		}
		stockCount=stockCount+newStockAdded;		
	}

	@Override
	public int getStockCount() {
		
		return stockCount;
		
	}

}
