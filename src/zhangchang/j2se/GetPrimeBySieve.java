package zhangchang.j2se;

public class GetPrimeBySieve implements GetPrime {

	public void printPrimes(long[] primes) {
		int max_len = 120;
		int len = 0;
		String split = ",";

		for (int i = 0; i < primes.length; i++) {
			if (primes[i] == 0) {
				break;
			} else {
				System.out.print(primes[i]);
				System.out.print(split);
				len += ("" + primes[i]).length() + split.length();
			}

			if ((len + ("" + primes[i + 1]).length() + split.length()) >= max_len) {
				System.out.print("\n");
				len = 0;
			}
		}
	}

	public long[] getPrime(long max_num) {

		long timebefore = System.currentTimeMillis();

		long[] primeLst = new long[(int) (max_num / 2)];
		boolean primeFlg = true;
		int pos = 0;

		primeLst[0] = 2;
		pos = 1;

		for (long i = 3; i <= max_num; i += 2) {
			for (long j = 0; (j <= pos - 1)
					&& (primeLst[(int) j] * primeLst[(int) j] <= i); j++) {
				if (i % primeLst[(int) j] == 0) {
					primeFlg = false;
					break;
				}
			}
			if (primeFlg) {
				primeLst[pos] = i;
				pos++;
			} else {
				primeFlg = true;
				continue;
			}
		}

		long timeafter = System.currentTimeMillis();

		System.out.println(timeafter - timebefore);

		return primeLst;
	}

}
