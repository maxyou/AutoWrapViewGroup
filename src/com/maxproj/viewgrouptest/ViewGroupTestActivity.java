package com.maxproj.viewgrouptest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class ViewGroupTestActivity extends Activity {

	AutoWrapViewGroup viewgroup_grid;
	AutoWrapViewGroup viewgroup_grid2;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_group_test);
		
		viewgroup_grid = (AutoWrapViewGroup)findViewById(R.id.viewgroup_grid);
		viewgroup_grid2 = (AutoWrapViewGroup)findViewById(R.id.viewgroup_grid2);
		
		addTextViewToAddedViewGroup(viewgroup_grid, "1----------");
		addTextViewToAddedViewGroup(viewgroup_grid, "2~~~~~~~~");
		addTextViewToAddedViewGroup(viewgroup_grid, "3------");
		addTextViewToAddedViewGroup(viewgroup_grid, "4===");
		addTextViewToAddedViewGroup(viewgroup_grid, "5======================================");
		addTextViewToAddedViewGroup(viewgroup_grid, "6~~~");
		addTextViewToAddedViewGroup(viewgroup_grid, "7++++++");
		addTextViewToAddedViewGroup(viewgroup_grid, "8**** ");
		addTextViewToAddedViewGroup(viewgroup_grid, "9==========");
		addTextViewToAddedViewGroup(viewgroup_grid, "10_____ ");
		
		addTextViewToAddedViewGroup(viewgroup_grid2, "-2**********");
		addTextViewToAddedViewGroup(viewgroup_grid2, "-1+++++++");
		addTextViewToAddedViewGroup(viewgroup_grid2, "0^^^^^^^^^^^^^^^^^");
		addTextViewToAddedViewGroup(viewgroup_grid2, "1_____ ");
		addTextViewToAddedViewGroup(viewgroup_grid2, "2~~~~~~~~");
		addTextViewToAddedViewGroup(viewgroup_grid2, "3=====================");
		addTextViewToAddedViewGroup(viewgroup_grid2, "4----------");
		addTextViewToAddedViewGroup(viewgroup_grid2, "5~~~");
		addTextViewToAddedViewGroup(viewgroup_grid2, "6------");
		addTextViewToAddedViewGroup(viewgroup_grid2, "7++++++");
		addTextViewToAddedViewGroup(viewgroup_grid2, "8**** ");
		addTextViewToAddedViewGroup(viewgroup_grid2, "9==========");
		addTextViewToAddedViewGroup(viewgroup_grid2, "10===");
	}
	
	public void addTextViewToAddedViewGroup(AutoWrapViewGroup awvg, String input_string) {
		TextView tv = new TextView(this);
		tv.setText(input_string);
		awvg.addView(tv);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.view_group_test, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
