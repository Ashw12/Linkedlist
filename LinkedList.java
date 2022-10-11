package Lecture36_Linked_List;

public class LinkedList {
	public class Node {
		int data;// this contain data
		Node next;// this contain address of that data.
		public Node(int data) {
			this.data = data;// ye node ka data rakhega.
		}
	}
	private Node head;//linked list ka start point yaad rakhega.ye pahle node ka address rakhega
	private int size;//linkedlist me kitne node hai.
	private Node tail;//last node ka address rakhega.
	//ye linkedlist me data add keanr ka code hai.
	public void addfirst(int item) {
		Node nn=new Node(item);//iska memory heap me banga kisi address par.
		if(this.size==0) {
			this.head=nn;//haed aur tail dono yahi par hoga.jab size node ka ik hoga.address:-1k
			this.tail=nn;//always last node hoga/nn address yaad kiya hai.address:-1k
			this.size++;
		}
		else {
		   	nn.next=this.head;//agle node ka address aa gya pahle node me.
		   	this.head=nn;//jo node judega usko first node suppose karke address rakhega.
		   	this.size++;
		}
	}
	//addlast ka code//ye data ko linkedlist me pichhe add karega
	public void addlast(int item) {
	if(this.size==0) {
		addfirst(item);
	}else {
		Node nn=new Node(item);
		this.tail.next=nn;//tail ke next recent node ka address rakhega ye.
		this.tail=nn;//ab ya presnt or last node address hpga
		this.size++;
	}
	}
	//Add at any index:-Kisi bhi index par value add karan
	public void addatindex(int item,int k) throws Exception {
		if(k<0 || k>size) {
			throw new Exception("Index out of bound Value ok is out of rang");
		}
		if(k==0) {
			addfirst(item);
		}
		else if(k==size) {
			addlast(item);
		}else {
			Node nn=new Node(item);
			Node k_1th=GetNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			this.size++;
		}
	}
	//Get Element In linkedlist.
	public int getfirst() throws Exception {
		if(this.head==null) {
			throw new Exception("No element in Linked list");
		}
		return this.head.data; 
	}
	//Getlast value in linkedlist
	public int getlast() throws Exception {
		if(this.head==null) {
			throw new Exception("No element in Linked list");
		}
		return this.tail.data; 
	}
	//GetAtIndex-kisi bhi index ki value ko nikalan.
	public int getatindex(int k) throws Exception {
		 return GetNode(k).data;//ye node ka data dega jo hamk ki vakue me pass karenge.
	}
	//GetNode-bich me se kisi bhi vakue ko nikalna.
	private Node GetNode(int k) throws Exception {//ye hame ki bhi data ka address lake dega.ise ham bar bar use karenge .
		if(k<0 || k>=size) {
			throw new Exception("Index out of Bound please put value of k is write");
		}
		Node temp=this.head;
		for(int i=1;i<=k;i++) {
			temp=temp.next;
		}
		return temp;//index ka address return karega.
	}
	//Remove fisrt means Head se data remove karna.
	public int removefirst() throws Exception {
		if(this.head==null) {
			throw new Exception("Linkedlist is empty");
		}
		Node temp=this.head;//hame remove kar rahe fist wale ko
		this.head=this.head.next;//agle index par jayega
		temp.next=null;//connection brak ho jaye ga first node se.
		this.size--;
		return temp.data;
	}
	//Remove last means  Linkedlist se last data ko remove karna
	public int removeLast() throws Exception {
		if(this.head==null) {
			throw new Exception("Linkedlist is empty");
		}
		if(this.size==1) {
			return removefirst();
		}
		Node temp=GetNode(this.size-2);//ye second last node hai 40 wala
		int rv=tail.data;//50 jo remove karna hai
		this.tail=temp;
		this.tail.next=null;
	    this.size--;
	    return rv;
	}
	//Remove at any Index:- Means linked list se kisi bhi index ka data remove karna.
	public int removeatanyindex(int k) throws Exception{
		if(k<0 || k>=size) {
			throw new Exception("Index out of bound value of k is out of range");
		}
		if(k==0){
			return removefirst();
		}
		else if(k==this.size-1) {
			return removeLast();
		}
		else {
			Node kth=GetNode(k);
			Node k_1th=GetNode(k-1);
			k_1th=kth.next;
			kth.next=null;
			this.size--;
			return kth.data;
		}
	}
	public void display() {
		Node temp=this.head;//iss line se hamra head kabhi change nhi hoga.
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;//next  hamesa agle node ka address batayega
		}
		System.out.println(".");
	}
	
}


