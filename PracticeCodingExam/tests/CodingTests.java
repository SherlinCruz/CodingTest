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
		numbers.add(234.3);
		numbers.add(-1000.0);
		numbers.add(99999.0);
		numbers.add(2.0);

		double biggest = MyFunctions.findBiggest(numbers);
		assertEquals(biggest, 99999.0, 0.1);
	}

	@Test
	public void testFindBiggest2() {
		ArrayList<Double> numbers = new ArrayList<>();
		numbers.add(-234.3);
		numbers.add(-1000.0);

		double biggest = MyFunctions.findBiggest(numbers);
		assertEquals(-234.3, biggest, 0.1);
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

	/*
	 * 4. Write a function that adds money to a person's bank account. It will take
	 * in a HashMap of people to their account balance, the person who is getting
	 * money, and the amount of money they are receiving. The function should return
	 * their new balance after you add the money. If the person doesn't yet have
	 * account, add a new account for them.
	 */
	@Test
	public void testAddMoney() {
		HashMap<String, Integer> bankAccounts = new HashMap<>();
		bankAccounts.put("Mike", 1);
		bankAccounts.put("Fred", 1);
		bankAccounts.put("Jennifer", 50);

		assertEquals(51, MyFunctions.addMoney(bankAccounts, "Fred", 50));
		assertEquals(101, MyFunctions.addMoney(bankAccounts, "Fred", 50));
		assertEquals(5, MyFunctions.addMoney(bankAccounts, "Bob", 5));
	}

	// 4. Write a function that takes in a String and an integer N
	// and returns an ArrayList containg that String repeated N times.
	@Test
	public void testmakeArrayList() {
		ArrayList<String> result = MyFunctions.makeArrayList("Hello", 3);
		ArrayList<String> expected = new ArrayList<>();
		expected.add("Hello");
		expected.add("Hello");
		expected.add("Hello");
		assertEquals(expected, result);
	}
}
