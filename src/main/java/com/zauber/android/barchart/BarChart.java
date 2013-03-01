package com.zauber.android.barchart;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;

public class BarChart extends View {

	private List<ShapeDrawable> bars = new ArrayList<ShapeDrawable>();

	public BarChart(Context context, AttributeSet attrs) {
		super(context, attrs);

		int x = 100;
		int y = 400;
		int width = 50;
		int height = 300;

		this.bars.add(newBar(x, y, width, height, Color.RED));
	}

	private ShapeDrawable newBar(int x, int y, int width, int height, int color) {
		ShapeDrawable bar = new ShapeDrawable(new RectShape());
		bar.getPaint().setColor(color);
		bar.setBounds(x, y, x + width, y + height);
		return bar;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		for (ShapeDrawable bar : this.bars) {
			bar.draw(canvas);
		}
	}

}
