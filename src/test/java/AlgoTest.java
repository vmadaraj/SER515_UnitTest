package test.java;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import main.java.Item;
import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	SortDemoData testData = new SortDemoData();
	SortDemoData answer = new SortDemoData();
	/*
	 * This test is to test the bubble sort algorithm and this addresses the 
	 * sequence [10 20 30 50 70 40 60] which has node, condition and edge coverage
	 */
	@Test
	public void testBubbleSort() {
		testData.initializeArray("10 20 30 50 70 40 60");
		answer.initializeArray("10 20 30 40 50 60 70");
		testData.runAlgo(0);
		assertTrue(testData.myArray.length == answer.myArray.length);
		for (int i = 0; i<testData.myArray.length; i++){
			assertTrue(testData.myArray[i].key == answer.myArray[i].key);
		}	
	}
	
	
	/*
	 * This test is to test the bubble sort algorithm and this addresses the 
	 *null sequence which has conditional coverage
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyBubbleSort() {
		SortAlgos.bubbleSort(null);
	}
	
	/*
	 * This test is to test the selection sort algorithm and this addresses the 
	 * sequence [10 20 30 50 70 40 60] which has node, condition and edge coverage
	 */
	@Test
	public void testSelectionSort() {
		testData.initializeArray("10 20 30 50 70 40 60");
		answer.initializeArray("10 20 30 40 50 60 70");
		testData.runAlgo(1);
		assertTrue(testData.myArray.length == answer.myArray.length);
		for (int i = 0; i<testData.myArray.length; i++){
			assertTrue(testData.myArray[i].key == answer.myArray[i].key);
		}	
	}
	
	/*
	 * This test is to test the selection sort algorithm and this addresses the 
	 * null sequence which has conditional coverage
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptySelectionSort() {
		SortAlgos.selectionSort(null);
	}
	
	/*
	 * This test is to test the insertion sort algorithm and this addresses the 
	 * sequence [10 20 30 50 70 40 60] which has node, condition and edge coverage
	 */
	@Test
	public void testInsertionSort() {
		testData.initializeArray("10 20 30 50 70 40 60");
		answer.initializeArray("10 20 30 40 50 60 70");
		testData.runAlgo(2);
		assertTrue(testData.myArray.length == answer.myArray.length);
		for (int i = 0; i<testData.myArray.length; i++){
			assertTrue(testData.myArray[i].key == answer.myArray[i].key);
		}	
	}
	
	/*
	 * This test is to test the insertion sort algorithm and this addresses the 
	 * null sequence which has conditional coverage
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyInsertionSort() {
		SortAlgos.insertionSort(null);
	}
	
	/*
	 * This test is to test the merge sort algorithm and this addresses the 
	 * sequence [10 20 30 50 70 40 60] which has node, condition and edge coverage
	 */
	@Test
	public void testMergeSort() {
		testData.initializeArray("10 20 30 50 70 40 60");
		answer.initializeArray("10 20 30 40 50 60 70");
		testData.runAlgo(3);
		assertTrue(testData.myArray.length == answer.myArray.length);
		for (int i = 0; i<testData.myArray.length; i++){
			assertTrue(testData.myArray[i].key == answer.myArray[i].key);
		}	
	}
	
	/*
	 * This test is to test the merge sort algorithm and this addresses the 
	 * null sequence which has conditional coverage
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyMergeSort() {
		SortAlgos.mergeSort(null);
	}
	
	/*
	 * This test is to test the quick sort algorithm and this addresses the 
	 * sequence [10 20 30 50 70 40 60] which has node, condition and edge coverage
	 */
	@Test
	public void testQuickSort() {
		testData.initializeArray("10 20 30 50 70 40 60");
		answer.initializeArray("10 20 30 40 50 60 70");
		testData.runAlgo(4);
		assertTrue(testData.myArray.length == answer.myArray.length);
		for (int i = 0; i<testData.myArray.length; i++){
			assertTrue(testData.myArray[i].key == answer.myArray[i].key);
		}	
	}
	
	/*
	 * This test is to test the quick sort algorithm and this addresses the 
	 * null sequence which has conditional coverage
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyQuickSort() {
		SortAlgos.quickSort(null);
	}
	
	/*
	 * This test is to test the heap sort algorithm and this addresses the 
	 * sequence [10 20 30 50 70 40 60] which has node, condition and edge coverage
	 */
	@Test
	public void testHeapSort() {
		testData.initializeArray("10 20 30 50 70 40 60");
		answer.initializeArray("10 20 30 40 50 60 70");
		testData.runAlgo(5);
		assertTrue(testData.myArray.length == answer.myArray.length);
		for (int i = 0; i<testData.myArray.length; i++){
			assertTrue(testData.myArray[i].key == answer.myArray[i].key);
		}	
	}
	
	/*
	 * This test is to test the heap sort algorithm and this addresses the 
	 * null sequence which has conditional coverage
	 */
	@Test (expected = java.lang.NullPointerException.class)
	public void testEmptyHeapSort() {
		SortAlgos.heapSort(null);
	}
}
