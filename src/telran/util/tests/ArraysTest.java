package telran.util.tests;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import telran.util.ArraysInt;

class ArraysTest {
	int []array= {10,25,30,40,100};
	@Test
	void addNumberTest() {
		int[]arrayExpected={10,25,30,40,100,-2};
		int[]arrayActual=ArraysInt.addNumber(array,-2);
		assertArrayEquals(arrayExpected,arrayActual);
	}
	@Test
	void insertNumberTest() {
		int[]arrayExpectedLast={10,25,30,40,100,25};
		int[]arrayExpectedFirst={25,10,25,30,40,100};
		int[]arrayExpectedMiddle={10,25,30,25,40,100};
		int[]arrayActualLast=ArraysInt.insertNumber(array,5,25);
		int[]arrayActualFirst=ArraysInt.insertNumber(array,0,25);
		int[]arrayActualMiddle=ArraysInt.insertNumber(array,3,25);
		assertArrayEquals(arrayExpectedLast,arrayActualLast);
		assertArrayEquals(arrayExpectedFirst,arrayActualFirst);
		assertArrayEquals(arrayExpectedMiddle,arrayActualMiddle);
	}
	 
	@Test
	void removeNumberTest() {
		int[]arrayExpectedLast={10,25,30,40};
		int[]arrayExpectedFirst={25,30,40,100};
		int[]arrayExpectedMiddle={10,25,40,100};
		
		int[]arrayActualLast=ArraysInt.removeNumber(array,array.length-1);
		int[]arrayActualFirst=ArraysInt.removeNumber(array,0);
		int[]arrayActualMiddle=ArraysInt.removeNumber(array,2);
		
		assertArrayEquals(arrayExpectedLast,arrayActualLast);
		assertArrayEquals(arrayExpectedFirst,arrayActualFirst);
		assertArrayEquals(arrayExpectedMiddle,arrayActualMiddle);
	}
	
	@Test
	void insertSortedTest() {
		int[]arrayExpectedLast={10,25,30,40,100,150};
		int[]arrayExpectedFirst={10,10,25,30,40,100};
		int[]arrayExpectedMiddle={10,25,30,35,40,100};
		int[]arrayActualLast=ArraysInt.insertSorted(array,150);
		int[]arrayActualFirst=ArraysInt.insertSorted(array,10);
		int[]arrayActualMiddle=ArraysInt.insertSorted(array,35);
		
		assertArrayEquals(arrayExpectedLast,arrayActualLast);
		assertArrayEquals(arrayExpectedFirst,arrayActualFirst);
		assertArrayEquals(arrayExpectedMiddle,arrayActualMiddle);
	}
	
	@Test
	void copyOfTest() {
		int[]arrayExpectedSameLength={10,25,30,40,100};
		int[]arrayExpectedLessLength={10,25,30};
		int[]arrayExpectedGreaterLength={10,25,30,40,100,0};
		
		int[]arrayActualSameLength=Arrays.copyOf(array,array.length);
		int[]arrayActualLessLength=Arrays.copyOf(array,array.length-2);
		int[]arrayActualGreaterLength=Arrays.copyOf(array,array.length+1);
		
		assertArrayEquals(arrayExpectedSameLength,arrayActualSameLength);
		assertArrayEquals(arrayExpectedLessLength,arrayActualLessLength);
		assertArrayEquals(arrayExpectedGreaterLength,arrayActualGreaterLength);
	}
	
	@Test
	void arrayCopyTest() {
		int[]array1= {3,10,20,15};
		int[]expected= {10,25,10,20,100};
		int[]arrayCopy=Arrays.copyOf(array, array.length);
		
		System.arraycopy(array1, 1, arrayCopy, 2, 2);
		assertArrayEquals(expected,arrayCopy);
	}
	
	@Test
	void binarySearchIntTest() {
		int[]array1= {10,25,30,40,100,150};
		assertEquals(1,Arrays.binarySearch(array1, 25));
		assertEquals(-5,Arrays.binarySearch(array1, 41));
		;
	}
	}

