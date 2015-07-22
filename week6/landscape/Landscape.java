package week6;

import java.util.ArrayList;

public class Landscape {
	private ArrayList<Tile> scape = new ArrayList();

	public void addTile(Tile t) {
		scape.add(t);
	}
	
	public String renderAll(){
		String str="";
		for(int i=0;i<scape.size();i++){
			str=str+scape.get(i).render();
		}
		return str;
	}
}
