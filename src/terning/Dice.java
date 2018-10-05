package terning;

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		// Instead of rounding floats, we cast the returning random number into
		// integers, thus not relying on rounding, and getting a more equal spread
		return (int)(Math.random()*6)+1;
	}

	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=0; i<n; i++) { //Fixed dice rolling 1 less than user input (1->0)
			System.out.print(roll() + " ");
		}
	}
}
