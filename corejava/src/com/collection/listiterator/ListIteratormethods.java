package com.collection.listiterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
//hasNext();
//next()
//previous()
//has previous ()
//add
//set
//nextIndex()
//previousindex()
public class ListIteratormethods {

	public static void main(String[] args) {
List <Integer> li=new LinkedList(); {
	li.add(1);
	li.add(34);
	li.add(236);
	li.add(89);
	ListIterator lis=li.listIterator();
	lis.add(67);
	lis.add(678);
	System.out.println(li);
	System.out.println(lis.hasPrevious());
	System.out.println(lis.nextIndex());
	//System.out.println(lis.set(2));
	System.out.println(lis.next());
	//System.out.println(lis.set());
	
	/*while(lis.hasNext()) {
		lis.add(98);
		lis.add(78);
		//System.out.println(lis.next());
	//	System.out.print(lis.nextIndex());
		//System.out.println(lis.previous());
	}*/
}
         

	}

}







//listiterator                                  //iterator
//*available in list only                    *available throughout collection
//util collection                            *util packge
// next(),has Next(),remove()                *nextindex(),previous(),hasprevious(),hasIndex(),hasnext(),has onl



