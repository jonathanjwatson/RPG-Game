package com.mysterywarriorsofzin;

public class Character {

	private final Integer MAX_LEVEL = 10;
	private final Integer MIN_LEVEL = 1;

	private String name;
	private String catchPhrase;
	private Integer age;
	private Integer level;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCatchPhrase() {
		return catchPhrase;
	}

	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		if (level < MIN_LEVEL || level > MAX_LEVEL) {
			this.level = 1;
		} else {
			this.level = level;
		}

	}

	public Character() {
		this.name = "Nameless Wizard";
		this.catchPhrase = "Booya!";
		this.age = 90;
		this.level = 1;
	}

	public Character(String name, String catchPhrase, Integer age, Integer level) {
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.age = age;
		setLevel(level);
	}

	public void startQuest() {
		System.out.println(name + " embarks on his great quest to free the people of Zin. Though they are " + age
				+ " years old, he bravely says, " + catchPhrase);
	}

	@Override
	public String toString() {
		return "Character [name=" + name + ", catchPhrase=" + catchPhrase + ", age=" + age + ", level=" + level + "]";
	}

}
