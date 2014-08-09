package com.zijunlin.Zxing.Demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity
{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void tocreateQR(View view)
	{
        Intent intent = new Intent();   
        /* 指定intent要启动的类 */
        intent.setClass(MainActivity.this, CreateQRActivity.class);
        /* 启动一个新的Activity */
        MainActivity.this.startActivity(intent);
        /* 关闭当前的Activity */
        MainActivity.this.finish();

	}
	
	public void tocapture(View view)
	{
        Intent intent = new Intent();   
        /* 指定intent要启动的类 */
        intent.setClass(MainActivity.this, CaptureActivity.class);
        /* 启动一个新的Activity */
        MainActivity.this.startActivity(intent);
        /* 关闭当前的Activity */
        MainActivity.this.finish();	}

}