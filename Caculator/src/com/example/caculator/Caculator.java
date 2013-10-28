package com.example.caculator;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import com.example.views.MyButton;

public class Caculator extends Activity implements OnClickListener{
	//private static final String TAG="TestEvent";
	String []string=new String[]{"0","1","2","3","4","5","6","7","8","9","+","-","*","%"};
	//string[]={"1","2"};
	MyButton[] mBtn=new MyButton[20];

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caculator);
		final EditText editText=(EditText)findViewById(R.id.editText);
	
	

	mBtn[0]=(MyButton)findViewById(R.id.clearButton);
	mBtn[1]=(MyButton)findViewById(R.id.divButton);
	mBtn[1].tag=13;
	mBtn[2]=(MyButton)findViewById(R.id.multiplyButton);
	mBtn[2].tag=12;
	mBtn[3]=(MyButton)findViewById(R.id.deleteButton);
	mBtn[4]=(MyButton)findViewById(R.id.sevenButton);
	mBtn[4].tag=7;
	mBtn[5]=(MyButton)findViewById(R.id.eightButton);
	mBtn[5].tag=8;
	mBtn[6]=(MyButton)findViewById(R.id.nineButton);
	mBtn[6].tag=9;
	mBtn[7]=(MyButton)findViewById(R.id.minusButton);
	mBtn[7].tag=11;
	mBtn[8]=(MyButton)findViewById(R.id.fourButton);
	mBtn[8].tag=4;
	mBtn[9]=(MyButton)findViewById(R.id.fiveButton);
	mBtn[9].tag=5;
	mBtn[10]=(MyButton)findViewById(R.id.sixButton);
	mBtn[10].tag=6;
	mBtn[11]=(MyButton)findViewById(R.id.plusButton);
	mBtn[11].tag=10;
	mBtn[12]=(MyButton)findViewById(R.id.oneButton);
	mBtn[12].tag=1;
	mBtn[13]=(MyButton)findViewById(R.id.twoButton);
	mBtn[13].tag=2;
	mBtn[14]=(MyButton)findViewById(R.id.threeButton);
	mBtn[14].tag=3;
	mBtn[15]=(MyButton)findViewById(R.id.parenButton);
	mBtn[16]=(MyButton)findViewById(R.id.zeroButton);
	mBtn[16].tag=0;
	mBtn[17]=(MyButton)findViewById(R.id.pointButton);
	mBtn[18]=(MyButton)findViewById(R.id.plus_minusButton);
	mBtn[19]=(MyButton)findViewById(R.id.equalButton);
	
	for(int i=0;i<mBtn.length;i++){
		mBtn[i].setOnClickListener(this);}
		
				
	}


	

	@Override
	public void onClick(View v) {
		final EditText editText=(EditText)findViewById(R.id.editText);
		// TODO Auto-generated method stub
		//for(int a;a<mBtn.length;a++)
		if (v==mBtn[0]){
			Log.d("TAG","点击了清除按钮");
			editText.setText(((Button)v).getText());
			
		}
		//else {
		else if (v==mBtn[1]){
				Log.d("TAG","点击了除法按钮");
				editText.setText(((MyButton)v).getText());
			//}
			
		}
		else if(v==mBtn[2]){
			Log.d("TAG","点击了乘法按钮");
			editText.setText(((MyButton)v).getText());
		}
		else if(v==mBtn[3]){
			Log.d("TAG","点击了删除按钮");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[4]){
			Log.d("TAG","7");
			editText.setText(((MyButton)v).getText());
			
		}
		
		else if(v==mBtn[5]){
			Log.d("TAG","8");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[6]){
			Log.d("TAG","9");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[7]){
			Log.d("TAG","点击了减法");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[8]){
			Log.d("TAG","4");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[9]){
			Log.d("TAG","5");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[10]){
			Log.d("TAG","6");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[11]){
			Log.d("TAG","点击了加法");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[12]){
			Log.d("TAG","1");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[13]){
			Log.d("TAG","2");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[14]){
			Log.d("TAG","3");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[15]){
			Log.d("TAG","括号");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[16]){
			Log.d("TAG","0");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[17]){
			Log.d("TAG","点");
			editText.setText(((MyButton)v).getText());
			
		}
		else if(v==mBtn[18]){
			Log.d("TAG","正负");
			editText.setText(((MyButton)v).getText());
			
		}
		else{
			Log.d("TAG","=");
			editText.setText(((MyButton)v).getText());
			
		}
		
		
			
		
		
		
		
			
		}
	
		
	
	
		
	}
	
	



