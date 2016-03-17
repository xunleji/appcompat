package com.conn.estactionbar.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.conn.estactionbar.R;

/**
 * @Description: TODO
 * @author: conn
 * @date: 2014-3-18
 */
public class DiscoverFragment extends Fragment {

	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		Log.i("Fragment1", "onCreate()");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view =inflater.inflate(R.layout.fragment1, null);
		return view;
	}
	
}
