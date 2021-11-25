package com.baa.boost032.Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LambdaLesson {
	
	public static void main(String[] args) {
		List<Person> users = new ArrayList<>();
		users.add(new Person(1, "Aleyna"));
		users.add(new Person(2, "Ahmet"));
		users.add(new Person(3, "Zehra"));
		users.add(new Person(4, "Murat"));
		users.add(new Person(5, "Yýldýz"));
		users.add(new Person(6, "Levent"));
		users.add(new Person(7, "Elvan"));
		
		users.stream().forEach(user -> user.talk());
		users.stream().forEach(Person::talk);// method reference
		
		List<Person> filteredList = users.stream().filter(user -> user.id > 5).collect(Collectors.toList());
		System.out.println("Filtered");
		filteredList.stream().forEach(Person::talk);
		
		List<Person> mappedList = users.stream().map(user -> new Person(user.id + 100, user.name))
				.collect(Collectors.toList());
		mappedList.stream().forEach(user -> System.out.println(user.toString()));
		
		Map<Integer, String> userMap = users.stream().collect(Collectors.toMap(user -> user.id, user -> user.name));
		
		userMap.forEach((key, value) -> System.out.println(key + " : " + value));
	}
	
}

class Person {
	
	int id;
	String name;
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	public void talk() {
		System.out.println("Hi, I am " + this.name);
	}
}
