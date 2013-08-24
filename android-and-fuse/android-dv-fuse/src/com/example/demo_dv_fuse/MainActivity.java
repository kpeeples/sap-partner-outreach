package com.example.demo_dv_fuse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	 private Spinner spinner1;
	 private Button button1;
	 String[] items;

	 
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addItemsOnSpinner1();
		addListenerOnButton();
	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

	
	// add items into spinner dynamically
	public void addItemsOnSpinner1() {	
		
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		List list = new ArrayList();
		list.add("Atlanta (ATL)");
		list.add("Charleston (CHS)");
		ArrayAdapter dataAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		spinner1.setAdapter(dataAdapter);
	}

	public void addListenerOnButton() {
	 
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
		
			@Override
			public void onClick(View v) {

						Toast.makeText(MainActivity.this,
						"Result : " +
								"\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),
								Toast.LENGTH_SHORT).show();
				}
			});
		}
	
}
