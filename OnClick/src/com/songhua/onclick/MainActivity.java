package com.songhua.onclick;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
/**
 * �����ڲ��ࣺ
 * @author Administrator
 *
 */
public class MainActivity extends Activity {
private Button mButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mButton = (Button) findViewById(R.id.bt_main);
		//�ؼ��ĵ���¼�ʹ�������ڲ���
		mButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				startActivity(new Intent(MainActivity.this,OneActivity.class ));
			}
		});
	}


}
