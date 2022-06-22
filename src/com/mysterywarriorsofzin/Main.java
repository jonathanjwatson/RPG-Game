package com.mysterywarriorsofzin;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Mystery Warriors of Zin!");
		Utils.tellTheStory();

//		Character randomCharacter = new Character();
//		System.out.println(randomCharacter.toString());

//		Character jonathan = new Character("Jonathan the Brave", "Did I do that?", 192, 10);
//		System.out.println(jonathan.toString());

		Scanner input = new Scanner(System.in);
		System.out.println("What is your name, brave warrior?");
		String name = input.nextLine();
		
		System.out.printf("What is your catch phrase, %s?\n", name);
		String catchPhrase = input.nextLine();
		
		System.out.printf("What is your age, %s? \n", name);
		Integer age = input.nextInt();
		
		System.out.printf("What is your level, %s? \n", name);
		Integer level = input.nextInt();

		Character jonathan = new Character(name, catchPhrase, age, level);

		System.out.println(jonathan.toString());
		
		jonathan.startQuest();
		
		
		Utils.endTheStory();
	}
}
