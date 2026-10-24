package Exercise3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> number= new HashSet<Integer>();
number.add(20);
number.add(10);
number.add(40);
number.add(50);
number.add(40);
number.add(30);
System.out.println(number);
List<Integer> num=new ArrayList<Integer>(number);
System.out.println(num.get(4));



System.out.println("*************************************************");

Set<String> names= new TreeSet<String>();
names.add("sahana");
names.add("Alphonse");
names.add("Bose");
names.add("Praveen");
names.add("Alphonse");
System.out.println(names);

System.out.println("*************************************************");

Set<Integer> name1= new LinkedHashSet<Integer>();
name1.add(1);
name1.add(4);
name1.add(2);
name1.add(3);
name1.add(6);
System.out.println(name1);

	}

}
