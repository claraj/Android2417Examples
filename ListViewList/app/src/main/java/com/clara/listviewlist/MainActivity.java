package com.clara.listviewlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ListView listView = findViewById(R.id.simple_list);

		//Create an ArrayList and add some example data
		List<String> androidVersions = new ArrayList<>();
		androidVersions.add("Jellybean");
		androidVersions.add("Kitkat");
		androidVersions.add("Lollipop");

		//Create Adapter: provide Context (typically this Activity), a layout file, and TextView, and List
		ArrayAdapter<String> arrayAdapter =
				new ArrayAdapter<String>(this, R.layout.list_view_item, R.id.list_item_text, androidVersions);

		listView.setAdapter(arrayAdapter);

		//Add data to the ArrayList
		androidVersions.add("Marshmallow");   // Add at the end
		androidVersions.add(0, "Ice cream sandwich");   // Add at the start
		androidVersions.add(2, "Oreo");   // Add in the middle
		//And tell the ArrayAdapter to notify the ListView that the data has changed
		arrayAdapter.notifyDataSetChanged();

	}
}










