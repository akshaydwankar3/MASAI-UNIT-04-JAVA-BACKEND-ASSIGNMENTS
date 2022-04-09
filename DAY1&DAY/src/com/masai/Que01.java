package com.masai;

public class Que01 {
	
	public static void naturalNumber(int n)
	{
		int result = 0;
		for(int i = 1; i <= n; i++)
		{
			result += i;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sum of Natural Numbers from 1 to N
		
		naturalNumber(5);
	}

}
