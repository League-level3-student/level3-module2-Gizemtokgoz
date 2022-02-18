package _00_Intro_to_Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JFrame;

public class VisualArraySorterCode {
	JFrame frame = new JFrame();
	int[] inta;

	void setup() {
		frame.setSize(500, 500);
		inta = new int[50];
		
		for (int i = 0; i < inta.length; i++) {
			// inta[i] = randIn
		}
	}
	
	void draw() {
		frame.setBackground(null);
	}

	int startIndex = 1;

	void stepSort(int[] arr) {
		for (int i = startIndex; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) {
				int t = arr[i];
				arr[i] = arr[i - 1];
				arr[i - 1] = t;

				startIndex = i;
				return;
			}
		}
		startIndex = 1;
	}
}
