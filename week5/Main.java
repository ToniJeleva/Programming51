package week5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		LinkedList<Integer> k=new LinkedList<>();
		for(int i=10;i<20;i++){
			l.add(i);
		}
		l.setData(1,30);
		l.addFirst(55);
		k.addFirst(10);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.contains(9));
		System.out.println(l.getElementIndex(100));
		//l.remove(3);
		//l.insertAfter(3, -10);
		//System.out.println(l);
		//System.out.println(k);
		
		Integer []arr={1,2,3};
		l.insertArr(2, arr);
		System.out.println(l);
		
		LinkedList<Integer> list1 = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
		list1.insertListBefore(1, list1);
		System.out.println(list1);

	}

}
