package kr.tpc;
public class Cat extends Animal{
	public void night() {
		System.out.println("밤에도 눈에 빛이 난다.");
	}
	
	@Override
	public void eat() {
		System.out.println("고양이처럼 먹다.");
	}
}
