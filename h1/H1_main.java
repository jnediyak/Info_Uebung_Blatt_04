package h1;

public class H1_main {

	public static void main(String[] args) {
		int zone = 18;
		double price;
		
		switch(zone) {
		case 1:
			price = 2;
			break;
		case 2:
			price = 2.35;
			break;
		case 3:
		case 4:
			price = 2.85;
			break;
		case 5:
			price = 3.55;
			break;
		default:
			price = 4;
			break;
		}
		System.out.println("Sie sind durch " + zone + " Zone(n) gefahren. Ihr Ticket kostet " + price + "€.");
	}

}
