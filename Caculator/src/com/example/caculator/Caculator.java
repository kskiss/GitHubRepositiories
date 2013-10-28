package com.example.caculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.example.views.MyButton;

public class Caculator extends Activity implements OnClickListener {
	
	private String[] string = new String[]{"0","1","2","3","4","5","6","7","8","9","+","-","*","%"};
	private MyButton[] mBtns = new MyButton[20];
	private EditText mDisplayEditText = null;

	private double resultNumber = 0.0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_caculator);
		mDisplayEditText = (EditText)findViewById(R.id.editText);

		mBtns[0]=(MyButton)findViewById(R.id.clearButton);
		mBtns[1]=(MyButton)findViewById(R.id.divButton);
		mBtns[1].tag=13;
		mBtns[2]=(MyButton)findViewById(R.id.multiplyButton);
		mBtns[2].tag=12;
		mBtns[3]=(MyButton)findViewById(R.id.deleteButton);
		mBtns[4]=(MyButton)findViewById(R.id.sevenButton);
		mBtns[4].tag=7;
		mBtns[5]=(MyButton)findViewById(R.id.eightButton);
		mBtns[5].tag=8;
		mBtns[6]=(MyButton)findViewById(R.id.nineButton);
		mBtns[6].tag=9;
		mBtns[7]=(MyButton)findViewById(R.id.minusButton);
		mBtns[7].tag=11;
		mBtns[8]=(MyButton)findViewById(R.id.fourButton);
		mBtns[8].tag=4;
		mBtns[9]=(MyButton)findViewById(R.id.fiveButton);
		mBtns[9].tag=5;
		mBtns[10]=(MyButton)findViewById(R.id.sixButton);
		mBtns[10].tag=6;
		mBtns[11]=(MyButton)findViewById(R.id.plusButton);
		mBtns[11].tag=10;
		mBtns[12]=(MyButton)findViewById(R.id.oneButton);
		mBtns[12].tag=1;
		mBtns[13]=(MyButton)findViewById(R.id.twoButton);
		mBtns[13].tag=2;
		mBtns[14]=(MyButton)findViewById(R.id.threeButton);
		mBtns[14].tag=3;
		mBtns[15]=(MyButton)findViewById(R.id.parenButton);
		mBtns[16]=(MyButton)findViewById(R.id.zeroButton);
		mBtns[16].tag=0;
		mBtns[17]=(MyButton)findViewById(R.id.pointButton);
		mBtns[18]=(MyButton)findViewById(R.id.plus_minusButton);
		mBtns[19]=(MyButton)findViewById(R.id.equalButton);
		
		for(int i=0;i<mBtns.length;i++) {
			mBtns[i].setOnClickListener(this);
		}
	}
	@Override
	public void onClick(View v) {
		
		if (v==mBtns[0]) {
			
		} else if (v==mBtns[1]) {
			
		} else if(v==mBtns[2]) {
			
		} else if(v==mBtns[3]) {
			
		} else if(v==mBtns[4]) {
			
		} else if(v==mBtns[5]) {
			
		} else if(v==mBtns[6]) {
			
		} else if(v==mBtns[7]) {
			
		} else if(v==mBtns[8]) {
			
		} else if(v==mBtns[9]) {
			
		} else if(v==mBtns[10]) {
			
		} else if(v==mBtns[11]) {
			
		} else if(v==mBtns[12]) {
			
		} else if(v==mBtns[13]) {
			
		} else if(v==mBtns[14]) {
			
		} else if(v==mBtns[15]) {
			
		} else if(v==mBtns[16]) {
			
		} else if(v==mBtns[17]) {
			
		} else if(v==mBtns[18]) {
			
		} else {
			
		}	
	}
		
}
	
	



