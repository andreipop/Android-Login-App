package com.android.loginapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/***
 * Simple Hello World landing. 
 * @author Andrei
 *
 */
public class Helloworld extends Activity {
	
	public TextView helloTextView;
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello);
        initControls();
    }
	    
	public void initControls(){
		helloTextView = (TextView)findViewById(R.id.myTextView);
	}
	
}

