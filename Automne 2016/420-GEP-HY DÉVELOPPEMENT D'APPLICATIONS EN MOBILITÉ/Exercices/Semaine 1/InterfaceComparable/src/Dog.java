
public class Dog implements Comparable, Dialoguer{

	private int happinessRating;
	
	public Dog(int happinessRating) {
		this.happinessRating = happinessRating;
	}

	@Override
	public int compareTo(Object o) {
		Dog d = (Dog) o;
		if (this.happinessRating == d.happinessRating)
			return 0;
		else
			if (this.happinessRating < d.happinessRating)
				return -1;
			else
				return 1;
	}

	@Override
	public String parler() {
		// TODO Auto-generated method stub
		return "wouff, wouff";
	}

}
