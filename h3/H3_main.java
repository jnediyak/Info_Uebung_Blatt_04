package h3;

public class H3_main {

	public static void main(String[] args) {
		float celsiusFloat = (float) 14.2, fahrenheitFloat;
		double celsiusDouble = 14.2, fahrenheitDouble;
		
		//Celsius to Fahrenheit
		fahrenheitDouble = celsiusDouble * 9 / 5 + 32;
		fahrenheitFloat = celsiusFloat * 9 / 5 + 32;
		
		System.out.println("celsiusFloat: " + celsiusFloat);
		System.out.println("fahrenheitFloat: " + fahrenheitFloat);
		System.out.println("celsiusDouble: " + celsiusDouble);
		System.out.println("fahrenheitDouble: " + fahrenheitDouble);
	}
}
