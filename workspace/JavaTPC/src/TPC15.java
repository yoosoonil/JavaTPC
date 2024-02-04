import kr.tpc.MemberVO;

public class TPC15 {
	public static void main(String[] args) {
		MemberVO m = new MemberVO("È«±æµ¿", 40, "010-1111-1111", "¼­¿ï");
		// setter method - X
		System.out.println(m.toString());
		System.out.println(m.getName());
		System.out.println(m.getAge());
		
		MemberVO m1 = new MemberVO();
		m1.setName("³ª±æµ¿");
		m1.setAge(34);
		m1.setTel("010-1111-1111");
		m1.setAddr("±¤ÁÖ");
		
		System.out.println(m1.getName()+"\t");
		System.out.println(m1.getAge()+"\t");
		System.out.println(m1.getTel()+"\t");
		System.out.println(m1.getAddr()+"\t");
		
		System.out.println(m1);
		

	}

}
