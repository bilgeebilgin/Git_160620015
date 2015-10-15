import java.util.ArrayList;
import java.util.Stack;

public class Soru1 {
	static int a;

	static Stack<Integer> stack;
	static int sayi1, sayi2, sayi3, top, dem;
	static ArrayList<Stack<Integer>> perfect;
	static ArrayList<Integer> essiz;

	public static void main(String[] args) {

		stack = new Stack<Integer>();
		perfect = new ArrayList<Stack<Integer>>();
		a = 987654321;

		for (int i = a; i > 0; i--) {
//			System.out.println("Sayimiz   " + i);
			// rakamlarý farklý mý?
			if (true == rakamlarFarkliMi(i)) {
				hesapla(i);
				a--;
			}
		}

	}

	private static void hesapla(int sayi) {

		// basamaklarýna ayýr
		// diziye cevir
		int[] dizimiz = diziyeCevir(BasamakAyir(sayi));

		top = 0;
		for (int i = 0; i < dizimiz.length - 2; i++) {
			sayi1 = dizimiz[i];
			sayi2 = dizimiz[i + 1];
			sayi3 = dizimiz[i + 2];

			if ((Math.pow(sayi1, 2) / 2) > sayi2 * sayi3) {
				top++;
			}

		}
		if (top == dizimiz.length - 2) {
			System.out.println(sayi);
		}

	}

	private static int[] diziyeCevir(Stack stack) {
		int[] dizi = new int[stack.size()];
		for (int i = 0; i < stack.size(); i++) {
			dizi[i] = (int) stack.pop();
		}
		return dizi;

	}

	public static Stack<Integer> BasamakAyir(int sayi) {
		stack.clear();
		int i = 1;
		while (sayi != 0) {

			stack.push(sayi % 10);

			sayi = sayi / 10;
			i *= 10;
		}

//		System.out.println("stack dizimiz " + stack);
		return stack;
	}

	// rakamlarý farklý ise geriye boolean true gönderecek
	private static boolean rakamlarFarkliMi(int sayi) {

		 Stack<Integer>stack = BasamakAyir(sayi);
		int a = stack.pop();
		int kop=1;
		
		for (int j = 0; j < stack.size(); j++) {
			if (a == stack.pop()) {
				kop--;
				return false;
			} else {
				kop++;
			}
			
			if (kop==stack.size()) {				
				System.out.println("rakamlar farklidir " + sayi);
				return true;
			}
		}
		
		
		return false;

	}

}
