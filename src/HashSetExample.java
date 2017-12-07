import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args)
	{
		
		String x = "My Hash Set Example";
		
	Set<Integer>mySet= new HashSet<Integer>();
	//Hash Set doesn't print numbers that are more than once in the code 
	
	mySet.add(1);
	mySet.add(2);
	mySet.add(2);
	mySet.add(5);
	mySet.add(9);
	mySet.add(9);
	
	 System.out.println(x);
 for (Integer anInt : mySet)
 {
	 System.out.println(anInt);
	
 }
 int i;
 for (i=0; i<=10; i++){
		
	 System.out.print(i);
	 
 }
	}
	
	

}
