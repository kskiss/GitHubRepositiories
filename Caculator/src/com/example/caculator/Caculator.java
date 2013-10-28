package com.example.caculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.example.views.MyButton;

public class Caculator extends Activity implements OnClickListener {
	
	private String[] string = new String[]{"0","1","2","3","4","5","6","7","8","9","+","-","*","%"};
	private MyButton[] mBtn = new MyButton[20];
	private EditText mDisplayEditText = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caculator);
		mDisplayEditText = (EditText)findViewById(R.id.editText);

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
		
		for(int i=0;i<mBtn.length;i++) {
			mBtn[i].setOnClickListener(this);
		}
	}
	@Override
	public void onClick(View v) {
		
		if (v==mBtn[0]) {
			
		} else if (v==mBtn[1]) {
			
		} else if(v==mBtn[2]) {
			
		} else if(v==mBtn[3]) {
			
		} else if(v==mBtn[4]) {
			
		} else if(v==mBtn[5]) {
			
		} else if(v==mBtn[6]) {
			
		} else if(v==mBtn[7]) {
			
		} else if(v==mBtn[8]) {
			
		} else if(v==mBtn[9]) {
			
		} else if(v==mBtn[10]) {
			
		} else if(v==mBtn[11]) {
			
		} else if(v==mBtn[12]) {
			
		} else if(v==mBtn[13]) {
			
		} else if(v==mBtn[14]) {
			
		} else if(v==mBtn[15]) {
			
		} else if(v==mBtn[16]) {
			
		} else if(v==mBtn[17]) {
			
		} else if(v==mBtn[18]) {
			
		} else {
			
		}	
	}
		
}
	
	



