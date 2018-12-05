import java.util.ArrayList;
public class DiceHolder{
	private ArrayList<Die> Holder;
	public DiceHolder(ArrayList<Die> HolderI){
		Holder = HolderI;
	}
	public int addDie(Die d){
		if(Holder.size() > 5){
			return -1;
		}
		else{
			Holder.add(d);
			return 1;
		}
	}
	public void shake(){
		for(int i = 0; i < Holder.size(); i++){
					Holder.get(i).roll();
		}

	}
	public String toString(){
		String h = "";
		for (int i = 0; i < Holder.size(); i++){
			h += Holder.get(i)+"\n";
		}
	return h;
	}
}