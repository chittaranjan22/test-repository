package com.java8.features;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceExample {

	public static void main(String[] args) {
		
		Consumer<Person> consumer=(person) -> {
			System.out.println(person.getName());
			System.out.println(person.getAge());
		};
		
		Person p=new Person("Aman",25);
		consumer.accept(p);
		
		
		BiConsumer<Person, Person> biConsumer=(p1,p2) -> {
			
			System.out.println(p1.getName());
			System.out.println(p2.getName());
		};
		Person p1=new Person("Kumar",25);
		Person p2=new Person("Suman",23);
		biConsumer.accept(p1, p2);
	}

}
