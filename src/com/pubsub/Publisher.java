package com.pubsub;

public abstract class Publisher {
	
	protected PubSubServer pubSubServer;
	
	Publisher(){
		
		pubSubServer = PubSubServer.getInstance();
	}
	
	abstract void publish(Message message, String topicName);
}
