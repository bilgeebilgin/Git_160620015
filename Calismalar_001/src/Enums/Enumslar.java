package Enums;

public class Enumslar {
   static DokumanTipi dk;
//
//	public static void main(String[] args) {
//
//		dk = DokumanTipi.PDF;
//		if (dk == DokumanTipi.Word) {
//			System.out.println("Dokuman tipi   " + DokumanTipi.Word);
//		} else if (dk == DokumanTipi.PDF) {
//			System.out.println("Dokuman tipi   " + DokumanTipi.PDF);
//		} else if (dk == DokumanTipi.HTML) {
//			System.out.println("Dokuman tipi   " + DokumanTipi.HTML);
//		} else {
//			System.out.println("Dokuman tipi   " + DokumanTipi.XML);
//		}
//
//		System.out.println(Topla(5));
//	}

	// kodun okunabilirliðini arttýrmak için kullandýgýmýz býr yontemdýr.
	// ekrN CIKTISI: Dokuman tipi PDF

	public enum DokumanTipi {
		Word, PDF, HTML, XML

	}

	@SuppressWarnings("unused")
	@Deprecated
	private static int Topla(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
