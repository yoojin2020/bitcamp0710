package bcs.day05;

public class Sum {
	int sum;

	public int allsum(int x, int y) {
		for (int i = x; i <= y; i++)
			sum += i;
		return sum;
	}

	public int oddsum(int x, int y) {
		if (x % 2 == 0)
			x++;
		for (int i = x; i <= y; i += 2)
			sum += i;
		return sum;
	}

	public int evensum(int x, int y) {
		if (x % 2 == 1)
			x++;
		for (int i = x; i <= y; i += 2)
			sum += i;
		return sum;
	}

}// class