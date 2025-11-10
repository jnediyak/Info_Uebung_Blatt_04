package p1;

import java.util.Random;

public class P1_main {

	public static void main(String[] args) {
		int stockwerke = new Random().nextInt(-10, 11);
		
		System.out.println("Aufgabe Teil 1: \n");
		switch(stockwerke) {
		case -1:
			System.out.println("Parkhaus");
		case 0:
			System.out.println("Angebote");
			break;
		case 1:
			System.out.println("Damenbekleidung");
			break;
		case 3:
			System.out.println("Kinderbekleidung");
			break;
		default:
			System.out.println("unbekannt");
			break;
		}
		
		System.out.println("Aufgabe Teil 2: \n");
		switch(stockwerke) {
		case 3:
			System.out.println("Kinderbekleidung");
		case 2:
			System.out.println("Herrenbekleidung");
		case 1:
			System.out.println("Damenbekleidung");
		case 0:
			System.out.println("Angebote");
			break;
		case -1:
			System.out.println("Parkhaus");
			break;
		default:
			System.out.println("unbekannt");
			break;
		}
	}

}
