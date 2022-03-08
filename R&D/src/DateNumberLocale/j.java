package DateNumberLocale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class j {
	public static void main(String[] args) {

		Integer i1 = 2001; // set 1
		Integer i2 = 2001;
		System.out.println((i1 == i2) + " " + i1.equals(i2)); // output 1
		Integer i3 = 21; // set 2
		Integer i4 = new Integer(21);
		System.out.println((i3 == i4) + " " + i3.equals(i4)); // output 2
		Integer i5 = 128; // set 3
		Integer i6 = 128;
		System.out.println((i5 == i6) + " " + i5.equals(i6)); // output 3
	}

	public void go() {
		NumberFormat nf, nf2;
		Number n = 0;
		Locale[] la = NumberFormat.getAvailableLocales();
		for (int x = 0; x < 10; x++) {
			nf = NumberFormat.getCurrencyInstance(la[x]);
			System.out.println(nf.format(123.456f));
		}
		nf2 = NumberFormat.getInstance();
		try {
			n = nf2.parse("123.456f");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(n);
	}
}