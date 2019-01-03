import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

public class CodingTests {

	// 1. Your job is to write a function that takes in
	// an ArrayList of Doubles and returns the largest
	// number.
	
	@Test
	public void testFindBiggest() {
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add( 234.3 );
		numbers.add( -1000.0 );
		numbers.add( 99999.0 );
		numbers.add( 2.0 );
		
		double biggest = MyFunctions.findBiggest(numbers);
		assertEquals(biggest, 99999.0, 0.1 );
	}

	@Test
	public void testFindBiggest2() {
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add( -234.3 );
		numbers.add( -1000.0 );
		
		double biggest = MyFunctions.findBiggest(numbers);
		assertEquals(-234.3, biggest, 0.1 );
	}
	
	// 2. You have a HashMap of workers to their bank account balance.
	// Write a function that returns the name of the worker with the
	// least amount of money in their bank account.
	

	@Test
	public void testFindPoorest() {
		HashMap<String, Integer> bankAccounts = new HashMap<>();
		bankAccounts.put("Mike", 1);
		bankAccounts.put("Fred", 9999999);
		bankAccounts.put("Jennifer", 50);
		
		String poorest = MyFunctions.findPoorest(bankAccounts);
		assertEquals("Mike", poorest);
	}
	
	// 3. If the two poorest people have the same amount of money,
	// return "TIE".
	@Test
	public void testFindPoorest2() {
		HashMap<String, Integer> bankAccounts = new HashMap<>();
		bankAccounts.put("Mike", 1);
		bankAccounts.put("Fred", 1);
		bankAccounts.put("Jennifer", 50);
		
		String poorest = MyFunctions.findPoorest(bankAccounts);
		assertEquals("TIE", poorest);
	}
}
