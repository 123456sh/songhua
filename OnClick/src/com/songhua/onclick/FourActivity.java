package com.songhua.onclick;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * 实例化一个OnClickListener得到参数MyOnClickListener
 * @author Administrator
 *
 */
public class FourActivity extends Activity {
private Button mButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_four);
		mButton = (Button) findViewById(R.id.bt_four);
		mButton.setOnClickListener(myOnClickListener);
	}
	//实例化一个OnClickListener得到参数MyOnClickListener
	OnClickListener myOnClickListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			startActivity(new Intent(FourActivity.this,MainActivity.class));
		}
	};

}
