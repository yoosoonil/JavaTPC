import kr.tpc.*;
public class TPC21 {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.night();
		c.eat();
		
		// Dog.class, Cat.class
		Animal ani = new Dog(); // upcasting
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		((Cat)ani).night(); // downcasting
		
	}

}
