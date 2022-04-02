package dcp.tree;

public class CoinChangeProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = CoinChangeProblem.findCombinations(5, new int[]{1,2,5});
		System.out.println(i);
	}

	public static int findCombinations(int amount, int[] coins) {
		int[] combinations = new int[amount + 1];
		combinations[0] = 1;
		int coinsLen = coins.length;
		for (int coin :coins) {
			for (int i = 1; i < combinations.length; i++) {
				if (amount >= coin) {
					combinations[amount] += combinations[amount - coin];
				}
			}
		}
		return combinations[amount];
	}

}
