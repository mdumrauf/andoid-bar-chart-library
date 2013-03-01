package com.zauber.android.barchart;

import static com.zauber.android.barchart.BarChartUtils.newHeight;
import static com.zauber.android.barchart.BarChartUtils.newXArray;
import static com.zauber.android.barchart.BarChartUtils.newY;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class BarChartUtilsTest {

	@Test
	public void testGetNewHeight() {
		int previousY = 10;
		int previousHeight = 20;
		int newY = 10;
		assertEquals(20, newHeight(previousY, previousHeight, newY));
	}

	@Test
	public void testGetNewY() {
		int y0 = 100;
		int previousY = 150;
		int previousHeight = 50;
		assertEquals(150, newY(y0, previousY, previousHeight));
	}

	@Test
	public void testGetNewHeightFromNewY() {
		int newY = 100;
		int y0 = 50;
		assertEquals(50, newHeight(newY, y0));
	}

	@Test
	public void testGetNewXArray() {
		int x0 = 0;
		int numberOfBars = 3;
		int barWidth = 20;
		int barSeparatorWidth = 25;
		int newXArray[] = newXArray(x0, numberOfBars, barWidth, barSeparatorWidth);
		assertEquals(25, newXArray[0]);
		assertEquals(45, newXArray[1]);
		assertEquals(70, newXArray[2]);
	}

}
