package it.unibo.oop.lab05.ex2;

import java.util.TreeSet;

public final class UseSetWithOrder {
	
	public static final int ELEMENTS = 100;

    private UseSetWithOrder() {
    }

    public static void main(final String[] args) {
        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings. To order the set, define
         * a new Comparator in a separate class.
         * 
         * 2) Inserts in the set a hundred strings containing randomly generated
         * numbers (use Math.random())
         * 
         * 3) Prints the set, which must be ordered
         */
    	// 1 - Creates a new Ordered TreeSet of Strings.
    	//     It's ordered by the TreeSetComparator class.
    	final var set = new TreeSet<String>(new TreeSetComparator());
    	
    	// 2 - Inserts in the set (100) strings containing random numbers 
    	for(int i = 0; i < ELEMENTS; i++) {
    		set.add(Double.toString(Math.random()));
    	}
    	
    	// 3 - Prints the set ordered
    	System.out.println(set);
    }
}
