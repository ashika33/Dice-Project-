import java.util.ArrayList;
public class DiceHolder{
	private ArrayList<Integer> Holder;
	public DiceHolder(ArrayList<Integer> HolderI){
		Holder = HolderI;
	}
	public int addDie(){
		int i = 1;
		if(Holder.size() > 5){
			return -1;
		}
		else{
			Holder.add(i);
			return 1;
		}
	}
	public void shake(){
		roll();
	}
	public String toString(){
		for (int i = 0; i < Holder.size(); i++){
			return Holder.get(i)+"\n";
		}
	}
}