import java.util.Scanner;

public class ExampleOfScanner {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter any text");
		String text=scan.nextLine();
		System.out.println(text);
		System.out.println("Please enter any number");
		int num=scan.nextInt();
		System.out.println("End of the program");

	}

}
