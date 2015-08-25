package com.hollylink.activitytest;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		
		Button button1 = (Button) findViewById(R.id.button_1);
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(FirstActivity.this, "Your clicked button1", Toast.LENGTH_SHORT).show();
				//finish();
				//Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
				//Intent intent = new Intent("com.hollylink.activitytest.ACTION_START");
				//intent.addCategory("com.hollylink.activitytest.MY_CATEGORY");
				
				//浏览器打开网页
				//Intent intent = new Intent(Intent.ACTION_VIEW);
				//intent.setData(Uri.parse("http://www.baidu.com"));
				
				//打电话界面
				Intent intent = new Intent(Intent.ACTION_DIAL);
				intent.setData(Uri.parse("tel:10086"));
				startActivity(intent);
			}
		});
		
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stu
		System.out.println("print menu create");
		getMenuInflater().inflate(R.menu.main, menu);
		Log.d("FirstActivity", "menu create");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
			case R.id.add_item:
				Toast.makeText(FirstActivity.this, "you clicked add", Toast.LENGTH_SHORT);
				break;
				
			case R.id.remove_item:
				Toast.makeText(FirstActivity.this, "you clicked remove", Toast.LENGTH_SHORT);
				break;
			default:
		}
		return true;
	}
}
