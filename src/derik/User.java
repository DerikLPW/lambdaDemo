package derik;

public class User {
	private String name;
	private int age;
	private String gendle;
	
	public User(){
		name = "Derik";
		age = 18;
		gendle =  "male";
	}
	public User(String name, int age, String gendle){
		this.name= name;
		this.age = age;
		this.gendle = gendle;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGendle() {
		return gendle;
	}
	public void setGendle(String gendle) {
		this.gendle = gendle;
	}
	
}
