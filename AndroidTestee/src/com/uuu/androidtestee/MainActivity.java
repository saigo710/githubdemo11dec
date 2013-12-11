package com.uuu.androidtestee;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		return super.onOptionsItemSelected(item);
	}

	private static final String TAG = "MYTEST";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Log.v("abc","bbb...");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void doClick(View view){
		Log.v(TAG, "button clicked !~");
		TextView textView1 = (TextView)this.findViewById(R.id.textView1);
		EditText editText1 =(EditText)this.findViewById(R.id.editText1);
		textView1.setText(editText1.getText().toString());
	}

}
