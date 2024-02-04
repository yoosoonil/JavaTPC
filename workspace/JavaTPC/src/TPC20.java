import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {
	public static void main(String[] args) {

		Dog d = new Dog();
		d.eat(); // ? -> 개처럼 먹다.
	
		Cat c = new Cat();
		c.eat();
		c.night();
	
		// Dog.class, Cat.class
		Animal ani = new Dog();
		ani.eat(); // ? --> 강아지처럼 먹다.
	
		ani = new Cat();
		ani.eat(); // ? --> 강아지처럼 먹다.
		// ani.night();
		((Cat) ani).night(); // 밤에 눈에서 빛이난다. --> downcasting(강제형변환)
	}

}
