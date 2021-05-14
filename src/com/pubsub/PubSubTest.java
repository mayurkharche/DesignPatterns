package com.pubsub;

public class PubSubTest {

	public static void main(String[] args) {
		
		PubSubServer pubSubServer = PubSubServer.getInstance();
		
		pubSubServer.addTopic("dog");
		pubSubServer.addTopic("cat");
		
		Publisher dogPub = new DogPublisher();
		Publisher catPub = new CatPublisher();
		
		Subscriber animalLovarSub = new AnimalLoverSubscriber();
		Subscriber catLadySub = new CatLadySubscriber();
		
		animalLovarSub.subscribe("dog");
		animalLovarSub.subscribe("cat");
		
		catLadySub.subscribe("cat");
		
		dogPub.publish(new Message("Hey!!! a message to a dog subscriber"), "dog");
		
		catPub.publish(new Message("Meow!!! a message to a cat subcriber"), "cat");

	}

}
