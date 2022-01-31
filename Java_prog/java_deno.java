package Java_prog;

public class java_deno {
	public void abc() {
		System.out.println("method name is abc");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] cars = { { 1, 2, 3 }, { 5, 6, 7 }, { 8, 9, 10 } };
		System.out.println(cars.length);
		System.out.println(cars[1].length);

		for (int i = 0; i < cars.length; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cars[i][j] + "\t");
			}
			 System.out.println();
		}

	}

}
