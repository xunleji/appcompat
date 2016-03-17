package com.conn.estactionbar.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.conn.estactionbar.ui.ChatFragment;
import com.conn.estactionbar.ui.ContactFragment;
import com.conn.estactionbar.ui.DiscoverFragment;

/**
 * @Description: TODO
 * @author: conn
 * @date: 2014-3-18
 */
public class TabsPagerAdapter extends FragmentPagerAdapter {

	/**
	 * @param fm
	 */
	public TabsPagerAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int arg0) {
		switch (arg0) {
		case 0:
			ChatFragment fragment1 = new ChatFragment();
             return fragment1;
		case 1:
			DiscoverFragment  fragment2 = new DiscoverFragment();
             return fragment2;
		case 2:
			ContactFragment fragment3 = new ContactFragment();
            return fragment3;
		default:
			break;
		}
		return null;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 3;
	}

}
