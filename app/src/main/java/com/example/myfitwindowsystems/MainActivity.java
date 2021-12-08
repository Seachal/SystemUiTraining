package com.example.myfitwindowsystems;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn_image).setOnClickListener(this);
		findViewById(R.id.btn_color).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.btn_image:
				startActivity(new Intent(this, ImageActivity.class));
				break;
			case R.id.btn_color:
				startActivity(new Intent(this, ColorActivity.class));
				break;
		}
	}
}
