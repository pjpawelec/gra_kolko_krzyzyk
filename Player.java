package gra.main;

public class Player {

	private int a1 = 0;
	private int a2 = 0;
	private int a3 = 0;
	private int b1 = 0;
	private int b2 = 0;
	private int b3 = 0;
	private int c1 = 0;
	private int c2 = 0;
	private int c3 = 0;
	
	public void addA1() {
		a1++;
	}

	public void addA2() {
		a2++;
	}

	public void addA3() {
		a3++;
	}

	public void addB1() {
		b1++;
	}

	public void addB2() {
		b2++;
	}

	public void addB3() {
		b3++;
	}

	public void addC1() {
		c1++;
	}

	public void addC2() {
		c2++;
	}

	public void addC3() {
		c3++;
	}

	public boolean checkIfWin() {
		boolean result = false;
		if (a1 + a2 + a3 == 3 || b1 + b2 + b3 == 3 || c1 + c2 + c3 == 3 || a1 + b1 + c1 == 3 || a2 + b2 + c2 == 3
				|| a3 + b3 + c3 == 3 || a1 + b2 + c3 == 3 || c1 + b2 + a3 == 3) {
			result = true;
		}
		return result;
	}

	public void reset() {
		a1 = a2 = a3 = b1 = b2 = b3 = c1 = c2 = c3 = 0;
	}
}
