package javaLabBook;

public class SumOfArrayValues {
	public static void main(String[] args) {
		int[] array = {10,20,30,40,50};
		int sum = 0;
		
		for(int num : array)
		{
			sum=sum+num;
			}
		System.out.println("Sum of array elements is:"+sum);
		}
}
