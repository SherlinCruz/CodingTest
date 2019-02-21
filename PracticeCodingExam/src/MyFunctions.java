import java.util.ArrayList;
import java.util.HashMap;

public class MyFunctions {

	public static double findBiggest(ArrayList<Double> numbers) {

		Double bigNum = -99999.0;
		// for (int j = 0; j < numbers.size(); j++) {

		for (Double a : numbers) {

			/*
			 * if (numbers.get(j) > bigNum) {
			 * 
			 * bigNum = numbers.get(j);
			 * 
			 * }
			 */

			if (a > bigNum) {

				bigNum = a;

			}
		}
		return bigNum;
	}

	public static String findPoorest(HashMap<String, Integer> bankAccounts) {

		int number = 999999999;

		String saveName = "a";

		for (String name : bankAccounts.keySet()) {
			// (1)keySet(2)values

			if (bankAccounts.get(name) == number) {

				saveName = "TIE";

				System.out.println(number);

			}

			else if (bankAccounts.get(name) < number) {

				saveName = name;
				number = bankAccounts.get(name);

			}

		}
		return saveName;

	}

	public static int addMoney(HashMap<String, Integer> bankAccounts, String name, int credit) {
		if (bankAccounts.containsKey(name) == true) {
			int newBalance;

			int initialAccount = bankAccounts.get(name);

			newBalance = initialAccount + credit;

			credit = newBalance;

			bankAccounts.put(name, credit);

		} else {
			System.out.println(" Person Does Not Exist");

			bankAccounts.put(name, credit);

		}

		return credit;

	}

	public static ArrayList<String> makeArrayList(String word, int N) {

		ArrayList<String> a = new ArrayList<String>();

		for (int i = 0; i < N; i++) {

			a.add(word);

		}

		return a;

	}

	public static int getTotalMoneyInBank(HashMap<String, Integer> accounts) {
		int totalAmount = 0;

		for (String name : accounts.keySet()) {

			int amount = accounts.get(name);

			totalAmount += amount;

		}

		return totalAmount;
	}

	public static ArrayList<String> findCheapskates(HashMap<String, Integer> accounts) {
		// TODO Auto-generated method stub

		ArrayList<String> v = new ArrayList<String>();
		

		for(String name : accounts.keySet()) {

			if (accounts.get(name)<= -1) {

	
				v.add(name);

			}
			System.out.println(v);
		}

		return v;

	}
//correct but other code is not right
}
