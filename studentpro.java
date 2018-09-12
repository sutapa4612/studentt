package data;

public class studentpro {
	int id;
	String name;
	String branch;
	int age;
	char gender;
	String mob_no;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	@Override
	public String toString() {
		return "studentpro [id=" + id + ", name=" + name + ", branch=" + branch + ", age=" + age + ", gender=" + gender
				+ ", mob_no=" + mob_no + "]";
	}

}
