package edu.cmu.bttaylor.lab2activitylifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewDemoActivity extends Activity {
	private Button mButton;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_demo);
        
        mButton = (Button) this.findViewById(R.id.destroy);
        mButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
        });
        Log.d("NewDemo","onCreate() was called.");
    }
    
    @Override
    public void onRestart() {
    	Log.d("NewDemo","onRestart() was called.");
    	super.onRestart();
    }

    @Override
    public void onStart() {
    	Log.d("NewDemo","onStart() was called.");
    	super.onStart();
    }
    
    @Override
    public void onResume() {
    	Log.d("NewDemo","onResume() was called.");
    	super.onResume();
    }
    
    @Override
    public void onPause() {
    	Log.d("NewDemo","onPause() was called.");
    	super.onPause();
    }
    
    @Override
    public void onStop() {
    	Log.d("NewDemo","onStop() was called.");
    	super.onStop();
    }
    
    @Override
    public void onDestroy() {
    	Log.d("NewDemo","onDestroy() was called.");
    	super.onDestroy();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.lifecycle_demo, menu);
        return true;
    }

}
