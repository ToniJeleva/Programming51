package week5;

public class LinkedList <T>{
	private Node<T> head;
	private Node<T> tail;
	
	public LinkedList(){
		head=null;
		tail=null;
	}
	
	public void add(T data) {
		if (head == null) {
			head = new Node<T>(data);
			tail = head;
		} else {
			Node<T> temp = new Node<T>(data);
			tail.setNext(temp);
			tail = temp;
		}
	}
	
	public String toString(){
		String str="";
		Node<T> temp=head;
		while(temp.getNext()!=null){
			str+=temp.getData()+" ,";
			temp=temp.getNext();
		}
		return str+temp.getData();
	}
	
	private Node<T> getNode(int index) {
		int br=0;
		Node<T> temp = head;
		while (true) {
			if (br == index) {
				return temp;
			}
			temp = temp.getNext();
			br++;
		}
	}
	
	public void setData(int index,T data){
		getNode(index).setData(data);
	}
	
	public void remove(int index){
		getNode(index-1).setNext(getNode(index).getNext());
	}
	
	public void insertAfter(int index, T data){
		Node<T> temp=new Node<T>(data);
		Node<T> indexNode=getNode(index);
		temp.setNext(indexNode.getNext());
		indexNode.setNext(temp);
		
	}
	
	 public void addArray(T[] arr) {
		 for(int i=0;i<arr.length;i++){
			 add(arr[i]);
		 }
	 }

	private LinkedList<T> ArrToList(T[] arr) {
		LinkedList<T> toinsert = new LinkedList<T>();
		for (int i = 0; i < arr.length; i++) {
			toinsert.add(arr[i]);
		}
		return toinsert;
	}
	
	public void insertArr(int index,T[] arr){
		LinkedList<T>temp=ArrToList(arr);
		Node<T> indexNode=getNode(index);
		temp.tail.setNext(indexNode.getNext());
		indexNode.setNext(temp.head);
	}
	
	public void insertListAfter(int index, LinkedList<T>l){
		LinkedList<T>temp=l;//making copy of the object, if not changing the one from the argument list
		Node<T> indexNode=getNode(index);
		temp.tail.setNext(indexNode.getNext());
		indexNode.setNext(temp.head);
	}
	
	public void insertListBefore(int index, LinkedList l){
		/*//LinkedList<T>temp=new LinkedList<T>(l);
		Node<T>indexNode=getNode(index);
		temp.tail.setNext(indexNode);
		getNode(index-1).setNext(temp.head);*/
	}

	public void addFirst(T data) {
		Node<T> temp = new Node<T>(data);
		if(head==null)
			tail=temp;
		temp.setNext(head);
		head = temp;
	}
	
	public T getFirst(){
		return head.getData();
	}
	
	public T getLast(){
		return tail.getData();
	}
	
	public boolean contains(T data) {
		boolean result = false;
		Node<T> temp = head;
		while (temp!=null) {
			if (temp.getData() == data) {
				result = true;
				break;
			}
			temp = temp.getNext();
		}

		return result;
	}
	
	public int getElementIndex(T data){
		Node<T> temp = head;
		boolean exists=false;
		int br=0;
		while (temp!=null) {
			if (temp.getData() == data) {
				exists=true;
				break;
			}
			temp = temp.getNext();
			br++;
		}
		if(exists==false)
			return -1;
		else
			return br;
	}

}
