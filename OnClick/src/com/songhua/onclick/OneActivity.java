package com.songhua.onclick;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * ʵ�� OnClickListener �ӿڣ�
 * 
 * @author Administrator
 * 
 */
public class OneActivity extends Activity implements OnClickListener {
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);
		mButton = (Button) findViewById(R.id.bt_one);
		mButton.setOnClickListener(this);

	}

	// ��д��onClick ����
	@Override
	public void onClick(View v) {
		startActivity(new Intent(OneActivity.this, TwoActivity.class));
	}
}