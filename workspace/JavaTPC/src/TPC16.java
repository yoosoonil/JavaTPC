import kr.tpc.OverLoad;

public class TPC16 {
	public static void main(String[] args) {
		// 1+1=?, 23.4+56=?, 56.7+78.9=?
		OverLoad ov = new OverLoad();
		ov.hap(20, 50); // ov.hap_int_int(20, 50)
		ov.hap(23.5f, 20); // ov.hap_float_int(23.5f, 20)
		ov.hap(23.5f, 25.5f); // ov.hap_float_float(23.5f, 25.5f)
	}

}
