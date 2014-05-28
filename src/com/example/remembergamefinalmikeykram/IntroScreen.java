package com.example.remembergamefinalmikeykram;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.Build;

public class IntroScreen extends ActionBarActivity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.title_screen);
//		ImageView image1 = (ImageView) findViewById(R.id.image1a);
//		ImageView image2 = (ImageView) findViewById(R.id.image2a);
//		ImageView image3 = (ImageView) findViewById(R.id.image3a);
//		ImageView image4 = (ImageView) findViewById(R.id.image4a);

		getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
		getActionBar().hide();

		setContentView(R.layout.title_screen);
		// TextView t = (TextView)findViewById(R.id.taperino);
		// Animation blink =
		// AnimationUtils.loadAnimation(getApplicationContext(), R.anim.tap);
		// t.startAnimation(blink);

		


	}





	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.remember_game_main, menu);
		return true;
	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}

	public void thing(){
		
	}


}
