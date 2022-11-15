package collectionsss;

import java.util.*;
public class Arraylists {

	public static void main(String[] args) {
	ArrayList a = new ArrayList();
	ArrayList b = new ArrayList();
	a.add("askin ");
	a.add("karthi");
	a.add("jerome");
	a.add(10);
	
	a.add(true);
	a.add(12);
	b.add(34);
	b.add(667);
	b.add(13);
	//b.addAll(a);
	//b.set(0, 'z');
	//b.remove();
//	b.get(0);
	//b.set(0, b);
	//b.retainAll(a);
	System.out.println(b.contains(13));
	System.out.println(b);
	
	ArrayList clonenumber= b.clone();
	System.out.println(clonenumber);

	}

}
