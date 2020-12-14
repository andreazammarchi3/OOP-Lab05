package it.unibo.oop.lab05.ex2;

import java.util.Comparator;

public final class TreeSetComparator  implements Comparator<String> {

	public int compare(final String arg0, final String arg1) {
		
		/*  Returns:
		 *   -> 1 if arg0 > arg1
		 *   -> 0 if arg0 == arg1
		 *   -> -1 otherwise
		 */ 
		return Double.compare(Double.parseDouble(arg0), Double.parseDouble(arg1));
	}

}
