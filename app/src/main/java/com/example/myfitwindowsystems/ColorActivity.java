package com.example.myfitwindowsystems;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class ColorActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_color);

		Toolbar toolbar = (Toolbar) findViewById(R.id.id_toolbar);
		setSupportActionBar(toolbar);
	}
}
