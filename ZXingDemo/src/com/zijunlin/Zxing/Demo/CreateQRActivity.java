package com.zijunlin.Zxing.Demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CreateQRActivity extends Activity
{
	private ImageView QR_image;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.createqr);
	}
	
	public void createQR(View view)
	{
		QR_image = (ImageView) findViewById(R.id.ivQR);
		TextView urltext = (TextView) findViewById(R.id.urlText);
		TextView urltext_test = (TextView) findViewById(R.id.txtResult_test);
		//Button button_url = (Button) findViewById(R.id.submitURL);
		CreateQRImage tmp = new CreateQRImage();
		tmp.createQRImage(urltext.getText().toString());
		QR_image.setImageBitmap(tmp.bitmap);
		urltext_test.setText(urltext.getText());
	}

	public void resetURL(View view)
	{
		TextView urltext = (TextView) findViewById(R.id.urlText);
		urltext.setText("");
	}
	
	public void backtohome(View view)
	{
        Intent intent = new Intent();   
        /* 指定intent要启动的类 */
        intent.setClass(CreateQRActivity.this, MainActivity.class);
        /* 启动一个新的Activity */
        CreateQRActivity.this.startActivity(intent);
        /* 关闭当前的Activity */
        CreateQRActivity.this.finish();	
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		if(keyCode == KeyEvent.KEYCODE_BACK){
	        Intent intent = new Intent();   
	        /* 指定intent要启动的类 */
	        intent.setClass(CreateQRActivity.this, MainActivity.class);
	        /* 启动一个新的Activity */
	        CreateQRActivity.this.startActivity(intent);
	        /* 关闭当前的Activity */
	        CreateQRActivity.this.finish();	
			}
		return true;
	}
}