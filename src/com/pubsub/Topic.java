package com.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Topic {
	
	private String name;
	private List<Subscriber> subscriberList;
	
	public Topic(String name) {
		super();
		this.name = name;
		subscriberList = new ArrayList<>();
	}
	
	public Boolean addSubscriber(Subscriber Subscriber){
		
		subscriberList.add(Subscriber);
		
		return true;
		
	}

	public String getName() {
		return name;
	}

	public List<Subscriber> getSubscriberList() {
		return subscriberList;
	}

}
