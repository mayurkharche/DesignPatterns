package com.pubsub;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PubSubServer {
	
	private static PubSubServer instance;

	private Map<String, Topic> map;
	private Queue<Event> messageQueue;
	private ExecutorService executorService;

	private PubSubServer() {

		messageQueue = new LinkedList<>();
		map = new HashMap<>();
		executorService = Executors.newSingleThreadExecutor();
	}

	public void addTopic(String topicName) {

		if (map.containsKey(topicName)) {
			System.out.println("Topic already exists");
		} else {

			map.put(topicName, new Topic(topicName));
			System.out.println("Topic created successfully");
		}
	}

	public void subscribe(Subscriber subscriber, String topicName) {

		Topic topic = checkForTopicExistance(topicName);
		
		if(null != topic)
			topic.addSubscriber(subscriber);
	}

	public void sendMessage(Message message, String topicName) {

		Topic topic = checkForTopicExistance(topicName);
		
		if(null != topic){
			Event event = new Event(message, topic);
			messageQueue.add(event);
			executorService.execute(new Task(event));
		}
	}

	private Topic checkForTopicExistance(String topicName) {

		Topic topic = map.getOrDefault(topicName, null);

		if (null == topic) {
			System.out.println("Topic does not exist");
		}
		
		return topic;

	}
	
	public static PubSubServer getInstance(){
		
		if(null == instance){
			instance = new PubSubServer();
		}
		
		return instance;
	}
}
