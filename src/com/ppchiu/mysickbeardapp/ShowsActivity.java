package com.ppchiu.mysickbeardapp;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ShowsActivity extends Activity {
	
	ArrayList<String> shows;
	ArrayAdapter<String> aa; 

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_shows);

        shows = new ArrayList<String>();
        aa = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, shows);
        shows.add("House");
        shows.add("Suits");
        shows.add("Continuum");
        shows.add("White Collar");
        
        ListView showList = (ListView)findViewById(R.id.showsList);
        showList.setAdapter(aa);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_shows, menu);
        return true;
    }

    
}
