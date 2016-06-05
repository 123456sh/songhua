package com.songhua.onclick;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 内部类
 * 
 * @author Administrator
 * 
 */
public class ThreeActivity extends Activity {
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_three);
		mButton = (Button) findViewById(R.id.bt_three);
		mButton.setOnClickListener(new MyOnClickListener());
	}
	//生成MyOnClickListener这个类并实现OnClickListener接口
	public class MyOnClickListener implements OnClickListener {

		@Override
		public void onClick(View v) {
			startActivity(new Intent(ThreeActivity.this, FourActivity.class));
		}

	}

}
