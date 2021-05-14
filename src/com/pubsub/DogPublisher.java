package com.pubsub;

public class DogPublisher extends Publisher{

	@Override
	void publish(Message message, String topicName) {

		pubSubServer.sendMessage(message, topicName);
	}
}
