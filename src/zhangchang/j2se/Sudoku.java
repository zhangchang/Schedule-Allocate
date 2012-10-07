package zhangchang.j2se;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sudoku {

	public static int ROW = 9;
	public static String COMMA = ",";
	public static String CRLF = "\r\n";
	public static String posRegex = "[1-9]{1}\\,[1-9]{1}";

	public static int[][] sudukuMatrix;
	
	public static HashMap<String, ArrayList<Boolean>> numLib = null;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		initEmptySudoku();

		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		mp.put("1,1", new Integer(2));
		mp.put("1,4", new Integer(5));
		mp.put("1,8", new Integer(3));
		mp.put("1,9", new Integer(1));

		mp.put("2,2", new Integer(7));
		mp.put("2,3", new Integer(6));
		mp.put("2,5", new Integer(4));
		mp.put("2,8", new Integer(9));

		mp.put("3,1", new Integer(5));
		mp.put("3,5", new Integer(6));
		mp.put("3,6", new Integer(3));
		mp.put("3,7", new Integer(7));

		mp.put("4,1", new Integer(9));
		mp.put("4,5", new Integer(5));
		mp.put("4,6", new Integer(6));
		mp.put("4,8", new Integer(8));

		mp.put("5,1", new Integer(1));
		mp.put("5,3", new Integer(3));
		mp.put("5,6", new Integer(7));
		mp.put("5,7", new Integer(5));
		mp.put("5,9", new Integer(2));

		mp.put("6,2", new Integer(6));
		mp.put("6,5", new Integer(2));
		mp.put("6,9", new Integer(9));

		mp.put("7,3", new Integer(7));
		mp.put("7,4", new Integer(9));
		mp.put("7,5", new Integer(1));
		mp.put("7,9", new Integer(8));

		mp.put("8,2", new Integer(9));
		mp.put("8,5", new Integer(3));
		mp.put("8,7", new Integer(1));
		mp.put("8,8", new Integer(4));

		mp.put("9,1", new Integer(4));
		mp.put("9,2", new Integer(5));
		mp.put("9,6", new Integer(2));
		mp.put("9,9", new Integer(3));

		initSudoku(mp);
		printSudoku();
	}


	@SuppressWarnings("unchecked")
	public static void initEmptySudoku() {
		sudukuMatrix = new int[ROW][ROW];
		numLib = new HashMap<String, ArrayList<Boolean>>();
		ArrayList<Boolean> numArr = new ArrayList<Boolean>();
		for (int i=0;i<ROW;i++) {
			numArr.add(true);
		}
		for(int i=0;i<ROW;i++) {
			numLib.put("ROW"+String.valueOf(i), (ArrayList<Boolean>) numArr.clone());
			numLib.put("COL"+String.valueOf(i), (ArrayList<Boolean>) numArr.clone());
		}
		numLib.put("BLOCK-0,0,2,2", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-0,3,2,5", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-0,6,2,8", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-3,0,5,2", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-3,3,5,5", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-3,6,5,8", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-6,0,8,2", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-6,3,8,5", (ArrayList<Boolean>) numArr.clone());
		numLib.put("BLOCK-6,6,8,8", (ArrayList<Boolean>) numArr.clone());
	}

	public static void initSudoku(HashMap<String, Integer> mpOrgDate) {
		Pattern p = Pattern.compile(posRegex);
		Matcher m = null;

		Iterator<Entry<String, Integer>> iter = mpOrgDate.entrySet().iterator();
		while (iter.hasNext()) {
			Entry<String, Integer> ety = (Entry<String, Integer>) iter.next();
			String pos = ety.getKey();
			Integer value = ety.getValue();
			if (pos == null || pos.equals(""))
				throw new IllegalArgumentException();
			m = p.matcher(pos);
			if (!m.matches())
				throw new IllegalArgumentException(pos);

			if (value == null)
				throw new IllegalArgumentException();
			if (value.intValue() > 9 || value.intValue() < 1)
				throw new IllegalArgumentException(value.toString());

			int posRow = new Integer(pos.split(",")[0]).intValue();
			int posCol = new Integer(pos.split(",")[1]).intValue();

			sudukuMatrix[posRow - 1][posCol - 1] = value.intValue();
			
			numLib.get("ROW"+String.valueOf(posRow - 1)).set(value.intValue()-1, false);
			numLib.get("COL"+String.valueOf(posCol - 1)).set(value.intValue()-1, false);
			
			int maxRow = ((posRow - 1) / 3 + 1) * 3 - 1;
			int minRow = (posRow - 1) / 3 * 3;
			int maxCol = ((posCol - 1) / 3 + 1) * 3 - 1;
			int minCol = (posCol - 1) / 3 * 3;
			
			numLib.get("BLOCK-"+String.valueOf(minRow)+","+String.valueOf(minCol)+","+String.valueOf(maxRow)+","+String.valueOf(maxCol)).set(value.intValue()-1, false);
		}

		if (!checkSudoku())
			throw new IllegalArgumentException("Not a Sudoku Matrix!");
	}

	public static void printSudoku() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < ROW; j++) {
				sb.append(sudukuMatrix[i][j]);
				if (j != (ROW - 1))
					sb.append(COMMA);
			}
			sb.append(CRLF);
		}
		System.out.print(sb.toString());
	}

	public static boolean checkSudoku() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < ROW; j++) {
				if (sudukuMatrix[i][j] == 0)
					continue;
				for (int m = j + 1; m < ROW; m++) {
					if (sudukuMatrix[i][j] == sudukuMatrix[i][m])
						return false;
				}
			}
		}

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < ROW; j++) {
				if (sudukuMatrix[j][i] == 0)
					continue;
				for (int m = j + 1; m < ROW; m++) {
					if (sudukuMatrix[j][i] == sudukuMatrix[m][i])
						return false;
				}
			}
		}

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < ROW; j++) {
				if (sudukuMatrix[i][j] == 0)
					continue;

				int maxRow = (i / 3 + 1) * 3 - 1;
				int minRow = i / 3 * 3;
				int maxCol = (j / 3 + 1) * 3 - 1;
				int minCol = j / 3 * 3;

				for (int m = minRow; m <= maxRow; m++) {
					for (int n = minCol; n <= maxCol; n++) {
						if (m == i || n == j)
							continue;
						if (sudukuMatrix[i][j] == sudukuMatrix[m][n])
							return false;
					}
				}
			}
		}

		return true;
	}
	
	public static void completeSudoku() {
		
	}
	
	private boolean getNumFromLib(int num, String libName) {
		return numLib.get(libName).get(num-1);
	}
}
