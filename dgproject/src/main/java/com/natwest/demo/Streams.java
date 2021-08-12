package com.natwest.demo;



import java.util.ArrayList;






public class Streams {

	
	//public static void main(String[] args) {
		
		//List<Integer> number = Arrays.asList(2,3,4,5);
	   // Stream<Integer> square = number.stream();
		
	    //List<String> names = Arrays.asList("Wullie", "Rita", "Bob", "Sue");
	    //names.stream()
	            //.forEach(x -> System.out.println(x));
	  
	    //List<Integer> number = Arrays.asList(2,3,4,5);
	   // List<Integer> square = number.stream();
	        
	            //.map(x -> x*x)
	            //.collect(Collectors.toList());
	       //  question 1   
	  //  List<String> names = Arrays.asList("Wullie", "Rita", "Bob", "Sue");
	    
	    
	      //  names.stream()
	            
	  // .filter(i -> i != "Wullie")
	    //.collect(Collectors.toList())
       // .forEach(i -> System.out.println("hello " + i));
	    
	        
	
	   // List<String> names = Arrays.asList( "Wullie", "Rita", "Bob", "Sue");
	   // List<String> result = 
	     //   names.stream()
	         //  .sorted()
	           // .collect(Collectors.toList());
	    
	    //List<Integer> number = Arrays.asList(3,4,7,8,12);
	    
	    //int sum = array.stream().reduce(3,4,7,8);
	    
	    //.filter(i -> i != reduce)
	    //.collect(Collectors.toList())
        //.forEach(i -> System.out.println());
	    
	    public static void main(String[] arg ) { 
	    	
	    	ArrayList<Integer> list = new ArrayList<Integer>();
	    	list.add(3);
	    	list.add(4);
	    	list.add(7);
	    	list.add(8);
	    	list.add(12);
	    	list.forEach(n -> {if (n % 2 != 0) System.out.print(n);});
	    	
	    	
	    	
	    
	    
	    
	    
               // (element1, element2) -> element1 + element2);
  
        
    
}
	  //Stream<Integer> square = number.stream();
	 
 	    
	
	





//tasks

//Given the following List of names, using a stream, have it print "Hello " in front of each name besides "James".


//("Michael", "Dean", "James", "Chris")

	
//Given the following List of Integers, using a stream, have it reduce and print the product (all numbers multiplied together).

//(3, 4, 7, 8, 12)

//Starting with a list of numbers, use streams to do the following:

////Find the max value.
		
//Find the min value.
		
//Remove the odd numbers.
		
//Remove the even numbers.
		
//Find the sum of the list.
		
//Square every number in the list then remove the even numbers and then find the min value.
	
	

	
	
	

	

