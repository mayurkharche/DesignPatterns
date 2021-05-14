package com.pubsub;

public abstract class Subscriber {
	
	protected PubSubServer pubSubServer;
	
	public Subscriber() {
		
		this.pubSubServer = PubSubServer.getInstance();
	}
	
	abstract void recieve(Message message);
	
	abstract void subscribe(String topicName);
}
