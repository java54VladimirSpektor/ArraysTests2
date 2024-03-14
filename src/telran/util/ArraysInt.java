package telran.util;

import java.util.Arrays;

public class ArraysInt {
	public static int[] addNumber(int []array,int number) {
		int []ar1=Arrays.copyOf(array, array.length+1);
		 ar1[array.length]=number;
		 return ar1;
		//apply method  copyOf of class Arrays
		
	}
	public static int[] insertNumber(int[]array,int index,int number) {
//		int []ar1=Arrays.copyOf(array, array.length+1);
//		int i=0;
//		for(i=ar1.length-1;i>index;i--) {
//			ar1[i]=ar1[i-1];
//		}
//		ar1[index]=number;
		int []ar1=array;
		if(index>-1&&index<=array.length) {
			ar1=new int[array.length+1];
			System.arraycopy(array, 0, ar1, 0, index);
			System.arraycopy(array, index, ar1, index+1, array.length-index);
			ar1[index]=number;
		}
		return ar1;
		//apply method arraycopy of class System
	}
	public static int[]removeNumber(int[]array,int index){
		int []ar1=array;
		if(index>-1&&index<array.length) {
			ar1=new int[array.length-1];
			System.arraycopy(array, 0, ar1, 0, index);
			System.arraycopy(array, index+1, ar1, index, array.length-index-1);
		
		}
		return ar1;
		//apply method arraycopy of class System
		
	}
	public static int[]insertSorted(int[]sortedArray, int number){
		
		int index=Arrays.binarySearch(sortedArray, number);
		if(index<0) {
			index=-(index+1);
		}
		
		//insert number into sorted array with keeping the sorted order
		//apply method binarySearch of class Arrays
		return insertNumber(sortedArray,index,number);
	}
}
