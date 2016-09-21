package Sort;

import java.util.Arrays;
import java.util.Random;

public class Sort {

	public static int[] main() {

		Random randomGenerator = new Random();

		int[] numbers = new int[4];
		
		for(int i = 0; i < 4; i++){
			numbers[i] = randomGenerator.nextInt(50);
		}	
		
		Arrays.sort(numbers);
		
		for(int i = 0; i < numbers.length ; i++){
		System.out.println(numbers[i]);
		}
		return numbers;
		
	}

}
