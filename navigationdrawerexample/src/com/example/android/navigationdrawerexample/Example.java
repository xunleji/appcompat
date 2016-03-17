package com.example.android.navigationdrawerexample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Example extends ListActivity {

	private String[] str = new String[] { "example1", "example2" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, str));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		if (position == 0) {
			Intent intent = new Intent(Example.this, MainActivity.class);
			startActivity(intent);
		} else if (position == 1) {
			Intent intent = new Intent(Example.this, SecondActivity.class);
			startActivity(intent);
		}
	}

}
