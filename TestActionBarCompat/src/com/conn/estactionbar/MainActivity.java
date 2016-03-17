package com.conn.estactionbar;

import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBar.Tab;
import android.support.v7.app.ActionBar.TabListener;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.conn.estactionbar.adapter.TabsPagerAdapter;

public class MainActivity extends ActionBarActivity {

	private ViewPager viewPager;
	private ActionBar actionbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		viewPager = (ViewPager) this.findViewById(R.id.pager);
		actionbar = getSupportActionBar();
		actionbar.setDisplayShowTitleEnabled(true);
		actionbar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		FragmentManager fm = getSupportFragmentManager();
		ViewPager.SimpleOnPageChangeListener pageChangeListener = new ViewPager.SimpleOnPageChangeListener() {

			@Override
			public void onPageSelected(int position) {
				super.onPageSelected(position);
				actionbar.setSelectedNavigationItem(position);
			}

		};

		viewPager.setOnPageChangeListener(pageChangeListener);

		TabsPagerAdapter pagerAdapter = new TabsPagerAdapter(fm);
		viewPager.setAdapter(pagerAdapter);
		ActionBar.TabListener tabListener = new TabListener() {

			@Override
			public void onTabUnselected(Tab arg0, FragmentTransaction arg1) {
				// TODO Auto-generated method stub
			}

			@Override
			public void onTabSelected(Tab arg0, FragmentTransaction arg1) {
				viewPager.setCurrentItem(arg0.getPosition());
			}

			@Override
			public void onTabReselected(Tab arg0, FragmentTransaction arg1) {
				// TODO Auto-generated method stub

			}
		};

		Resources res = getResources();
		Tab tab = actionbar.newTab().setText(res.getString(R.string.chat))
				.setTabListener(tabListener);
		actionbar.addTab(tab);
		tab = actionbar.newTab().setText(res.getString(R.string.discover))
				.setTabListener(tabListener);
		actionbar.addTab(tab);
		tab = actionbar.newTab().setText(res.getString(R.string.contact))
				.setTabListener(tabListener);
		actionbar.addTab(tab);

		viewPager.setCurrentItem(1);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.search:
			Log.e("onOptionsItemSelected", "search");
			return true;
		case R.id.item1:
			Log.e("onOptionsItemSelected", "item1");
			return true;
		case R.id.item2:
			Log.e("onOptionsItemSelected", "item2");
			return true;
		case R.id.search_item:
			Log.e("onOptionsItemSelected", "search_item");
			return true;
		case R.id.item4:
			Log.e("onOptionsItemSelected", "item4");
			return true;
		case R.id.item5:
			Log.e("onOptionsItemSelected", "item5");
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

}
