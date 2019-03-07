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

				//System.out.println(number);

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
			//System.out.println(" Person Does Not Exist");

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

	public static int findCheapskates(HashMap<String, Integer> accounts) {
		// TODO Auto-generated method stub

		
 
		int returingValue = 0;
		
		for (String name : accounts.keySet()) {

			if (accounts.get(name) <= -1) {

				returingValue = returingValue + 1 ;

			}
			System.out.println(returingValue);
		}

		return returingValue;

	}
//correct but other code is not right

	public static int findCommon(HashMap<String, String> hashMap1, HashMap<String, String> hashMap2) {

		int count = 0;

		for (String name : hashMap1.keySet()) {
			String a = hashMap1.get(name);// get second thing of the hashmap.
			String b = hashMap2.get(name);

			if (a.equals(b)) {

				count = count + 1;
			//	System.out.println("count : " + count);
			}

		}

		return count;
	}
}

//	name.equalsIgnoreCase(anotherString);
// to compare the stings. 
