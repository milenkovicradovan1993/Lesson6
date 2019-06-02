package exercises;

import java.util.Scanner;

import junit.framework.TestCase;

public class StringReversal extends TestCase {
	/*
	 * Without using the reverse() method in StringBuffer or StringBuilder, write a
	 * string reverser that will make this unit test pass.
	 * 
	 * Then use it to decode this message: 
	 *       QcXgW9w4wQd=v?hctaw/moc.ebutuoy
	 */

	public void test() {
		String text = "QcXgW9w4wQd=v?hctaw/moc.ebutuoy";
	    String reversed = "";
	 
	    for (int i=text.length()-1; i>=0; i--) {
	      reversed += text.charAt(i);
	    }
	 
	    System.out.println(reversed);
	 
	  }

	}

