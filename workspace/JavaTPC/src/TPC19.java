import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC19 {
	public static void main(String[] args) {
		// Dog, Cat --> Animal
		Dog d = new Dog();
		d.eat();
		
		Cat c = new Cat();
		c.eat();
		
		//Dog dd = new Dog();
		//dd.eat();
		
		Animal ani = new Dog();
		ani.eat();
		
		ani = new Cat();
		ani.eat();
		
		

	}

}
