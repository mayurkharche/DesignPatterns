package com.pubsub;

public class CatLadySubscriber extends Subscriber {

	@Override
	void recieve(Message message) {
		
		System.out.println("Cat Lady Subscriber is processing the message...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Cat Lady Subscriber recieved a message:"+ message.getMsg());
		
	}

	@Override
	void subscribe(String topicName) {
		
		pubSubServer.subscribe(this, topicName);
		
	}

}
