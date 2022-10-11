package Lecture36_Linked_List;

public class Linkesdlist_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll=new LinkedList();
		ll.addfirst(10);
		ll.addfirst(20);
		ll.addfirst(30);
		ll.addfirst(40);
		//ll.display();
		ll.addlast(50);
		ll.addfirst(60);
		ll.addfirst(70);
		ll.addfirst(80);
		//ll.display();
		//System.out.println(ll.getfirst());
		//System.out.println(ll.getlast());
		ll.display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.removefirst());
		ll.display();
		System.out.println(ll.removeatanyindex(3));
		ll.display();
		ll.addatindex(-90, 3);
		ll.display();
	}

}
