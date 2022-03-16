package AdvanceConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListsInterfaceImplemented {

	
	public static <T> void removeDuplicates(ArrayList<T> list1)
	{
		
		ArrayList<T> list2 =new ArrayList<T>();
		
		// Use a new list and keep on adding elements inside it if not already present
		for(int i=0; i <list1.size();i++)
		{
			if(! list2.contains(list1.get(i)) ) 
			{
				list2.add(list1.get(i));
			}
		}
		
		System.out.println("The list after removing the duplicates");
		System.out.println(list2);
		System.exit(0);
		
	}
	
	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Assign an array list in one line  
		ArrayList<Integer> li2= new ArrayList<Integer>(Arrays.asList(1,20,30,20,50,40,90,30,1));
		
		// Printing the list with duplicates
		System.out.println(li2);
		
		System.out.println(" Sublist from position 0 to 3 (n-1) ");
		System.out.println(li2.subList(0, 4));
	
	
		
		// Calling a function 
		removeDuplicates(li2);
    	
    	

		// ArrayList implements the List interface
		List<Integer> li = new ArrayList<Integer>();

		//li.add(null);
		//li.add(null);
		//li.add(20);
		li.add(20);
		li.add(30);
		li.add(2,40);

		//	li.remove(1);

		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}


		
		
		
		
		//li2.add(null);
		for(int i=0;i<li2.size();i++)
		{
			System.out.println(li2.get(i));
		}
		

		List<String> liS1 = Arrays.asList("Udzial","Means","Share");
		List<String> liS2 = Arrays.asList("Share","Udzial","Means");
				
		Collections.sort(liS1);
		Collections.sort(liS2);
        
		System.out.println("Two list are equal = " + liS1.equals(liS2));
		
		
       List<Integer> lis3 = Arrays.asList(1,2,3,4,5);
       List<Integer> lis4= Arrays.asList(3,4,5,2,2);
       
       System.out.println(lis3);
       System.out.println(lis4);
       
       //System.out.println(lis3.removeAll(lis4));
      // System.out.println(lis4.retainAll(lis3));
       
       
       System.out.println("List 1 ");
       System.out.println(li);
       System.out.println("list 2");
       System.out.println(li2);
       
       for ( Integer i:li)
       {
    	   if(li2.contains(i))
    	   {
    		   li2.remove(i);
    	   }
       }
       System.out.println("List 2 unique Elements");
       System.out.println(li2);
       
       for ( Integer i:li2)
       {
    	   if(li.contains(i))
    	   {
    		   li.remove(i);
    	   }
       }
       System.out.println("List 1 unique Elements");
       System.out.println(li);
      
       
      li.addAll(li2);
      System.out.println("ok");
      System.out.println(li);
       
       
       
       ListsInterfaceImplemented obj = new ListsInterfaceImplemented();
       //obj.differenceInList(lis3, lis4);
       
		System.out.println(liS1);
		System.out.println(liS2);
		
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		for(int i=0;i<li2.size();i++)
		{
			System.out.println(li2.get(i));
		}


		System.out.println(li.equals(li2));

		System.out.println(li.size()==li2.size());
		System.out.println(li.containsAll(li2));


	}

	 public void differenceInList(List<Integer> lis3, List<Integer> lis4)
     {
         lis3.add(40);

     }
		
}
