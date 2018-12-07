public class Die{

	private int sides;
	private int value;


	public Die(){
		int r = (int)(Math.random()*6)+1;
		sides = 6;
		value = r;
	}

	public Die(int newSides){
		int r = (int)(Math.random()*newSides)+1;
		sides = newSides;
		value = r;
	}
	public void roll(){
		value = (int)(Math.random()*sides)+1;
	}


	public int getValue(){
		return value;
	}


	public String toString(){
		return "Number of sides: "+sides+", value: "+value;

	}


}