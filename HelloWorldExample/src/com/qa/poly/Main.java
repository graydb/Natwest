package com.qa.poly;

public class Main {
	

    public static void main(String[] args) {
        Cow cow = new Cow();
	        Animal animal = new Cow();
        Object object = new Cow();
        
    
        
        
	       System.out.println("=============Cow=============");
	        Cow cow = new Cow();
	        cow.speak();
	        cow.sleep();
	        System.out.println("=============================");
      System.out.println("============Animal===========");
        Animal animal = new Cow();
	        ((Cow) animal).speak();
	        animal.sleep();
	        System.out.println("=============================");
	        System.out.println("============Object===========");
	        Object object = new Cow();
	        ((Cow) object).speak();
	        ((Cow) object).sleep();
	        System.out.println("=============================");
	    
	    }
	
	
	
	

}
