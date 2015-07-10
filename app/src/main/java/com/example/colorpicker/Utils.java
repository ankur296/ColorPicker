package com.example.colorpicker;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.DisplayMetrics;

public class Utils {

	//TODO: Move this shit to utils class
	//TODO: add more colors
	public static final int[] COLOR_RES = {
		R.color.color_red,//0
		
		R.color.color_pink_cancer,
		R.color.color_pink_light,
		R.color.color_pink_faint,
		
		R.color.color_purple_light,
		
		R.color.color_blue,//5
		R.color.color_blue_cyan, 
		R.color.color_blue_dark, 
		R.color.color_blue_indigo, 
		R.color.color_blue_indigo_faint,
		R.color.color_blue_lighter,
		
		R.color.color_green_bright, //11
		R.color.color_green_faint, 
		R.color.color_green_light,
		R.color.color_green_teal,
		R.color.color_green_teal_dull,
		
		R.color.color_yellow_amber,//16
		R.color.color_yellow_amber_dull,
		R.color.color_yellow_dull,
		
		R.color.color_orange_dull,
		R.color.color_orange_faint,
		
		R.color.color_brown//21
	};
	
	public static final String[] COLOR_RES_NAME = {
		"red",//0
		
		"pink_cancer",
		"pink_light",
		"pink_faint",
		
		"purple_light",
		
		"blue",//5
		"blue_cyan", 
		"blue_dark", 
		"blue_indigo", 
		"blue_indigo_faint",
		"blue_lighter",
		
		"green_bright", //11
		"green_faint", 
		"green_light",
		"green_teal",
		"green_teal_dull",
		
		"yellow_amber",//16
		"yellow_amber_dull",
		"yellow_dull",
		
		"orange_dull",
		"orange_faint",
		
		"brown"//21
		};
	
	private static final int[] COLOR_RES_SMALL = {
		R.color.color_blue_lighter,//33
		R.color.color_blue_lighter,//33
		R.color.color_blue_lighter,//33

	};

	//tbd
	//	R.color.color_orange_deep,

	//orig gud
	//	R.color.color_blue_metallic,
	//	R.color.color_pink_cancer,
	//	R.color.color_green_light,
	//	R.color.color_yellow_amber_dull//7

	//med gud
	//	R.color.color_orange_dull,
	//	R.color.color_blue,
	//	R.color.color_pink_magenta,
	//		R.color.color_brown//47


	//new gud
	//	R.color.color_blue_lighter,//33
	//		R.color.color_orange_faint,
	//	R.color.color_pink_light,


	public static final int SDK_VERSION = Build.VERSION.SDK_INT;
	private Context context;
	Utils (Context context){
		this.context = context;
	}


	public int getRandomColorSmall(){
		return context.getResources().getColor(COLOR_RES_SMALL[(int) (Math.random() * (4 - 0)) + 0] );
	}

	public  int getRandomColor(){
		return context.getResources().getColor(COLOR_RES[(int) (Math.random() * (48 - 0)) + 0] );
	}

	public  int getRandomColorCode(){
		return ( (int) (Math.random() * (48 - 0)) );
	}
	
	public static Typeface getFont(Context paramContext)
	{
		return Typeface.createFromAsset(paramContext.getResources().getAssets(), "coolstory regular.ttf");//"CooperHewitt-Semibold.otf");
	}

	public static Typeface getFontMenu(Context paramContext)
	{
		return Typeface.createFromAsset(paramContext.getResources().getAssets(), "coolstory regular.ttf");//CooperHewitt-Semibold.otf");
	}

	public int getSizeInPixels(int dp){
		return (int) ( (dp * context.getResources().getDisplayMetrics().density)  + 0.5f) ; 
	}



	public int getSizeInDp(float px){
		DisplayMetrics metrics = context.getResources().getDisplayMetrics();
		return (int) (px / (metrics.densityDpi / 160f) );
	}

}
