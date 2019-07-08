package basics;

public class IfElse {
	public static void main(String[] args) {
		
		int temperature = 65;
		String sunCondition = "Overcast";
		
		if(temperature > 80) {
			System.out.println("It's nice. Wear shorts and t-shirt.");
		}
		else if (temperature > 60 && sunCondition == "Sunny") {
			System.out.println("It's a bit cool. Perhaps wear long-sleeve shirt and jeans.");
		}
		else if (temperature > 50 || sunCondition == "Overcast") {
			System.out.println("It's a cool day. Make sure to wear warmer clothes.");
		}
		else {
			System.out.println("Looks like a cold day. Bring a sweater.");
		}
		System.out.println("This program is ending");
	}
}
