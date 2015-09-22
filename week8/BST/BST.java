package week8;

public class BST<T extends Comparable<T>> {
	private Node<T> root;

	public BST() {
		root = null;
	}

	public boolean empty() {
		return root == null;
	}

	public void add(T data) {
		if (empty()) {
			root = new Node<T>(data); // Случай че дървото е празно
		} else {
			if (data.compareTo(root.data) < 0) {
				// Добавяме в ляво
				if (root.left == null) {
					root.left = new Node<T>(data);
				} else {
					addRecursive(data, root.left);
				}
			} else {
				// Добавяме в дясно
				if (root.right == null) {
					root.right = new Node<T>(data);
				} else {
					addRecursive(data, root.right);
				}
			}
		}
	}

	private void addRecursive(T data, Node<T> root) {
		if (data.compareTo(root.data) < 0) { // Проверка дали data е по-малко
			// Ще добавяме в ляво
			if (root.left == null) {
				root.left = new Node<T>(data);
			} else {
				addRecursive(data, root.left);// Добавяме в лявото поддърво
			}
		} else {
			// Ще добавяме в дясно
			if (root.right == null) {
				root.right = new Node<T>(data);
			} else {
				addRecursive(data, root.right); // Добавяме в дясното поддърво
			}
		}
	}

	private String toStringRecursive(Node<T> root) {
		if (root == null)
			return "";
		String str = "";
		str += toStringRecursive(root.left);
		str += root.data + " ";
		str += toStringRecursive(root.right);
		return str;
	}
	
	public int level(int n) {
		int br=0;
		if (n == 0)
			return br;
		
		
		return level(n-1);
	}

	public String toString() {
		String str = "";
		str += toStringRecursive(root);
		return str;
	}
	
	public void printLevel(int n){
		printLevelRecursive(n, root);
	}
	
	private void printLevelRecursive(int level, Node<T> root){
		if(root==null){
			return;
		}
		if(level==1 ){
			System.out.print(root.data+" ");
		}else{
			printLevelRecursive(level-1, root.left);
			printLevelRecursive(level-1,root.right);
		}
		
	}
	
	public int countOnLevel(int n){
		return countLevelRecursive(n,root);
	}
	
	public static int br=0;		
	private int countLevelRecursive (int level, Node<T> root){
		if(root==null){
			return 0;
		}
			if(level==1 ){
			return br++;
			}else{
			br=countLevelRecursive(level-1, root.left);
			br=countLevelRecursive(level-1,root.right);
		}
		return br;
	}
	
	public boolean findNode(T data){
		return findNodeRecursive(data, root);
	}
	
	private boolean findNodeRecursive(T data,Node<T> root){
		if(root==null){
			return false;
		}
		if(data.compareTo(root.data)>0){
			System.out.println("right");
			findNodeRecursive(data,root.right);
		}
		if(data.compareTo(root.data)<0){
			System.out.println("left");
			findNodeRecursive(data,root.left);
		}
		if(data.compareTo(root.data)==0){
			System.out.println("equal");
			return true;
		}
		return false;
		
	}

}
