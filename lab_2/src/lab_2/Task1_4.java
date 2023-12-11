package lab_2;

public class Task1_4 {
	public static void main(String[] args) {
		int n = 3; // Số đĩa
		char cotGoc = 'A', cotPhu = 'B', cotDich = 'C';

		System.out.println("Các bước giải bài toán Tháp Hà Nội:");
		giaiThapHanoi(n, cotGoc, cotPhu, cotDich);
	}

	public static void giaiThapHanoi(int n, char cotGoc, char cotPhu, char cotDich) {
		if (n == 1) {
			System.out.println("Di chuyển đĩa 1 từ cột " + cotGoc + " sang cột " + cotDich);
			return;
		}

		giaiThapHanoi(n - 1, cotGoc, cotDich, cotPhu);

		System.out.println("Di chuyển đĩa " + n + " từ cột " + cotGoc + " sang cột " + cotDich);

		giaiThapHanoi(n - 1, cotPhu, cotGoc, cotDich);
	}

}
