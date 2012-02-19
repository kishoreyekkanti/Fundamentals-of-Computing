package com.algorithms;

import java.util.Calendar;
import java.util.Random;

public class AlgorithmHelper {

	public static int[] getRandonNumberArray(int length)
	{
		int[] randomArray = new int[length];
		for(int i=0; i<length; i++){
			randomArray[i] = getRandomNumber();
		}
		return randomArray;
	}


	public static int getRandomNumber()
	{
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	} 

	public static long getCurrentTimeInMillisecs(){
		Calendar cal = Calendar.getInstance();
		return cal.getTimeInMillis();
	}	

}
