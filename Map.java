package collectionsss;

import java.util.*;
import java.util.Map.Entry;

public class Map {

	public static void main(String[] args) {
	HashMap alm = new HashMap();
	ArrayList ar = new ArrayList();
    alm.put("askin", 173);
    alm.put("jerome", 323);
    alm.put("karthick", 183);
    alm.put("churchill", 193);
    alm.put("clinton", 23);
    alm.put("vasanth", 23);
  
    System.out.println(alm);
    
    Set s = alm.entrySet(); 
	Iterator it = s.iterator(); 
	boolean present = it.hasNext(); 
	
	while(present==true)
	{
		Entry entry =(Entry) it.next();
		//System.out.println(entry.getKey() + " ==> "+ entry.getValue());
		Integer price = (Integer) entry.getValue(); 
		if(price<190)
			System.out.println(entry.getKey());
		present = it.hasNext();
	}
	}
	}
