package com.songhua.onclick;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * �ڿؼ���ע������
 * 
 * @author Administrator
 * 
 */
public class TwoActivity extends Activity {
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		mButton = (Button) findViewById(R.id.bt_two);
	}

	// ������ʵ��click����
	public void click(View v) {
		startActivity(new Intent(TwoActivity.this, ThreeActivity.class));
	}
}
