package assignment;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class LambdaDemo {
	public static void main(String[] args) {
		List<String> lis = new ArrayList<String>();
		lis.add("Aditi");
		lis.add("Zohara");
		lis.add("Mukesh");
		lis.add("Suresh");
		
		Iterator it = lis.iterator();

		while (it.hasNext()) {
//			String s = (String) it.next();
			System.out.println(it.next());
		}
		
		System.out.println();
		
		System.out.println("Older way to take data");
		for (String i : lis) {
			System.out.println(i);
		}
		
		System.out.println();
		
		lis.forEach(j -> System.out.println(j));
		
		
		
		
	}

}
