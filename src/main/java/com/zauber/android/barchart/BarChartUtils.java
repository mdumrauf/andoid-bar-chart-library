package com.zauber.android.barchart;


public class BarChartUtils {

	public static int newHeight(int previousY, int previousHeight, int newY) {
		return previousY + previousHeight - newY;
	}

	public static int newY(int y0, int previousY, int previousHeight) {
		return (y0 + previousY + previousHeight) / 2;
	}

	public static int newHeight(int newY, int y0) {
		return newY - y0;
	}

	public static int[] newXArray(int x0, int numberOfBars, int barWidth, int barSeparatorWidth) {
		int[] newXarray = new int[numberOfBars];
		newXarray[0] = x0 + barSeparatorWidth;
		
		for (int i = 1; i < newXarray.length; i++) {
			newXarray[i] = newXarray[i - 1] + (isEven(i + 1) ? barWidth : barSeparatorWidth);
		}
		return newXarray;
	}

	private static boolean isEven(int numberOfBars) {
		return numberOfBars % 2 == 0;
	}

}
