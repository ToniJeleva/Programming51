package week7;

import java.util.LinkedList;

public class AdBot {
	private LinkedList<String>adverts=new LinkedList<>();
	public AdBot(String []ads){
		for(int i=0;i<ads.length;i++){
			adverts.add(ads[i]);
		}	
	}
	public void showNextAdd(){
		System.out.println(adverts.getFirst());
		adverts.add(adverts.getFirst());
		adverts.removeFirst();
				
	}

}
