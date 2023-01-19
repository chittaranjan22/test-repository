package com.java8.features;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateInterfaceExample {

	public static void main(String[] args) {
		//condition
		Predicate<Person> predicate= (person) -> person.getAge()>20;

		Person p1=new Person("Anil",19);		
		System.out.println(predicate.test(p1));
		
		Person p2=new Person("Dinesh",17);		
		BiPredicate<Person, Person> biPredicate= (person1,person2) -> person1.getAge()>person2.getAge();
		System.out.println(biPredicate.test(p1,p2));
		
	}

}
