package people;

import java.util.Date;
import java.util.List;

public class Person {
	private Person father, mother;
	private Person spouse;
	private List<Person> children;
	private String name;
	private Gender gender;
	private Date birthDate;
	private String birthPlace;
	private String familySearchId;
	
	public Person(String name, Date birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}

	public Person getFather() {
		return father;
	}
	public void setFather(Person father) {
		this.father = father;
	}
	public Person getMother() {
		return mother;
	}
	public void setMother(Person mother) {
		this.mother = mother;
	}
	public Person getSpouse() {
		return spouse;
	}
	public void setSpouse(Person spouse) {
		this.spouse = spouse;
	}
	public List<Person> getChildren() {
		return children;
	}
	public void setChildren(List<Person> children) {
		this.children = children;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getBirthPlace() {
		return birthPlace;
	}
	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}
	public String getFamilySearchId() {
		return familySearchId;
	}
	public void setFamilySearchId(String familySearchId) {
		this.familySearchId = familySearchId;
	}

}
