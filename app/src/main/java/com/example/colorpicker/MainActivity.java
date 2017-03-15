package com.example.colorpicker;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
  //b4  b44
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ScrollView scrollView = (ScrollView)findViewById(R.id.scrollview);
		LinearLayout innerLayout = (LinearLayout)findViewById(R.id.inner_layout);
		
//		innerLayout.setBackgroundColor(R.color.color_blue_cyan);
//		scrollView.setBackgroundColor(R.color.game_bg_blue);
		
		LinearLayout.LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
	layoutParams.topMargin = 20;
		
		Utils utils = new Utils(this);
		
		for (int i = 0 ; i <22 ; i++){
			CustomTextView textView = new CustomTextView(this);
			textView.setLayoutParams(layoutParams);
			textView.setTextSize(40);
			
			textView.setBackgroundColor(getResources().getColor(Utils.COLOR_RES[i]));
			textView.setText(Utils.COLOR_RES_NAME[i]);
			textView.setTextColor(getResources().getColor (R.color.white_text) );
			innerLayout.addView(textView, i);
		}

//		scrollView.addView(innerLayout);
	}
}
