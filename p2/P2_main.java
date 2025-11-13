package p2;

import java.util.Scanner;

public class P2_main {

	public static void main(String[] args) {
		int a = 3, b = 5, c = 6;
		double x = 1.5, y = 2.3;
		int intResult = -1000;
		double doubleResult = -1000;
		
		Scanner s = new Scanner(System.in);
		String anweisung =  s.next();
		
		s.close();
		
		switch(anweisung) {
		case "a":
			
			intResult = c - a * 3;
			break;
		case "b":
			intResult = c / b;
			break;
		case "c":
			intResult = a + b / c;
			break;
		case "d":
			doubleResult = c / b;
			System.out.println("Korrektur");
			doubleResult = (double) c / b;
			break;
		case "e":
			doubleResult = c + a / b;
			System.out.println("Korrektur");
			doubleResult = c + (double) a / b;
			break;
		case "f":
			doubleResult = x + y * b;
			break;
		}
		System.out.println(intResult + "\t" + doubleResult);
		/**
		 * bei (c), (d) und (e) gehen Informationen verloren, weil z.b. c/b ein double ergibt, aber weil beides Integer sind wird der Nachkommateil weggeschnitten.
		 */
	}

}
