/*
 *If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
 *The sum of these multiples is 23.
 *
 *Find the sum of all the multiples of 3 or 5 below 1000.
*/

public class Problem1{
	public static void main(String[] args){
		int[] numbers=new int[999];
		for(int i = 0; i < numbers.length; i++){
			numbers[i]=i+1;
		}
		System.out.format("Sum: %d", getSum(numbers));
	}

	public static int getSum(int[] numbers){
		if(numbers.length < 1000){
			int sum = 0;
			for(int number : numbers){
				if(number % 3 == 0 && number % 5 == 00){
					sum += number;
				}else if(number % 3 == 0){
					sum += number;
				}else if(number % 5 == 0){
					sum += number;
				}
			}
			return sum;
		}
		return -1;
	}
}