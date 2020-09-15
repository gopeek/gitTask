import java.util.Scanner;

public class helloWorld {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		System.out.println("Type something ");
		String user_message = user_input.next();
		System.out.println("You typed : " + user_message);
		user_input.close();

	}

}

