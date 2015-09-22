package week8;

public class Main {

	public static void main(String[] args) {
		
	BST<Integer> a=new BST<>();
	a.add(3);
	a.add(2);
	a.add(1);
	a.add(5);
	a.add(4);
	a.add(6);
	System.out.println(a.toString());  //in-order
	//a.printLevel(2);
	//System.out.println();
	System.out.println(a.countOnLevel(3));
	//System.out.println(a.findNode(2));

	}

}
