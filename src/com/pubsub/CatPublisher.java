package com.pubsub;

public class CatPublisher extends Publisher{

	@Override
	void publish(Message message, String topicName) {
		
		pubSubServer.sendMessage(message, topicName);
		
	}
}
