import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//in.nextLine();

		Apache2AccessLog log = new Apache2AccessLog();

		while (true) {
			log.read();
			log.print();
			System.out.println("--------------------------------------------------");
			try {			
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				//
			}
		}
	}
}
