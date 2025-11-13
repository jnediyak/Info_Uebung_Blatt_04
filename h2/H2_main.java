package h2;

public class H2_main {

	public static void main(String[] args) {
		boolean x = false, y = false, a, b, c;
		int input = 0;
		
		switch(input) {
		case 0:
			x = false;
			y = false;
			break;
		case 1:
			x = false;
			y = true;
			break;
		case 10:
			x = true;
			y = false;
			break;
		case 11:
			x = true;
			y = true;
			break;
		}
		
		if(x && y) {
			a = true;
		}
		if (x || x != y) {
			b = true;
		}
		c = !y;
	}

}
