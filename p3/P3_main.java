package p3;

public class P3_main {

	public static void main(String[] args) {
		boolean x, y;
		
		
		System.out.println("x \t y \t !(x != y && x == y)");
		x = true;
		y = true;
		System.out.println(x + "\t" + y + "\t" + !(x != y && x == y));
		x = true;
		y = false;
		System.out.println(x + "\t" + y + "\t" + !(x != y && x == y));
		x = false;
		y = true;
		System.out.println(x + "\t" + y + "\t" + !(x != y && x == y));
		x = false;
		y = false;
		System.out.println(x + "\t" + y + "\t" + !(x != y && x == y));
		
		
		System.out.println("x \t y \t (x || true)");
		x = true;
		y = true;
		System.out.println(x + "\t" + y + "\t" + (x || true));
		x = true;
		y = false;
		System.out.println(x + "\t" + y + "\t" + (x || true));
		x = false;
		y = true;
		System.out.println(x + "\t" + y + "\t" + (x || true));
		x = false;
		y = false;
		System.out.println(x + "\t" + y + "\t" + (x || true));
		
		
		System.out.println("x \t y \t (x && false)");
		x = true;
		y = true;
		System.out.println(x + "\t" + y + "\t" + (x && false));
		x = true;
		y = false;
		System.out.println(x + "\t" + y + "\t" + (x && false));
		x = false;
		y = true;
		System.out.println(x + "\t" + y + "\t" + (x && false));
		x = false;
		y = false;
		System.out.println(x + "\t" + y + "\t" + (x && false));
		
		
		System.out.println("x \t y \t ((x && !y) || (!x))");
		x = true;
		y = true;
		System.out.println(x + "\t" + y + "\t" + ((x && !y) || (!x)));
		x = true;
		y = false;
		System.out.println(x + "\t" + y + "\t" + ((x && !y) || (!x)));
		x = false;
		y = true;
		System.out.println(x + "\t" + y + "\t" + ((x && !y) || (!x)));
		x = false;
		y = false;
		System.out.println(x + "\t" + y + "\t" + ((x && !y) || (!x)));
		
		
		//System.out.println(x + "\t" + y + "\t" + (x || true));
		//System.out.println(x + "\t" + y + "\t" + (x && false));
		//System.out.println(x + "\t" + y + "\t" + ((x && !y) || (!x)));
	}

}
