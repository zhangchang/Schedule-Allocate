package test.zhangchang.j2se;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import zhangchang.j2se.GetPrimeBySieve;

public class GetPrimeBySieveTest extends GetPrimeBySieve {

	private static GetPrimeBySieve getPrimeBySieve = new GetPrimeBySieve();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetPrime_to_2() {
		long[] expected = { 2 };
		long[] actual = null;
		actual = getPrimeBySieve.getPrime(2);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testGetPrime_to_3() {
		long[] expected = { 2, 3 };
		long[] actual = null;
		actual = getPrimeBySieve.getPrime(3);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testGetPrime_to_4() {
		long[] expected = { 2, 3 };
		long[] actual = null;
		actual = getPrimeBySieve.getPrime(4);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testGetPrime_to_20() {
		long[] expected = { 2, 3, 5, 7, 11, 13, 17, 19 };
		long[] actual = null;
		actual = getPrimeBySieve.getPrime(20);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testPrintPrimes_to_2() {
		long[] in = { 2 };
		String expected = "2";
		String actual = getPrimeBySieve.printPrimes(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintPrimes_to_3() {
		long[] in = { 2, 3 };
		String expected = "2,3";
		String actual = getPrimeBySieve.printPrimes(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintPrimes_column120() {
		long[] in = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157 };
		String expected = "2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157";
		String actual = getPrimeBySieve.printPrimes(in);
		assertEquals(expected, actual);
	}

	@Test
	public void testPrintPrimes_column121() {
		long[] in = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
				101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163 };
		String expected = "2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,\n163";
		String actual = getPrimeBySieve.printPrimes(in);
		assertEquals(expected, actual);
	}
}
