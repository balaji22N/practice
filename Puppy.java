class Puppy {
	int age;
	String name;
	static int eyes = 2;
	public Puppy() {
		
	}
	public Puppy(int age, String name) {
		this.age = age;
		this.name = name;
	}
	void display() {
	 	System.out.println("Puppy " +name +" age is " +age +"has eyes" +eyes);
	}
	public static void main(String[] args) {
		Puppy brucy = new Puppy(26, "brucy");
		System.out.println("puppy " +brucy.name +"age is" + brucy.age);
		Puppy jimmy = new Puppy(34, "jimmy");
		System.out.println("puppy" +jimmy.name +"age is" + jimmy.age);
		brucy.display();
		Puppy tom = new Puppy();
		tom.name = "tom";
		tom.age = 2;
		tom.display();
	}
}