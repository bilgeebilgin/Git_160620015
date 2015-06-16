import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Annotations.myAnnotations;
import Log4j.Log4jExample;

public class Main {

	private static final Logger LOG = LoggerFactory.getLogger(Main.class);

	@myAnnotations
	// office bilgisayar implement ediiyor.
	public static void main(String[] args) {

		// System.out
		// .println(" Annotations Ornekleri*******************************************");
		//
		// MyComputer com = new MyComputer();
		// com.workEclipse();
		//
		// com.workEclipseLast(); // @Deprecated fonksiyon
		//
		// bosluk(3);
		//
		// MyOffice of = new MyOffice();
		// of.workEclipse();
		// of.workEclipseLast();
		//
		// bosluk(3);

		//
		// System.out
		// .println("Enums Írnekleri*******************************************");
		// DokumanTipi dk;
		//
		// bosluk(3);
		//
		// dk = DokumanTipi.PDF;
		// if (dk == DokumanTipi.Word) {
		// System.out.println("Dokuman tipi   " + DokumanTipi.Word);
		// } else if (dk == DokumanTipi.PDF) {
		// System.out.println("Dokuman tipi   " + DokumanTipi.PDF);
		// } else if (dk == DokumanTipi.HTML) {
		// System.out.println("Dokuman tipi   " + DokumanTipi.HTML);
		// } else {
		// System.out.println("Dokuman tipi   " + DokumanTipi.XML);
		// }
		// bosluk(3);

		System.out
				.println("Log4j   Írnekleri*******************************************");
		Log4jExample log = new Log4jExample();

		LOG.info("main info message");

	}

	private static void bosluk(int a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a; i++) {
			System.out.println();
		}
	}

}
