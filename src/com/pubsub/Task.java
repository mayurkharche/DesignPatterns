package com.pubsub;

import java.util.List;

public class Task implements Runnable{
	
	private Event event;
	
	Task(Event event){
		
		this.event = event;
	}

	@Override
	public void run() {
		
		Topic topic = event.getTopic();
		
		List<Subscriber> list = topic.getSubscriberList();
		
		list.forEach(x -> x.recieve(event.getMesaage()));
		
	}
}
