package it.unibo.oop.lab05.ex1;

import java.util.TreeSet;

public final class UseSet {

	public static final int ELEMENTS = 20;
	
    private UseSet() {
    }

    public static void main(final String[] args) {

    	// 1 - Builds a TreeSet containing Strings
    	final var set = new TreeSet<String>();
    	
    	// 2 - Populates set with all the Strings ranging from "1" to "20"
    	for(int i = 1; i <= ELEMENTS; i++) {
    		set.add(Integer.toString(i));
    	}
    	
    	// 3 - Prints its content
    	System.out.println(set);
    	
    	// 4 - Removes all those strings whose represented number is divisible by 3
    	final var iter = set.iterator();
    	while(iter.hasNext()) {
    		if(Integer.parseInt(iter.next()) % 3 == 0) {
    			iter.remove();
    		}
    	}
    	
    	// 5 - Prints the content of the Set using a for-each costruct	
    	for(String elem : set) {
    		System.out.print(elem + " ");
    	}
    	System.out.println();
    	
    	// 6 - Verifies if all the numbers left in the set are even
    	final var set2 = new TreeSet<>();
    	for(int i = 2; i<= ELEMENTS; i += 2) {
    		set2.add(Integer.toString(i));
    	}
    	System.out.println("Even elements: " + set2);
    	System.out.println(set2.containsAll(set));
    }
}
