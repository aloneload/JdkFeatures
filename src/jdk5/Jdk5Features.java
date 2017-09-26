package jdk5;

public class Jdk5Features {

	public static void main(String[] args) {
		System.out.println(sum(1,2,3));
		System.out.println(sum(1,2));

	}
	private static int sum(int ...intlist) 
	{ 
	int sum; 
	sum=0; 
	for(int i=0;i<intlist.length;i++) 
	{ 
	sum+=intlist[i]; 
	} 
	return sum; 

	} 
}
