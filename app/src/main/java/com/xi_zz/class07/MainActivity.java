package com.xi_zz.class07;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void launchActivity(View view) {
		Intent intent = new Intent(this, SecondActivity.class);

		intent.putExtra(Keys.STRING, "Hello~~~~~~~~~");
		intent.putExtra(Keys.NUM, 100);

		startActivity(intent);
	}
}
