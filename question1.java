interface Animals {
    void speak();
    void eat();	
}
 class Dog implements Animals{
	public void speak() {
		System.out.println("bark");
	}
	public void eat() {
		System.out.println("bones");
	}
 }
 class cat implements Animals{
		public void speak() {
			System.out.println("meow");
		}
		public void eat() {
			System.out.println("veggies");
		}
	 }

class question1{
 public static void main(String[] args) {
      Dog d=new Dog();
      d.speak();
      d.eat();
      cat c=new cat();
      c.speak();
      c.eat();
}
}