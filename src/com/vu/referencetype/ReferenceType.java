package com.vu.referencetype;

class Person {
	
	public String name;
	private int age;
	
	public Person(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

public class ReferenceType {
	public static void main(String[] args) {
		Person j = new Person("Teo");
		j.setAge(20);
		celebrateBirthday(j);
		System.out.println(j.getAge());//21
	}
	
	static void celebrateBirthday(Person p) {
		p.setAge(p.getAge() + 1);
	}
}
