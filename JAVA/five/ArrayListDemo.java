import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("pavan");
		al.add("kumar");
		al.add("reddy");
		al.add("sekhar");
		System.out.println("Array: "+al);									//container creation
		System.out.println("Size of the array: "+al.size());				//array size
		System.out.println("Value of 0th index in array: "+al.get(0));		//index based fetching
		System.out.println("Names in the array:");							
		for (String name : al) {											//iteration based fetching
		System.out.println(name);
		}
		al.remove(0);																	//remove or delete array value using index
		System.out.println("After removing index 0 value, array: "+ al);
		al.remove("reddy");																//remove or delete using array value 
		System.out.println("After removing value \"reddy\", array: "+ al);
		al.add(1, "pavan");																//update value using index, value pair
		al.add(3, "reddy");
		System.out.println("After updating index 1,4 with values, array: "+ al);
	}
}
/*
questions :
1. What is the maximum size of an Arraylist?
2. What if we use size more than maximum size of an ArrayList?

answer for both 1 and 2 questions:

In Java, the maximum size of an ArrayList is limited by the maximum value that can be stored in an int variable, 
which is Integer.MAX_VALUE. This value is equal to 2^31 - 1, which is approximately 2.147 billion.

The size() method of the ArrayList class returns the number of elements in the list, which is an int value. 
Therefore, the maximum size of an ArrayList that can be reported by the size() method is Integer.MAX_VALUE.

However, it's worth nothing that creating an ArrayList with such a large size is not practical, as it would require 
a huge amount of memory. In fact, the maximum size of an ArrayList is also limited by the available memory on the system.

Here's a simple example to demonstrate the maximum size of an ArrayList:

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements to the list until it reaches the maximum size
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            list.add(i);
        }

        // Print the size of the list
        System.out.println("Size of the list: " + list.size());
    }
}


This code will attempt to add Integer.MAX_VALUE elements to the list, but it will likely throw an OutOfMemoryError
before reaching the maximum size.

question-3 :
Distinguish between ArrayList, LinkedList and Vector?

answer:
_______________________________________________________________________________________________________________
Implementation | Insertion/Deletion 	 | Search | Memory Usage | Thread Safety | Performance                |
---------------------------------------------------------------------------------------------------------------
ArrayList      | Slow for large datasets | Fast	  | Low		     | No 		     | Good for random access     |
LinkedList     | Fast for large datasets | Slow   | High         | No            | Good for sequential access |
Vector         | Slow for large datasets | Fast   | Low          | Yes           | Good for random access     |
_______________________________________________________________________________________________________________
*/