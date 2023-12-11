package lab_2;

public class PascalTriangle {
	// This method is used to display a Pascal triangle based on the parameter n.
		// Where n represents the number of rows
		public static void printPascalTriangle(int row) {
			// TODO
			 for (int i = 1; i <= row; i++) {
			 int[] currentRow = getPascalTriangle(i);
	         for (int j = 0; j < currentRow.length; j++) {
	             System.out.print(currentRow[j] + " ");
	         }
	         System.out.println();
			 }

		}

		// get the nth row.
		// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
		public static int[] getPascalTriangle(int n) {
			if (n == 1)
				return new int[] { 1 };
			else {
				int[] preRow = getPascalTriangle(n - 1);
				return generateNextRow(preRow);
			}
		}

		// generate the next row based on the previous row
		// Ex. prevRow = {1} ==> nextRow = {1, 1}
		// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
		public static int[] generateNextRow(int[] prevRow) {
			int[] result = new int[prevRow.length +1];
			result[0] = 1;
			result[result.length -1] = 1;
			for (int i = 1; i < result.length - 1; i++) {
				result[i] = prevRow[i - 1] + prevRow[i];
			}

			return result;
		}

		public static void main(String[] args) {
			  int rowNumber = 5; // Đổi số hàng tại đây

			    // Gọi phương thức printPascalTriangle để hiển thị tam giác Pascal
			    printPascalTriangle(rowNumber);
		}

}
