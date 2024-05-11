package basics;

public class twoD {

	public static void main(String[] args) {
		int[][] num = new int[3][3];
		num[0][0] = 1;
		num[0][1] = 2;
		num[0][2] = 3;
		num[1][0] = 4;
		num[1][1] = 5;
		num[1][2] = 6;
		for(int i = 0; i <= 1; i++) {
			if(i != 1) {
				for(int j = 0; j <= 2; j++) {
					System.out.print(num[i][j]);
			}
			System.out.println();
			} else {
				for(int j = 2; j >= 0; j--) {
					System.out.print(num[i][j]);
			}
			}
			
			
		}

	}

}
