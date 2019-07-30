import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11122211;
		System.out.println(smallerNumber(n));
	}

	static int smallerNumber(int n) {
		// tach tung chu so cho vao list
		boolean check = true;
		List<Integer> number = new ArrayList<Integer>();
		while (n != 0) {
			number.add(n % 10);
			n /= 10;
		}
		// doi 2 so hang
		int index = 0;
		for (; index < number.size() - 1; index++) {
			if (number.get(index) < number.get(index + 1)) {
				int maxIndex = index;
				
				for (int i = 0; i < index; i++) {
					if (number.get(i) > number.get(maxIndex) && number.get(i) < number.get(index)) {
						maxIndex = i;
					}
				}
				
				int swap = number.get(maxIndex);
				number.set(maxIndex, number.get(index + 1));
				number.set(index + 1, swap);
				check = false;
				break;
			}
		}
		// sap xep lai de dc max
		for (int i = 0; i < index; i++) {
			for (int j = i + 1; j <= index; j++)
				if (number.get(i) > number.get(j)) {
					int swap = number.get(i);
					number.set(i, number.get(j));
					number.set(j, swap);
				}
		}
		if (check)

		{
			return -1;
		} else {
			// convert list to number
			int result = number.get(0);
			int x = 10;
			for (int i = 1; i < number.size(); i++) {
				result += number.get(i) * x;
				x *= 10;
			}
			return result;
		}
	}
}
