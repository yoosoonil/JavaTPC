package kr.tpc;
public class Dog extends Animal {
	// 이름, 나이, 종: 상태정보
	// 재정의(override)
	public void eat() {
		System.out.println("강아지처럼 먹다.");
	}
}
