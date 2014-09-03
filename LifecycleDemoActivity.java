package edu.cmu.bttaylor.lab2activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LifecycleDemoActivity extends Activity {
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lifecycle_demo);
		
		Button b = (Button) this.findViewById(R.id.launch_new);
		b.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					startActivity(new Intent(getApplicationContext(),NewDemoActivity.class));
				}
		});
		
		Log.d("LifecycleDemo","onCreate() was called.");
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		Log.d("LifecycleDemo","onStart() was called");
		super.onStart();
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		Log.d("LifecycleDemo","onRestart() was called");
		super.onRestart();
	}

	@Override
	protected void onResume() {
		Log.d("LifecycleDemo","onResume() was called");
		super.onResume();
	}

	@Override
	protected void onPause() {
		Log.d("LifecycleDemo","onPause() was called");
		super.onPause();
	}

	@Override
	protected void onStop() {
		Log.d("LifecycleDemo","onStop() was called");
		super.onStop();
	}

	@Override
	protected void onDestroy() {
		Log.d("LifecycleDemo","onDestroy() was called");
		super.onDestroy();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lifecycle_demo, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
