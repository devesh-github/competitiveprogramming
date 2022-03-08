package PracticeSet1;

class SafeDeposit {
	private static SafeDeposit singleton;

	public static SafeDeposit getInstance(int code) {
		if (singleton == null)
			singleton = new SafeDeposit(code);
		return singleton;
	}

	private int code;

	private SafeDeposit(int c) {
		code = c;
	}

	int getCode() {
		return code;
	}
}

public class BeSafe {
	// insert lots of code here
	public static void main(String[] args) {
		SafeDeposit sd = SafeDeposit.getInstance(6);
		System.out.println(sd.getCode());
		SafeDeposit sdd = SafeDeposit.getInstance(90);
		System.out.println(sdd.getCode());
	}
}
