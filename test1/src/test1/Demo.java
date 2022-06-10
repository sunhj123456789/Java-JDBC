package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class Demo {

	public static void main(String[] args) {
		
          
//   Map<Integer,String> list=new HashMap<Interger,String>();
   Map<Integer,String> l1 = new HashMap<Integer,String>(); 
   l1.put(1,"sundar");
   l1.put(2,"sundaram");
   
for(Map.Entry m:l1.entrySet()) {
System.out.println(m.getValue());
System.out.println(m.getKey());
//testing jk
}
   
//   Set s1=l1.entrySet();
//   Iterator list=s1.iterator();
//   
//   while(list.hasNext()) {
//	 Map.Entry entry=(Map.Entry)list.next();
//	 System.out.println(entry.getValue());
//	 System.out.println(entry.getKey());
//	   test
//   }
//   
//	}

}
	
}