
public class Program {
	public static void main(String[] args) {
		int
			count = 0,
			result = 1;
		
		int[] array = {1, -1, 2, -2, 3, -3, 5, 4, -4, 5, -5, 6, 7};
		
		System.out.print("Номера элементов равных 5: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 5) {
				System.out.print((i + 1) + " ");
			}
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				count++;
			}
		}
		System.out.println("Количество положительных элементов: " + count);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				result *= array[i] * array[i];
			}
		}
		System.out.println("Произведение возведенных в степень отрицательных: " + result);
	}
}
