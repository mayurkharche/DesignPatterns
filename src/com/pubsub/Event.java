package com.pubsub;

public class Event {
	
	private Message message;
	private Topic topic;
	
	public Event(Message mesaage, Topic topic) {
		super();
		this.message = mesaage;
		this.topic = topic;
	}
	
	public Message getMesaage() {
		return message;
	}
	
	public Topic getTopic() {
		return topic;
	}
}
