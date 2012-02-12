package zhangchang.j2se;

public class GetPrimeBySieve implements GetPrime {

	public String printPrimes(long[] primes) {
		int max_len = 120;
		int len = 0;
		String split = ",";
		String CRLF = "\n";
		String out = "";
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < primes.length; i++) {

			sb.append(primes[i]);
			sb.append(split);
			len += ("" + primes[i]).length() + split.length();
			if ((i < primes.length - 1) && ((len + ("" + primes[i + 1]).length() + split.length()) >= max_len)) {
				sb.append(CRLF);
				len = 0;
			}
		}

		out = sb.toString();

		return out.substring(0, out.length() - split.length());
	}

	public long[] getPrime(long max_num) {

		long timebefore = System.currentTimeMillis();

		long[] primeLstTmp = new long[(int) (max_num / 2) + 1];
		boolean primeFlg = true;
		int pos = 0;

		primeLstTmp[0] = 2;
		pos = 1;

		for (long i = 3; i <= max_num; i += 2) {
			for (long j = 0; (j <= pos - 1) && (primeLstTmp[(int) j] * primeLstTmp[(int) j] <= i); j++) {
				if (i % primeLstTmp[(int) j] == 0) {
					primeFlg = false;
					break;
				}
			}
			if (primeFlg) {
				primeLstTmp[pos] = i;
				pos++;
			} else {
				primeFlg = true;
				continue;
			}
		}

		long[] primeLst = new long[pos];

		for (int k = 0; k < pos; k++)
			primeLst[k] = primeLstTmp[k];

		long timeafter = System.currentTimeMillis();

		// System.out.println(timeafter - timebefore);

		return primeLst;
	}

}
