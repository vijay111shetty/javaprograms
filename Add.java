
public class Add {
	public void sub() {

		System.out.println("Substraction");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);
		System.out.println("Sum is" + sum);
		Add driver = new Add();
		driver.sub();
	}

}
