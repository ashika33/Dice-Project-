public class PartnerA{

	private int sides;
	private int value;


	public PartnerA(){
		int r = (int)(Math.random()*5)+1;
		sides = 6;
		value = r;
	}

	public PartnerA (int sides, int value){
		this.sides = sides;
		this.value = value;
	}


	public int getSides(){
		return sides;
	}

	public int getValue(){
		return value;
	}

	public void setSides(int newSides){
		sides = newSides;
	}
	public void setValue(int newValue){
		value = newValue;
	}
	public String toString(){
		return "You rolled a "+value+" on a "+sides+" sided die.";

	}





}