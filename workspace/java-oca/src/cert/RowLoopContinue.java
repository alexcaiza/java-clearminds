package src.cert;

public class RowLoopContinue {

	public static void main(String[] args) {

		int count = 0;

		ROW_LOOP: for (int row = 1; row <= 3; row++) {
			System.out.println("row: " + row);
			for (int col = 1; col <= 2; col++) {

				System.out.println("col: " + col);
				System.out.println("row * col % 2: " + (row * col % 2));

				if (row * col % 2 == 0) {
					System.out.println("continue ROW_LOOP;");
					continue ROW_LOOP;
				}
				count++;
			}
		}
		System.out.println(count);

	}

}
