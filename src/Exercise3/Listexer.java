package Exercise3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listexer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> numbers= new ArrayList<Integer>();
numbers.add(0, 50);
numbers.add(0, 20);
numbers.add(0, 30);
int size= numbers.size();
Collections.sort(numbers);
int nu=numbers.get(0);

for(int i=0;i<numbers.size();i++) {
	System.out.println(numbers.get(i));
	}
System.out.println(numbers.get(0));

System.out.println("*************************");
List<Integer> addnum= new ArrayList<Integer>();
addnum.add(1);
addnum.add(5);
addnum.add(3);
addnum.add(7);
addnum.add(4);
addnum.add(2);
addnum.add(10);
Collections.sort(addnum);
int size1= addnum.size();
//
//System.out.println(size1);
for(int j=0;j<size1;j++) {
	System.out.println(addnum.get(j));
	
	}
//System.out.println(addnum.get(size1-1));
//System.out.println(addnum.get(0));
	}

}
