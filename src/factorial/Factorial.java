package factorial;

/**
 * In mathematics, the factorial of a non-negative integer n, denoted by n!, is
 * the product of all positive integers less than or equal to n. For example, 5!
 * = 5 \times 4 \times 3 \times 2 \times 1 = 120.
 * 
 * @author Stanislav
 *
 */
public class Factorial {
	public Factorial() {
	}

	/**
	 * Return the exponential of the log(n)
	 * @param num the number for which we want to calculate the factorial
	 * @return
	 */
	public long calculate(int num) {
		return (long) Math.exp(calculatep(num));
	}

	/**
	 * Compute log(n) as described by the relationship
	 * log(n!) = log(1) + log(2) + log(3) + … + log(n).
	 * @param num
	 * @return
	 */
	private float calculatep(int num) {
		if (num < 1) {
			return -1;
		} else if (num > 1) {
			return (float) (Math.log(num) + calculatep(num - 1));
		}
		return 0;
	}
}
