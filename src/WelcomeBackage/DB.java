package WelcomeBackage;

public class DB {
	static Object[][] arr = new Object[3][4];
	static Object arrFind[] = new Object[4];

	public static void Info() {
		arr[0][0] = 101;
		arr[0][1] = "Ahmed";
		arr[0][2] = "Baghdad";
		arr[0][3] = 100000;
		arr[1][0] = 102;
		arr[1][1] = "Ali";
		arr[1][2] = "Karbalaa";
		arr[1][3] = 900000;
		arr[2][0] = 103;
		arr[2][1] = "Yousif";
		arr[2][2] = "Basrah";
		arr[2][3] = 700000;
	}

	public static Object[] getInfo(int No) {
		int i = 0;
		int j = 0;
		Info();
		for (i = 0; i < arr.length; i++) {
			if ((int) arr[i][0] == No) {
				for (j = 0; j < arr[i].length; j++) {
					arrFind[j] = arr[i][j];
				}
			}
		}
		return arrFind;
	}

	public static void ResetInfo() {
		arrFind = null;
	}

}
