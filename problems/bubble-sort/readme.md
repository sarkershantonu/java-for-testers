# bubble sort

sort : 5,2,3,10,1


******Mamun**********


package SortingAlgorithm;

public class BubbleSort {

	public static void main(String[] args) {

		int a[] = { 5, 2, 3, 10, 1 };

		for (int j = 0; j < a.length; j++) {
			boolean swapped = false;
			int i = 0;
			while (i < 5 - 1) {
				if (a[i] > a[i + 1]) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					swapped = true;
				}
				i++;
			}
			if (!swapped)
				break;
		}

		for (int x : a) {
			System.out.println(x);
		}

	}
}
***********Mamun***********
