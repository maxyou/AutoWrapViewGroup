package com.maxproj.viewgrouptest;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

public class AutoWrapViewGroup extends ViewGroup {
	public AutoWrapViewGroup(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	private final static String TAG = "AutoWrapViewGroup";

	private final static int VIEW_MARGIN = 10;

	public AutoWrapViewGroup(Context context) {
		super(context);
	}

	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		Log.d(TAG, "AutoWrapViewGroup widthMeasureSpec = " + widthMeasureSpec
				+ " heightMeasureSpec" + heightMeasureSpec);

		for (int index = 0; index < getChildCount(); index++) {
			final View child = getChildAt(index);
			// measure
			child.measure(MeasureSpec.UNSPECIFIED, MeasureSpec.UNSPECIFIED);
		}

		super.onMeasure(widthMeasureSpec, heightMeasureSpec);
	}

	@Override
	protected void onLayout(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
		Log.d("", "onLayout parants： changed = " + arg0 + " left = " + arg1
				+ " top = " + arg2 + " right = " + arg3 + " botom = " + arg4);

		int parants_width = arg3 - arg1;//ViewGroup宽度
		
		final int count = getChildCount();
		int rightMove = 0;
		int bottomMove = 0;
		
		for (int i = 0; i < count; i++) {

			
			View child = this.getChildAt(i);
			int width = child.getMeasuredWidth();
			int height = child.getMeasuredHeight();
			
			if(i == 0){
				bottomMove = height + VIEW_MARGIN;
			}
			
			rightMove += width + VIEW_MARGIN;

			if (rightMove > parants_width) {//换行
				rightMove = width + VIEW_MARGIN;
				bottomMove += height + VIEW_MARGIN;
			}else{
				
			}
			child.layout(rightMove - width, bottomMove - height, rightMove, bottomMove);
			Log.d("","onLayout params： "+(rightMove)+" "+(bottomMove) +" "+ width+" "+height);
			Log.d("","onLayout child： "+(rightMove - width)+" "+(bottomMove - height) +" "+ rightMove+" "+bottomMove);
		}
//		invalidate();
	}

}
